//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.batch;

import ru.sample.qiwi.encryptnormmodule.WriterWrapper;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

public class SimpleXmlWriter {
    private WriterWrapper w;
    private Stack<Tag> tags = new Stack();
    private Stack<String> pathes = new Stack();
    public String path;
    private boolean isText = false;
    private static final Pattern PAT_AMP = Pattern.compile("&");
    private static final Pattern PAT_LT = Pattern.compile("<");
    private static final Pattern PAT_GT = Pattern.compile(">");
    private static final Pattern PAT_QUOT = Pattern.compile("\"");
    private static final Pattern PAT_APOS = Pattern.compile("\'");

    public SimpleXmlWriter(WriterWrapper writer) {
        this.w = writer;
    }

    private static SimpleXmlWriter.Tag tag(String tagName, String path) {
        return new SimpleXmlWriter.Tag(tagName, path);
    }

    public SimpleXmlWriter o(String tagName) throws IOException {
        if(this.isText) {
            throw new RuntimeException("Invalid structure: must be enclosing tag named \'" + this.tags.get(this.tags.size() - 1) + "\'!");
        } else {
            this.path = (!this.pathes.isEmpty()?(String)this.pathes.get(this.pathes.size() - 1) + ".":"") + tagName;
            this.tags.push(tag(tagName, this.path));
            if(!tagName.equals("Applications")) {
                this.pathes.push(this.path);
            }

            return this;
        }
    }

    public SimpleXmlWriter a(String text) throws IOException {
        if(text.length() > 0) {
            Iterator i$ = this.tags.iterator();

            while(i$.hasNext()) {
                SimpleXmlWriter.Tag tag = (SimpleXmlWriter.Tag)i$.next();
                if(!tag.opened) {
                    this.w.append("<").append(tag).append(">");
                    tag.opened = true;
                    this.w.registerPath(tag.path);
                }
            }

            this.writeQuoted(this.w, text);
            this.w.registerValue(text);
        }

        this.isText = true;
        return this;
    }

    public SimpleXmlWriter f() throws IOException {
        this.isText = false;
        SimpleXmlWriter.Tag last = (SimpleXmlWriter.Tag)this.tags.pop();
        if(last.opened) {
            this.w.append("</").append(last).append(">\r\n");
        }

        if(!this.pathes.isEmpty()) {
            this.pathes.pop();
        }

        return this;
    }

    public void finish() throws IOException {
        while(!this.tags.isEmpty()) {
            this.f();
        }

        this.w.flush();
        this.w.close();
    }

    public static String quoteXml(String str) {
        if(str == null) {
            return "";
        } else {
            String res = PAT_AMP.matcher(str).replaceAll("&amp;");
            res = PAT_LT.matcher(res).replaceAll("&lt;");
            res = PAT_GT.matcher(res).replaceAll("&gt;");
            res = PAT_QUOT.matcher(res).replaceAll("&quot;");
            res = PAT_APOS.matcher(res).replaceAll("&apos;");
            return res;
        }
    }

    private void writeQuoted(Writer writer, String text) throws IOException {
        if(text != null) {
            int start = 0;

            for(int i = 0; i < text.length(); ++i) {
                switch(text.charAt(i)) {
                    case '\"':
                        if(start < i) {
                            writer.write(text.substring(start, i));
                        }

                        start = i + 1;
                        writer.write("&quot;");
                        break;
                    case '&':
                        if(start < i) {
                            writer.write(text.substring(start, i));
                        }

                        start = i + 1;
                        writer.write("&amp;");
                        break;
                    case '\'':
                        if(start < i) {
                            writer.write(text.substring(start, i));
                        }

                        start = i + 1;
                        writer.write("&apos;");
                        break;
                    case '<':
                        if(start < i) {
                            writer.write(text.substring(start, i));
                        }

                        start = i + 1;
                        writer.write("&lt;");
                        break;
                    case '>':
                        if(start < i) {
                            writer.write(text.substring(start, i));
                        }

                        start = i + 1;
                        writer.write("&gt;");
                }
            }

            if(start < text.length()) {
                writer.write(text.substring(start));
            }

        }
    }

    private static class Tag implements CharSequence {
        String tag;
        boolean opened;
        String path;

        private Tag(String tag, String path) {
            this.tag = tag;
            this.path = path;
            this.opened = false;
        }

        public int length() {
            return this.tag.length();
        }

        public char charAt(int index) {
            return this.tag.charAt(index);
        }

        public CharSequence subSequence(int start, int end) {
            return this.tag.subSequence(start, end);
        }

        public String toString() {
            return this.tag;
        }
    }
}
