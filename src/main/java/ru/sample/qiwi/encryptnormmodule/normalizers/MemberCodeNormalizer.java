//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemberCodeNormalizer extends NbchNormalizer {
    public MemberCodeNormalizer() {
    }

    public List<String> normalize(String str) {
        return (str != null) ? (Arrays.asList(new String[]{str.trim().toUpperCase()})) : ((List)Collections.emptyList());
    }
}
