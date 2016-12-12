//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameNormalizer extends AddressNormalizer {
    private static List<String> MNM_ENDS = Arrays.asList(new String[]{"ОВИЧ", "ЕВИЧ", "ИЧ", "ЫЧ", "ОВНА", "ЕВНА", "ИНИЧНА", "ИЧНА", "АВНА"});
    private static final List<Character> CONSONANTS = Arrays.asList(new Character[]{Character.valueOf('Ц'), Character.valueOf('К'), Character.valueOf('Н'), Character.valueOf('Г'), Character.valueOf('Ш'), Character.valueOf('Щ'), Character.valueOf('З'), Character.valueOf('Х'), Character.valueOf('Ф'), Character.valueOf('В'), Character.valueOf('П'), Character.valueOf('Р'), Character.valueOf('Л'), Character.valueOf('Д'), Character.valueOf('Ж'), Character.valueOf('Ч'), Character.valueOf('С'), Character.valueOf('М'), Character.valueOf('Т'), Character.valueOf('Ь'), Character.valueOf('Б')});
    private static final Map<String, String> MN_EXCEPTIONS = new HashMap() {
        {
            this.put("ЛВ", "ЛЕВ");
            this.put("МИХАЙЛ", "МИХАИЛ");
            this.put("ПАВЛ", "ПАВЕЛ");
        }
    };

    public NameNormalizer(){
    }

    public static String fnm_reduce(String fn) {
        int i;
        for(i = fn.length() - 1; i >= 0 && !CONSONANTS.contains(Character.valueOf(fn.charAt(i))); i--) {
            ;
        }

        return fn.substring(0, i + 1).replaceAll("Ь", "");
    }

    public static String mnm_reduce(String mnm) {
        for(int i = 1; i < mnm.length() - 1; ++i) {
            String end = mnm.substring(i);
            if(MNM_ENDS.contains(end)) {
                return fastExclude(mnm.substring(0, i), "Ь");
            }
        }

        return mnm;
    }

    public static String mnm_reduce2(String mn) {
        String base = mnm_reduce(mn);
        String base2 = (String)MN_EXCEPTIONS.get(base);
        if(base2 != null) {
            base = base2;
        }

        return base;
    }

    private static String fastExclude(String where, String what) {
        StringBuilder newString = new StringBuilder();
        char[] whatArr = what.toCharArray();
        int whaLen = whatArr.length;
        char[] whereArr = where.toCharArray();
        int wheLen = whereArr.length;

        label24:
        for(int i = 0; i < wheLen; ++i) {
            for(int j = 0; j < whaLen; ++j) {
                if(whatArr[j] == whereArr[i]) {
                    continue label24;
                }
            }

            newString.append(whereArr[i]);
        }

        return newString.toString();
    }
}
