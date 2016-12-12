//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule;

import java.io.IOException;

public class SingleWriter {
    private String memberCode;
    private int NN = 0;
    private long maxSize;
    public String resultXML;

    public SingleWriter(String memberCode, int maxSize) throws IOException {
        this.memberCode = memberCode;
        this.maxSize = (long)maxSize * 1024L * 1024L;
        this.newWriter();
    }

    private void newWriter() throws IOException {
        resultXML = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n<Applications>\n";
    }

    private String wrapZeros() {
        return (this.NN < 10?"0":"") + this.NN;
    }

    public void write(String xml) throws IOException {
        resultXML += xml;
    }

    public void flush() throws IOException {
    }

    public void close() throws IOException {
        resultXML += "</Applications>";
    }
}
