package org.example.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    private DateUtils() {}

    public static String dateParse(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String s = simpleDateFormat.format(date);
        return s;
    }

    public static String dateParse(Date date, String pattern, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        String s = simpleDateFormat.format(date);
        return s;
    }
}
