//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

public abstract class XmlSeparatorAndEmptyTagsRemover {
    private Stack<String> tags = new Stack();
    private Stack<BooleanHolder> isContainer = new Stack();
    private Stack<BooleanHolder> hasNonEmptyTag = new Stack();
    private int fragmentStartedLevel = 0;

    public XmlSeparatorAndEmptyTagsRemover() {
    }

    public void parse(InputSource inputSource) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory spfactory = SAXParserFactory.newInstance();
        SAXParser saxParser = spfactory.newSAXParser();
        this.isContainer.push(new XmlSeparatorAndEmptyTagsRemover.BooleanHolder());
        this.hasNonEmptyTag.push(new XmlSeparatorAndEmptyTagsRemover.BooleanHolder());
        saxParser.parse(inputSource, new XmlSeparatorAndEmptyTagsRemover.MyDefaultHandler());
    }

    protected boolean isFragmentStarted(Stack<String> tags) {
        return tags.size() == 2;
    }

    protected abstract void processFragment(String var1) throws SAXException;

    public static void quoteXml(String str, Appendable sb) {
        try {
            int e = str.length();

            for(int i = 0; i < e; ++i) {
                char ch = str.charAt(i);
                switch(ch) {
                    case '\"':
                        sb.append("&quot;");
                        break;
                    case '&':
                        sb.append("&amp;");
                        break;
                    case '\'':
                        sb.append("&apos;");
                        break;
                    case '<':
                        sb.append("&lt;");
                        break;
                    case '>':
                        sb.append("&gt;");
                        break;
                    default:
                        sb.append(ch);
                }
            }

        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
    }

    private void quoteXml(char[] chars, int start, int end, StringBuilder sb) {
        int start2 = start;

        for(int i = start; i < end; ++i) {
            switch(chars[i]) {
                case '\"':
                    sb.append(chars, start2, i - start2);
                    start2 = i + 1;
                    sb.append("&quot;");
                    break;
                case '&':
                    sb.append(chars, start2, i - start2);
                    start2 = i + 1;
                    sb.append("&amp;");
                    break;
                case '\'':
                    sb.append(chars, start2, i - start2);
                    start2 = i + 1;
                    sb.append("&apos;");
                    break;
                case '<':
                    sb.append(chars, start2, i - start2);
                    start2 = i + 1;
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append(chars, start2, i - start2);
                    start2 = i + 1;
                    sb.append("&gt;");
            }
        }

        sb.append(chars, start2, end - start2);
    }

    private class MyDefaultHandler extends DefaultHandler {
        private boolean hasValue;
        private Stack<StringBuilder> fragments;
        private StringBuilder currentFragment;

        private MyDefaultHandler() {
            this.hasValue = false;
            this.fragments = new Stack();
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            ((XmlSeparatorAndEmptyTagsRemover.BooleanHolder)XmlSeparatorAndEmptyTagsRemover.this.isContainer.lastElement()).value = true;
            this.hasValue = false;
            XmlSeparatorAndEmptyTagsRemover.this.isContainer.push(new XmlSeparatorAndEmptyTagsRemover.BooleanHolder());
            XmlSeparatorAndEmptyTagsRemover.this.hasNonEmptyTag.push(new XmlSeparatorAndEmptyTagsRemover.BooleanHolder());
            XmlSeparatorAndEmptyTagsRemover.this.tags.push(qName);
            this.currentFragment = new StringBuilder();
            this.fragments.push(this.currentFragment);
            if(XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel == 0 && XmlSeparatorAndEmptyTagsRemover.this.isFragmentStarted(XmlSeparatorAndEmptyTagsRemover.this.tags)) {
                XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel = XmlSeparatorAndEmptyTagsRemover.this.tags.size();
            }

            if(XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel > 0) {
                int attributesLength = attributes.getLength();
                if(attributesLength != 0) {
                    this.currentFragment.append("<").append(qName).append(" ");

                    for(int i = 0; i < attributesLength; ++i) {
                        String attributesName = attributes.getQName(i);
                        String attributesValue = attributes.getValue(attributesName);
                        this.currentFragment.append(attributesName).append("=").append("\"");
                        XmlSeparatorAndEmptyTagsRemover.quoteXml(attributesValue, this.currentFragment);
                        this.currentFragment.append("\"");
                        if(i < attributesLength - 1) {
                            this.currentFragment.append(" ");
                        }
                    }

                    this.currentFragment.append(">");
                } else {
                    this.currentFragment.append("<").append(qName).append(">");
                }
            }

        }

        public void characters(char[] ch, int start, int length) throws SAXException {
            if(XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel > 0) {
                if(length > 0) {
                    this.hasValue = true;
                }

                XmlSeparatorAndEmptyTagsRemover.this.quoteXml(ch, start, start + length, this.currentFragment);
            }

        }

        public void endElement(String uri, String localName, String qName) throws SAXException {
            XmlSeparatorAndEmptyTagsRemover.this.tags.pop();
            if(XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel > 0) {
                this.currentFragment.append("</").append(qName).append(">");
            }

            this.fragments.pop();
            Boolean hasCurrentNonEmptyTag = Boolean.valueOf(((XmlSeparatorAndEmptyTagsRemover.BooleanHolder)XmlSeparatorAndEmptyTagsRemover.this.hasNonEmptyTag.pop()).value);
            Boolean isCurrentContainer = Boolean.valueOf(((XmlSeparatorAndEmptyTagsRemover.BooleanHolder)XmlSeparatorAndEmptyTagsRemover.this.isContainer.pop()).value);
            if(isCurrentContainer.booleanValue() && hasCurrentNonEmptyTag.booleanValue() && this.fragments.size() > 0) {
                ((StringBuilder)this.fragments.lastElement()).append(this.currentFragment);
            } else if(!isCurrentContainer.booleanValue() && this.hasValue) {
                XmlSeparatorAndEmptyTagsRemover.BooleanHolder holder;
                for(Iterator i$ = XmlSeparatorAndEmptyTagsRemover.this.hasNonEmptyTag.iterator(); i$.hasNext(); holder.value = true) {
                    holder = (XmlSeparatorAndEmptyTagsRemover.BooleanHolder)i$.next();
                }

                ((StringBuilder)this.fragments.lastElement()).append(this.currentFragment);
            }

            if(!this.fragments.isEmpty()) {
                this.currentFragment = (StringBuilder)this.fragments.lastElement();
            }

            if(XmlSeparatorAndEmptyTagsRemover.this.tags.size() < XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel) {
                XmlSeparatorAndEmptyTagsRemover.this.processFragment(this.currentFragment.toString());
                this.currentFragment.setLength(0);
                XmlSeparatorAndEmptyTagsRemover.this.fragmentStartedLevel = 0;
            }

        }
    }

    private static class BooleanHolder {
        boolean value;

        private BooleanHolder() {
        }
    }
}
