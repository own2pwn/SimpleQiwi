//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class SurnamesNormalizer extends AddressNormalizer {
    public SurnamesNormalizer() {
    }

    public List<String> normalize(String str) {
        str = (String)super.normalize(str).get(0);
        return Arrays.asList(new String[]{str, lnm_reduce(str)});
    }

    private static String lnm_reduce(String lnm) {
        return lnm.endsWith("А")?lnm.substring(0, lnm.length() - 1):lnm;
    }
}
