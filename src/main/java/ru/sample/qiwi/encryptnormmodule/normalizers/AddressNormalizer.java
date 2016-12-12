//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressNormalizer extends NbchNormalizer {
    static final Map<Character, Character> latinToCyrrilic = new HashMap() {
        {
            this.put(Character.valueOf('O'), Character.valueOf('О'));
            this.put(Character.valueOf('A'), Character.valueOf('А'));
            this.put(Character.valueOf('E'), Character.valueOf('Е'));
            this.put(Character.valueOf('H'), Character.valueOf('Н'));
            this.put(Character.valueOf('T'), Character.valueOf('Т'));
            this.put(Character.valueOf('P'), Character.valueOf('Р'));
            this.put(Character.valueOf('c'), Character.valueOf('С'));
            this.put(Character.valueOf('C'), Character.valueOf('С'));
            this.put(Character.valueOf('M'), Character.valueOf('М'));
            this.put(Character.valueOf('B'), Character.valueOf('В'));
            this.put(Character.valueOf('X'), Character.valueOf('Х'));
            this.put(Character.valueOf('Y'), Character.valueOf('У'));
            this.put(Character.valueOf('K'), Character.valueOf('К'));
            this.put(Character.valueOf('a'), Character.valueOf('А'));
            this.put(Character.valueOf('e'), Character.valueOf('Е'));
            this.put(Character.valueOf('r'), Character.valueOf('Г'));
            this.put(Character.valueOf('u'), Character.valueOf('И'));
            this.put(Character.valueOf('o'), Character.valueOf('О'));
            this.put(Character.valueOf('k'), Character.valueOf('К'));
            this.put(Character.valueOf('p'), Character.valueOf('Р'));
            this.put(Character.valueOf('x'), Character.valueOf('Х'));
            this.put(Character.valueOf('y'), Character.valueOf('У'));
            this.put(Character.valueOf('U'), Character.valueOf('И'));
            this.put(Character.valueOf('0'), Character.valueOf('О'));
        }
    };

    public AddressNormalizer() {
    }

    public List<String> normalize(String str) {
        char[] strArr = str.toCharArray();
        int strLen = str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < strLen; ++i) {
            char c = strArr[i];
            if((c < 1072 || c > 1103) && (c < 1040 || c > 1071)) {
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
