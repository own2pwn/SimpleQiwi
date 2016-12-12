//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocsEnNormalizer extends NbchNormalizer {
    static final Map<Character, Character> cyrrilicToLatin = new HashMap() {
        {
            this.put(Character.valueOf('О'), Character.valueOf('O'));
            this.put(Character.valueOf('А'), Character.valueOf('A'));
            this.put(Character.valueOf('Е'), Character.valueOf('E'));
            this.put(Character.valueOf('Н'), Character.valueOf('H'));
            this.put(Character.valueOf('Т'), Character.valueOf('T'));
            this.put(Character.valueOf('Р'), Character.valueOf('P'));
            this.put(Character.valueOf('С'), Character.valueOf('C'));
            this.put(Character.valueOf('М'), Character.valueOf('M'));
            this.put(Character.valueOf('В'), Character.valueOf('B'));
            this.put(Character.valueOf('Х'), Character.valueOf('X'));
            this.put(Character.valueOf('У'), Character.valueOf('Y'));
            this.put(Character.valueOf('К'), Character.valueOf('К'));
            this.put(Character.valueOf('И'), Character.valueOf('U'));
            this.put(Character.valueOf('а'), Character.valueOf('A'));
            this.put(Character.valueOf('е'), Character.valueOf('E'));
            this.put(Character.valueOf('г'), Character.valueOf('R'));
            this.put(Character.valueOf('и'), Character.valueOf('U'));
            this.put(Character.valueOf('о'), Character.valueOf('O'));
            this.put(Character.valueOf('к'), Character.valueOf('K'));
            this.put(Character.valueOf('р'), Character.valueOf('P'));
            this.put(Character.valueOf('х'), Character.valueOf('X'));
            this.put(Character.valueOf('у'), Character.valueOf('Y'));
        }
    };

    public DocsEnNormalizer() {
    }

    public List<String> normalize(String str) {
        char[] strArr = str.toCharArray();
        int strLen = str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < strLen; ++i) {
            char c = strArr[i];
            if(c >= 97 && c <= 122 || c >= 65 && c <= 90 || c >= 48 && c <= 57) {
                newStr.append(Character.toUpperCase(c));
            } else {
                Character replace = (Character)cyrrilicToLatin.get(Character.valueOf(c));
                if(replace != null) {
                    newStr.append(replace);
                }
            }
        }

        return Arrays.asList(new String[]{newStr.toString()});
    }
}
