package ru.sample.qiwi.Helpers;

/**
 * Created by Дмитрий Астахов on 17.08.2016.
 */
public class NormalizationData {

    public static String removeAllWS(String src) {
        return null;
    }

    public static String collapseAllWS(String src) {
        return null;
    }

    public static String uppercase(String src) {

        return src.toUpperCase();
    }

    public static String phones(String src) throws Exception{
        String dst;

        dst = numbers(src);

        if (dst.length() == 11 &&
                (dst.charAt(0) == '8' || dst.charAt(0) == '7'))
            dst = dst.substring(1);
        else if (dst.length() != 10)
            throw new Exception("Поле не является номером");

        return dst;
    }

    public static String yoToYe(String src) {
        return src.replaceAll("[Ёё]", "е");
    }

    public static String zeroToOu(String src) {
        return src.replaceAll("0", "О");
    }

    public static String numbers(String src) {
        return src.replaceAll("[^0-9]", "");
    }

    public static String numbersLetters(String src) {
        return src.replaceAll("[^\\w\\d]", "");
    }

    public static String latinToCyrillic(String src) {
        return null;
    }

    public static String cyrillicToLatin(String src) {
        return null;
    }

    public static String removeAllNonCyrillic(String src) {
        return null;
    }

    public static String getNameStem(String src) {
        return null;
    }

    public static String address(String src) {
        String dst = null;

        dst = latinToCyrillic(src);
        dst = zeroToOu(dst);
        dst = removeAllNonCyrillic(dst);
        dst = uppercase(dst);
        dst = yoToYe(dst);

        return dst;
    }

    public static String docs(String src) {
        String dst = null;

        dst = numbersLetters(src);
        dst = latinToCyrillic(dst);
        dst = yoToYe(dst);
        dst = uppercase(dst);

        return dst;
    }

    public static String docsInnSnils(String src) {
        String dst = null;

        dst = docs(src);
        dst = numbers(dst);

        return dst;
    }

    public static String docsEn(String src) {
        String dst = null;

        dst = cyrillicToLatin(src);
        dst = uppercase(dst);
        dst = numbersLetters(dst);

        return dst;
    }

    public static String emails(String src) {
        String dst = null;

        dst = cyrillicToLatin(src);
        dst = uppercase(dst);
        dst = removeAllWS(dst);

        return dst;
    }

    public static String names(String src) {
        String dst = null;

        dst = address(src);
        dst = getNameStem(dst);

        return dst;
    }
}
