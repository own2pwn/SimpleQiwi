//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class DocsNormalizer extends AddressNormalizer {
    public DocsNormalizer() {
    }

    public List<String> normalize(String str) {
        char[] strArr = str.toCharArray();
        int strLen = str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < strLen; ++i) {
            char c = strArr[i];
            if((c < 1072 || c > 1103) && (c < 1040 || c > 1071) && (c < 97 || c > 122) && (c < 65 || c > 90) && (c < 48 || c > 57)) {
                if(c != 1105 && c != 1025) {
                    Character replace = (Character)latinToCyrrilic.get(Character.valueOf(c));
                    if(replace != null) {
                        newStr.append(replace);
                    }
                } else {
                    newStr.append("Е");
                }
            } else {
                newStr.append(Character.toUpperCase(c));
            }
        }

        return Arrays.asList(new String[]{newStr.toString()});
    }
}
