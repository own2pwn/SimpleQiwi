//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WriterWrapper extends Writer {
    private StringWriter stringWriter;
    protected List<String[]> applicationPathes = new ArrayList();
    protected IErrorsListener errorsListener;
    private OrderedBlockingQueue<XmlFragment> saveQueue;

    public WriterWrapper(IErrorsListener errorsListener, OrderedBlockingQueue<XmlFragment> saveQueue) {
        this.errorsListener = errorsListener;
        this.saveQueue = saveQueue;
        this.newWriter();
        this.applicationPathes.add(new String[]{"", null});
    }

    private void newWriter() {
        this.stringWriter = new StringWriter();
    }

    public void write(char[] cbuf, int off, int len) {
        this.stringWriter.write(cbuf, off, len);
    }

    public void endApplication(int order) {
        try {
            if(Hash.validator.valid(this.applicationPathes, this.errorsListener)) {
                this.stringWriter.flush();
                String e = this.stringWriter.toString();
                this.saveQueue.put(new XmlFragment(order, e), order);
            } else {
                this.saveQueue.put(new XmlFragment(order, ""), order);
            }
        } catch (InterruptedException var3) {
            throw new RuntimeException(var3);
        }

        this.stringWriter = new StringWriter();
        this.applicationPathes.clear();
        this.applicationPathes.add(new String[]{"", null});
    }

    public void flush() {
    }

    public void close() {
    }

    public void registerPath(String pathStr) {
        this.applicationPathes.add(new String[]{pathStr, null});
    }

    public void registerValue(String value) {
        ((String[])this.applicationPathes.get(this.applicationPathes.size() - 1))[1] = value;
    }
}
