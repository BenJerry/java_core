package org.example.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    private DateUtils() {}

    /**
     * 将时间解析为字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String dateParse(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String s = simpleDateFormat.format(date);
        return s;
    }

    /**
     * 将时间解析为字符串
     * @param date
     * @param pattern 解析格式
     * @param locale 当地风格
     * @return
     */
    public static String dateParse(Date date, String pattern, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        String s = simpleDateFormat.format(date);
        return s;
    }


    /**
     * 将时间字符串解析成Date
     * @param date
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Date dateParse(String date, String pattern) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date d = simpleDateFormat.parse(date);
        return d;
    }



}
