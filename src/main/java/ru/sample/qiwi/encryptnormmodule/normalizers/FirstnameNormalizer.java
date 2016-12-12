//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class FirstnameNormalizer extends NameNormalizer {
    public FirstnameNormalizer() {
    }

    public List<String> normalize(String str) {
        str = (String)super.normalize(str).get(0);
        return Arrays.asList(new String[]{str, fnm_reduce(str), str.length() == 0?"":fnm_reduce(str) + 'Л'});
    }
}
