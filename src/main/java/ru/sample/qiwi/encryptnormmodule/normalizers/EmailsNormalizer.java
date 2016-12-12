//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;

public class EmailsNormalizer extends DocsEnNormalizer {
    public EmailsNormalizer() {
    }

    public List<String> normalize(String str) {
        str = str.replaceAll("\\s+", "");
        char[] strArr = str.toCharArray();
        int strLen = str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < strLen; ++i) {
            char c = strArr[i];
            Character replace = (Character)cyrrilicToLatin.get(Character.valueOf(c));
            if(replace != null) {
                newStr.append(replace);
            } else {
                newStr.append(Character.toUpperCase(c));
            }
        }

        return Arrays.asList(new String[]{newStr.toString()});
    }
}
