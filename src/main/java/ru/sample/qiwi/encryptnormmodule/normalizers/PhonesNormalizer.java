//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class PhonesNormalizer extends NumbersNormalizer {
    public PhonesNormalizer() {
    }

    public List<String> normalize(String str) {
        String normalized = (String)super.normalize(str).get(0);
        if(normalized.length() == 11 && (normalized.startsWith("7") || normalized.startsWith("8"))) {
            normalized = normalized.substring(1);
        }

        return Arrays.asList(new String[]{normalized});
    }
}
