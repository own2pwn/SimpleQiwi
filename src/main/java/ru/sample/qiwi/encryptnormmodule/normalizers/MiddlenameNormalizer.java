//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class MiddlenameNormalizer extends NameNormalizer {
    public MiddlenameNormalizer() {
    }

    public List<String> normalize(String str) {
        str = (String)super.normalize(str).get(0);
        return Arrays.asList(new String[]{str, mnm_reduce(str), fnm_reduce(mnm_reduce2(str))});
    }
}
