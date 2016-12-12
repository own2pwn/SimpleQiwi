package ru.sample.qiwi.Helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by tikhonin on 21.04.2016.
 */
public class DateHelper {
    public static Date AddDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    /**
     * Преобразование даты из входного формата в выходной формат
     * @param date Дата
     * @param inputFormat Входной формат даты
     * @param outputFormat Выходной формат даты
     * @return date в выходном формате
     * @throws ParseException
     */
    public static String convertDateFormat(String date, String inputFormat, String outputFormat) throws ParseException{
        SimpleDateFormat oldDateFormat = new SimpleDateFormat(inputFormat, Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat(outputFormat, Locale.getDefault());

        return newDateFormat.format(oldDateFormat.parse(date));
    }
}
