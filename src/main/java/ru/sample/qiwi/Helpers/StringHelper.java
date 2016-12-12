package ru.sample.qiwi.Helpers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by tikhonin on 14.01.2016.
 */
public class StringHelper {
    public static Map<String, String> splitParamsStringToMap(String source) throws Exception {
        source = source.trim();
        HashMap params = new HashMap<String ,String>();
        String[] keyValues = source.split(";");
        for (String keyValue : keyValues) {
            String[] pair = keyValue.split("=");
            if(pair.length < 1 || pair.length > 2)
                throw new Exception("Ошибка разбора строки параметров");
            String value = "";
            if(pair.length == 2)
                value = pair[1];
            params.put(pair[0], value);
        }
        return params;
    }

    public static Date parseAxicreditDate(String source) throws ParseException {
        DateFormat formatterAxicredit = new SimpleDateFormat("yyyy-MM-dd");
        Date result = null;
        result = formatterAxicredit.parse(source);
        return result;
    }

    public static String formatAxicreditDate(Date source) {
        DateFormat formatterAxicredit = new SimpleDateFormat("yyyy-MM-dd");
        String result = formatterAxicredit.format(source);
        return result;
    }

    public static boolean isNullOrEmpty(String... strings) {
        boolean result = false;
        for(int i = 0; i < strings.length; i++) {
            if(isNullOrEmpty(strings[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static String getStackTrace(Exception e) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        e.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    public static String cut(String source, int count) {
        if(source.length() > count) {
            return source.substring(0, count);
        }
        else
        {
            return source;
        }
    }

    //TODO: проверить корректность преобразования
    public static String toHexString(byte[] input) {
        StringBuffer resultHex = new StringBuffer();
        for (byte byt : input) resultHex.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
        return resultHex.toString();
    }

    public static Boolean parseBoolean(String input, Boolean nullValue) {
        if(isNullOrEmpty(input)) {
            return nullValue;
        }
        else if(input.trim().equalsIgnoreCase("0") || input.trim().equalsIgnoreCase("false")) {
            return false;
        }
        else if(input.trim().equalsIgnoreCase("0") || input.trim().equalsIgnoreCase("false")) {
            return true;
        }
        else {
            return Boolean.parseBoolean(input);
        }
    }

    static final Pattern patternNumeric = Pattern.compile("\\d+");
    static final Pattern patternNumericSign = Pattern.compile("[-+]?\\d+");
    static final Pattern patternNumericSpace = Pattern.compile("[\\d\\s]+");
    static final Pattern patternNumericSpaceSign = Pattern.compile("[-+]?[\\d\\s]+");

    public static Boolean isNumeric(String input, boolean withSign, boolean withSpace) {
        Pattern pattern;
        if(withSpace) {
            if(withSign) {
                pattern = patternNumericSpaceSign;
            }
            else {
                pattern = patternNumericSpace;
            }
        }
        else {
            if(withSign) {
                pattern = patternNumericSign;
            }
            else {
                pattern = patternNumeric;
            }
        }

        return pattern.matcher(input).matches();
    }

    public static String replaceYoToYe(String input){
        String dst = "";
        Character c;

        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);

            if (Character.toLowerCase(c) == 'ё')
                c = Character.isUpperCase(c)? 'Е' : 'е';

            dst += c;
        }

        return dst;
    }

    // ГОСТ 7.79-2000
    public static String transliterate(String input) {
        Map<Character, String> alphabet = new HashMap<Character, String>();
        alphabet.put('а', "a");
        alphabet.put('б', "b");
        alphabet.put('в', "v");
        alphabet.put('г', "g");
        alphabet.put('д', "d");
        alphabet.put('е', "e");
        alphabet.put('ё', "yo");
        alphabet.put('ж', "zh");
        alphabet.put('з', "z");
        alphabet.put('и', "i");
        alphabet.put('й', "j");
        alphabet.put('к', "k");
        alphabet.put('л', "l");
        alphabet.put('м', "m");
        alphabet.put('н', "n");
        alphabet.put('о', "o");
        alphabet.put('п', "p");
        alphabet.put('р', "r");
        alphabet.put('с', "s");
        alphabet.put('т', "t");
        alphabet.put('у', "u");
        alphabet.put('ф', "f");
        alphabet.put('х', "x");
        alphabet.put('ц', "cz");
        alphabet.put('ч', "ch");
        alphabet.put('ш', "sh");
        alphabet.put('щ', "shh");
        alphabet.put('ъ', "``");
        alphabet.put('ы', "y`");
        alphabet.put('ь', "`");
        alphabet.put('э', "e`");
        alphabet.put('ю', "yu");
        alphabet.put('я', "ya");

        String dst = "";
        char c;
        boolean upperCase;

        for (int i = 0; i < input.length(); i++){
            c = Character.toLowerCase(input.charAt(i));
            upperCase = Character.isUpperCase(input.charAt(i));

            if (alphabet.containsKey(c)){
                if (c == 'ц') { // Если после {ц} стоят буквы {и, й, е, ы}, то пишется {c}
                    if ((i < input.length() - 1) &&
                            (Character.toLowerCase(input.charAt(i + 1)) == 'и' ||
                                    Character.toLowerCase(input.charAt(i + 1)) == 'е' ||
                                    Character.toLowerCase(input.charAt(i + 1)) == 'й' ||
                                    Character.toLowerCase(input.charAt(i + 1)) == 'ы')) {

                        dst += upperCase? "C" : "c";
                        continue;
                    } // В остальных случаях пишется {cz}
                }

                dst += upperCase? alphabet.get(c).toUpperCase() : alphabet.get(c);
            } else
                dst += input.charAt(i);
        }

        return dst;
    }

    /**
     * Удаление из строки всех символов кроме букв и цифр
     * @param src Исходная строка
     * @return Строка из букв и цифр
     */
    public static String getNumbersLetters(String src) {
        return src.replaceAll("[^а-яА-Яa-zA-Z\\d]", "");
    }
}