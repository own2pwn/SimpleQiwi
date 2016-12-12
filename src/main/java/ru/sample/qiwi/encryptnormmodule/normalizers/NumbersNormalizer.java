//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class NumbersNormalizer extends NbchNormalizer {
    public NumbersNormalizer() {
    }

    public List<String> normalize(String str) {
        char[] strArr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        char[] arr$ = strArr;
        int len$ = strArr.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            char c = arr$[i$];
            if(c >= 48 && c <= 57) {
                newStr.append(c);
            }
        }

        return Arrays.asList(new String[]{newStr.toString()});
    }
}
