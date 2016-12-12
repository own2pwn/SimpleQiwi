//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import ru.CryptoPro.JCP.JCP;
import ru.sample.qiwi.encryptnormmodule.OrderedBlockingQueue.Handler;
import ru.sample.qiwi.encryptnormmodule.normalizers.*;
import ru.sample.qiwi.encryptnormmodule.validation.CommonUpdateValidator;
import ru.sample.qiwi.encryptnormmodule.validation.CommonValidator;
import ru.sample.qiwi.encryptnormmodule.validation.IValidator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Hash {
    static final String VERSION = "1.2/2014.05.30";
    public static IValidator validator = new CommonValidator();
    public static final IErrorsListener ERRORS_LISTENER = new Hash.XmlErrorsListener();
    static boolean useCache;
    static MessageDigest singleMessageDigest;
    public static final SurnamesNormalizer surnameNormalizer;
    public static final MiddlenameNormalizer middlenameNormalizer;
    public static final FirstnameNormalizer firstnameNormalizer;
    public static final DatesNormalizer datesNormalizer;
    public static final AddressNormalizer addressNormalizer;
    public static final NumbersNormalizer numbersNormalizer;
    public static final DocsNormalizer docsNormalizer;
    public static final PhonesNormalizer phonesNormalizer;
    public static final EmailsNormalizer emailsNormalizer;
    public static final DocsEnNormalizer docsEnNormalizer;
    public static final MemberCodeNormalizer memberCodeNormalizer;
    static final Map<String, NbchNormalizer> pathNormalizers;
    static final List<String> hashPathes;
    private static final Map<String, String> hashCache;
    static final Set<String> cachePathes;

    public Hash() {
    }

    public static String run(String inputData, String memberCode) throws NoSuchAlgorithmException, IOException, SAXException, ParserConfigurationException, InterruptedException {
        // Входные параметры
        memberCode = "0000XX010000";
        int maxSize = 500;
        useCache = false;
        validator = new CommonValidator();

        // Нормализация и хеширование
        String result = hashXml(new InputSource(new StringReader(inputData)), memberCode, maxSize, new Hash.XmlErrorsListener());

        return result;
    }

    public static void hashXml(InputSource inputSource, Writer writer, String memberCode, IErrorsListener errorsListener) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(inputSource, new Hash.XmlHandler(new Hash.SingleWriterWrapper(errorsListener, writer), errorsListener, singleMessageDigest, memberCode, 0));
    }

    public static List<String> hashXml(String xml, final Writer writer, final String memberCode, boolean update) throws ParserConfigurationException, SAXException, IOException {
        final ArrayList errors = new ArrayList();
        if(update) {
            validator = new CommonUpdateValidator();
        } else {
            validator = new CommonValidator();
        }

        XmlSeparatorAndEmptyTagsRemover xmlSeparator = new XmlSeparatorAndEmptyTagsRemover() {
            protected void processFragment(String xml) throws SAXException {
                try {
                    Hash.hashXml(new InputSource(new StringReader(xml)), writer, memberCode, new IErrorsListener() {
                        public void registerError(String error, String path, Exception cause) {
                            errors.add(error + " at " + path);
                        }

                        public void setId(String id) {
                        }
                    });
                } catch (Exception var3) {
                    throw new RuntimeException(var3);
                }
            }
        };
        xmlSeparator.parse(new InputSource(new StringReader("<Applications>" + xml + "</Applications>")));
        return errors;
    }

    public static synchronized List<String> hashXml(String xml, Writer writer, String memberCode) throws ParserConfigurationException, SAXException, IOException {
        return hashXml(xml, writer, memberCode, false);
    }

    public static String hashXml(InputSource inputSource, String memberCode, int maxSize, IErrorsListener errorsListener) throws SAXException, ParserConfigurationException, IOException, NoSuchAlgorithmException, InterruptedException {
        final SingleWriter writer = new SingleWriter(memberCode, maxSize);
        final LinkedBlockingQueue xmlQueue = new LinkedBlockingQueue(1000);
        XmlFragment stopObject = new XmlFragment(0, (String)null);
        final OrderedBlockingQueue saveQueue = new OrderedBlockingQueue(new Handler<XmlFragment>() {
            public void process(XmlFragment xmlFragment) {
                try {
                    writer.write(xmlFragment.xml);
                } catch (IOException var3) {
                    throw new RuntimeException(var3);
                }
            }
        }, stopObject);
        Thread saveQueueThread = new Thread(saveQueue);
        saveQueueThread.start();
        AtomicInteger ai = new AtomicInteger();

        for(int xmlSeparator = 0; xmlSeparator < Runtime.getRuntime().availableProcessors(); ++xmlSeparator) {
            ai.incrementAndGet();
            (new Thread(new Hash.XmlThread(xmlQueue, errorsListener, memberCode, ai, saveQueue))).start();
        }

        XmlSeparatorAndEmptyTagsRemover var11 = new XmlSeparatorAndEmptyTagsRemover() {
            int order = 0;

            protected void processFragment(String xml) throws SAXException {
                try {
                    saveQueue.semaphore.acquire();
                    xmlQueue.put(new XmlFragment(this.order++, xml));
                    if(this.order % '썐' == 0) {
                        System.out.println(this.order + " fragments processed...");
                    }

                } catch (InterruptedException var3) {
                    throw new RuntimeException(var3);
                }
            }
        };
        var11.parse(inputSource);
        xmlQueue.put(stopObject);

        while(ai.get() > 0) {
            Thread.sleep(100L);
        }

        saveQueue.put(stopObject, -1);
        saveQueueThread.join();
        writer.flush();
        writer.close();

        return writer.resultXML;
    }

    public static List<String> processValue(String str, String pathStr, MessageDigest messageDigest, String memberCode) {
        ArrayList normalizedList = new ArrayList();
        boolean doHash = doHash(pathStr);
        NbchNormalizer normalizer = getNormalizer(pathStr);
        if(normalizer != null) {
            List _normalizedList = normalizer.normalize(str);
            if(doHash) {
                Iterator i$ = _normalizedList.iterator();

                while(i$.hasNext()) {
                    String _normalized = (String)i$.next();
                    normalizedList.add(hash(pathStr, _normalized, messageDigest));
                }
            } else {
                if(pathStr.equals("memberCode") || pathStr.endsWith(".memberCode")) {
                    _normalizedList = Arrays.asList(new String[]{memberCode});
                }

                normalizedList.addAll(_normalizedList);
            }
        } else {
            if((pathStr.equals("memberCode") || pathStr.endsWith(".memberCode")) && str.trim().length() == 0) {
                str = memberCode;
            }

            normalizedList.add(str);
        }

        return normalizedList;
    }

    static NbchNormalizer getNormalizer(String pathStr) {
        return (NbchNormalizer)pathNormalizers.get(pathStr);
    }

    static String getPathStr(Stack<String> path) {
        StringBuilder pathStr = new StringBuilder();

        String pathItem;
        for(Iterator _path = path.iterator(); _path.hasNext(); pathStr.append(pathItem)) {
            pathItem = (String)_path.next();
            if(pathStr.length() > 0) {
                pathStr.append(".");
            }
        }

        String _path1 = pathStr.toString();
        if(_path1.startsWith("Applications.")) {
            _path1 = _path1.substring("Applications.".length());
        }

        return _path1;
    }

    static boolean doHash(String pathStr) {
        return hashPathes.contains(pathStr);
    }

    private static boolean doCacheOn(String path) {
        return cachePathes.contains(path);
    }

    public static String hash(String pathStr, String str, MessageDigest messageDigest) {
        if(str != null && str.trim().length() != 0) {
            String cached = useCache && doCacheOn(pathStr)?(String)hashCache.get(str):null;
            if(cached != null) {
                return cached;
            } else {
                try {
                    byte[] e = messageDigest.digest(str.getBytes("utf-8"));
                    char[] fb = new char[64];

                    for(int i = 0; i < 32; ++i) {
                        fb[i * 2] = (char)(97 + ((e[i] & 255) >> 4));
                        fb[i * 2 + 1] = (char)(97 + (e[i] & 15));
                    }

                    cached = new String(fb);
                    if(useCache) {
                        hashCache.put(str, cached);
                    }

                    return cached;
                } catch (Exception var7) {
                    throw new RuntimeException(var7);
                }
            }
        } else {
            return "";
        }
    }

    static {
        Security.addProvider(new JCP());
        useCache = false;

        try {
            singleMessageDigest = MessageDigest.getInstance("GOST3411");
        } catch (NoSuchAlgorithmException var1) {
            var1.printStackTrace();
            System.exit(1);
        }

        surnameNormalizer = new SurnamesNormalizer();
        middlenameNormalizer = new MiddlenameNormalizer();
        firstnameNormalizer = new FirstnameNormalizer();
        datesNormalizer = new DatesNormalizer();
        addressNormalizer = new AddressNormalizer();
        numbersNormalizer = new NumbersNormalizer();
        docsNormalizer = new DocsNormalizer();
        phonesNormalizer = new PhonesNormalizer();
        emailsNormalizer = new EmailsNormalizer();
        docsEnNormalizer = new DocsEnNormalizer();
        memberCodeNormalizer = new MemberCodeNormalizer();
        pathNormalizers = new HashMap() {
            {
                this.put("Application.date", Hash.datesNormalizer);
                this.put("Application.requestDate", Hash.datesNormalizer);
                this.put("Application.memberCode", Hash.memberCodeNormalizer);
                this.put("Application.client.surname", Hash.surnameNormalizer);
                this.put("Application.client.firstname", Hash.firstnameNormalizer);
                this.put("Application.client.middlename", Hash.middlenameNormalizer);
                this.put("Application.client.birthdate", Hash.datesNormalizer);
                this.put("Application.client.prevSurname", Hash.surnameNormalizer);
                this.put("Application.client.prevFirstname", Hash.firstnameNormalizer);
                this.put("Application.client.prevMiddlename", Hash.middlenameNormalizer);
                this.put("Application.client.doc.seriesNumber", Hash.docsNormalizer);
                this.put("Application.client.doc.issueDate", Hash.datesNormalizer);
                this.put("Application.client.address.startDate", Hash.datesNormalizer);
                this.put("Application.client.phone.number", Hash.phonesNormalizer);
                this.put("Application.client.email.email", Hash.emailsNormalizer);
                this.put("Application.client.vehicle.regNum", Hash.docsNormalizer);
                this.put("Application.client.vehicle.VIN", Hash.docsEnNormalizer);
                this.put("Application.client.employer.inn", Hash.numbersNormalizer);
                this.put("Application.client.employer.phone.number", Hash.phonesNormalizer);
                this.put("Application.details.creditDate", Hash.datesNormalizer);
            }
        };
        hashPathes = new ArrayList(Arrays.asList(new String[]{"Application.client.surname", "Application.client.firstname", "Application.client.middlename", "Application.client.prevSurname", "Application.client.prevFirstname", "Application.client.prevMiddlename", "Application.client.doc.seriesNumber", "Application.client.phone.number", "Application.client.email.email", "Application.client.vehicle.regNum", "Application.client.vehicle.VIN", "Application.client.employer.inn", "Application.client.employer.phone.number"}));
        hashCache = new ConcurrentHashMap();
        cachePathes = new HashSet();
        Collections.addAll(cachePathes, new String[]{"Application.client.surname", "Application.client.firstname", "Application.client.middlename", "Application.client.prevSurname", "Application.client.prevFirstname", "Application.client.prevMiddlename"});
    }

    static class XmlHandler extends DefaultHandler {
        WriterWrapper writer;
        IErrorsListener errorsListener;
        MessageDigest messageDigest;
        String memberCode;
        int order;
        boolean newTag = false;
        StringBuilder sb = new StringBuilder();
        Stack<String> path = new Stack();
        boolean wasMemberCode;
        StringBuilder lastValue = new StringBuilder();

        XmlHandler(WriterWrapper writer, IErrorsListener errorsListener, MessageDigest messageDigest, String memberCode, int order) {
            this.writer = writer;
            this.errorsListener = errorsListener;
            this.messageDigest = messageDigest;
            this.memberCode = memberCode;
            this.order = order;
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            try {
                if(!this.isRootMemberCode(localName)) {
                    this.newTag = true;
                    this.sb.setLength(0);
                    boolean e = localName.equals("Applications");
                    if(!e) {
                        int attributesLength = attributes.getLength();
                        if(attributesLength == 0) {
                            this.writer.append("<").append(localName).append(">");
                        } else {
                            this.writer.append("<").append(qName).append(" ");

                            for(int i = 0; i < attributesLength; ++i) {
                                String attributesName = attributes.getQName(i);
                                String attributesValue = attributes.getValue(attributesName);
                                this.writer.append(attributesName).append("=").append("\"");
                                XmlSeparatorAndEmptyTagsRemover.quoteXml(attributesValue, this.writer);
                                this.writer.append("\"");
                                if(i < attributesLength - 1) {
                                    this.writer.append(" ");
                                }
                            }

                            this.writer.append(">");
                        }
                    }

                    this.path.push(localName);
                    if(!e) {
                        this.writer.registerPath(Hash.getPathStr(this.path));
                    }

                    this.lastValue = new StringBuilder();
                }

            } catch (IOException var10) {
                throw new SAXException(var10);
            }
        }

        private boolean isRootMemberCode(String localName) {
            return !this.path.isEmpty() && ((String)this.path.lastElement()).equals("Application") && localName.equals("memberCode");
        }

        public void characters(char[] ch, int start, int length) throws SAXException {
            if(this.newTag) {
                this.sb.append(ch, start, length);
                this.lastValue.append(ch, start, length);
            }

        }

        public void endElement(String uri, String localName, String qName) throws SAXException {
            try {
                if(!this.isRootMemberCode(localName)) {
                    if(this.lastValue.length() > 0) {
                        this.writer.registerValue(this.lastValue.toString());
                    }

                    if(this.newTag) {
                        String e = this.sb.toString();
                        String pathStr = Hash.getPathStr(this.path);
                        if(pathStr.endsWith("Application.id")) {
                            this.errorsListener.setId(e);
                        }

                        List normalizedList = Hash.processValue(e, pathStr, this.messageDigest, this.memberCode);
                        int i = 0;

                        for(int normalizedListSize = normalizedList.size(); i < normalizedListSize; ++i) {
                            if(i > 0) {
                                this.writer.write("<");
                                this.writer.write(localName);
                                this.writer.write("_" + i);
                                this.writer.write(62);
                            }

                            String normStr = (String)normalizedList.get(i);
                            XmlSeparatorAndEmptyTagsRemover.quoteXml(normStr, this.writer);
                            this.writer.write("</");
                            this.writer.write(localName);
                            if(i > 0) {
                                this.writer.write("_" + i);
                            }

                            this.writer.write(">\n");
                        }
                    } else if(!localName.equals("Applications")) {
                        if(localName.equals("Application")) {
                            this.writer.write("<memberCode>");
                            this.writer.write(this.memberCode);
                            this.writer.write("</memberCode>\r\n");
                        }

                        this.writer.write("</");
                        this.writer.write(localName);
                        this.writer.write(">\n");
                    }

                    this.path.pop();
                    this.newTag = false;
                    if(localName.equals("Application")) {
                        this.writer.endApplication(this.order);
                        this.errorsListener.setId("");
                        this.wasMemberCode = false;
                    }
                }

            } catch (IOException var10) {
                throw new SAXException(var10);
            }
        }

        public void error(SAXParseException e) throws SAXException {
            throw e;
        }
    }

    static class XmlThread implements Runnable {
        static final ThreadLocal<MessageDigest> messageDigest = new ThreadLocal() {
            protected MessageDigest initialValue() {
                try {
                    return MessageDigest.getInstance("GOST3411");
                } catch (NoSuchAlgorithmException var2) {
                    throw new RuntimeException(var2);
                }
            }
        };
        WriterWrapper writer;
        IErrorsListener errorsListener;
        String memberCode;
        BlockingQueue<XmlFragment> queue;
        AtomicInteger ai;

        XmlThread(BlockingQueue<XmlFragment> queue, IErrorsListener errorsListener, String memberCode, AtomicInteger ai, OrderedBlockingQueue<XmlFragment> saveQueue) {
            this.queue = queue;
            this.writer = new WriterWrapper(errorsListener, saveQueue);
            this.errorsListener = errorsListener;
            this.memberCode = memberCode;
            this.ai = ai;
        }

        public void run() {
            try {
                while(true) {
                    XmlFragment e = (XmlFragment)this.queue.take();
                    if(e.xml == null) {
                        this.queue.put(e);
                        return;
                    }

                    InputSource inputSource = new InputSource(new StringReader(e.xml));
                    SAXParserFactory spf = SAXParserFactory.newInstance();
                    spf.setNamespaceAware(true);
                    SAXParser saxParser = spf.newSAXParser();
                    saxParser.parse(inputSource, new Hash.XmlHandler(this.writer, this.errorsListener, (MessageDigest)messageDigest.get(), this.memberCode, e.order));
                }
            } catch (Exception var8) {
                throw new RuntimeException(var8);
            } finally {
                this.ai.decrementAndGet();
            }
        }
    }

    private static class SingleWriterWrapper extends WriterWrapper {
        private Writer writer;

        private SingleWriterWrapper(IErrorsListener errorsListener, Writer writer) {
            super(errorsListener, (OrderedBlockingQueue)null);
            this.writer = writer;
        }

        public void write(char[] cbuf, int off, int len) {
            try {
                this.writer.write(cbuf, off, len);
            } catch (IOException var5) {
                throw new RuntimeException(var5);
            }
        }

        public void endApplication(int order) {
            try {
                if(Hash.validator.valid(this.applicationPathes, this.errorsListener)) {
                    this.writer.flush();
                }
            } catch (Exception var3) {
                throw new RuntimeException(var3);
            }

            this.applicationPathes.clear();
            this.applicationPathes.add(new String[]{"", null});
        }
    }

    static class XmlErrorsListener implements IErrorsListener {
        ThreadLocal<String> id = new ThreadLocal();
        volatile boolean firstError = true;

        XmlErrorsListener() {
        }

        public void registerError(String error, String path, Exception cause) {
            if(this.firstError) {
                this.firstError = false;
                System.out.println("ApplicationId;ErrorText;ErrorPath;ErrorCause");
            }

            System.out.println((this.id != null?(String)this.id.get():"") + ";" + error + ";" + (path != null?path:"") + ";" + (cause != null?cause.getMessage():""));
        }

        public void setId(String id) {
            this.id.set(id);
        }
    }
}
