//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.normalizers;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DatesNormalizer extends NbchNormalizer {
    private static final Pattern DATE_PATTERN = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(19|20)\\d\\d$");

    public DatesNormalizer() {
    }

    public List<String> normalize(String str) {
        if(str != null) {
            str = str.trim();
            if(DATE_PATTERN.matcher(str).matches()) {
                return Arrays.asList(new String[]{str});
            }
        }

        return Arrays.asList(new String[]{""});
    }
}
