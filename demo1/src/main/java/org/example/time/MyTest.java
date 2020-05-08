package org.example.time;

import org.example.string.StringUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyTest {

    public static void main(String[] args) throws InterruptedException {

        Date d1 = new Date();
        Thread.sleep(1000);
        Date d2 = new Date();
        System.out.println("d2 after d1 : " + d2.after(d1));
        System.out.println("d1 before d2: " +  d1.before(d2));
        System.out.println("d1 compareTo d2 : " + d1.compareTo(d2));
        System.out.println("d1 equals d2 : " + d1.equals(d2));
        System.out.println("d1 toString : " + d1.toString());
        System.out.println("d : " + d1);
        System.out.println("-----------------------------------------------");
        testDateParse();
        System.out.println("-----------------------------------------------");
        testDateFormat();
        System.out.println("-----------------------------------------------");
        testCalendar();
    }

    public static void testDateParse() {
        Date d = new Date();
        String s = DateUtils.dateParse(d, "yyyy-MM-dd hh:mm:ss");
        System.out.println(s);
        s = DateUtils.dateParse(d, "MMM dd yyyy hh:mm:ssX", Locale.ENGLISH);
        System.out.println(s);
        s = DateUtils.dateParse(d, "MMM dd yyyy hh:mm:ss.SSSS z", Locale.CHINA);
        System.out.println(s);
    }

    public static void testDateFormat() {
        Date d = new Date();
        String s = StringUtils.formatDate(d, "全部日期和时间信息：%tc%n");
        System.out.println(s);
        s = StringUtils.formatDate(d, "年-月-日 格式：%tF%n");
        System.out.println(s);
        s = StringUtils.formatDate(d, "月/日/年 格式：%tD%n");
        System.out.println(s);
        s = StringUtils.formatDate(d, "HH:MM:SS PM格式（12时制）：%tr%n");
        System.out.println(s);
        s = StringUtils.formatDate(d, "HH:MM:SS PM格式（24时制）：%tT%n");
        System.out.println(s);
        s = StringUtils.formatDate(d, "HH:MM格式（24时制）：%tR");
        System.out.println(s);
        s = String.format(Locale.US, "英文月份简称：%tb", d);
        System.out.println(s);
        s = String.format(Locale.US, "英文月份全称：%tB", d);
        System.out.println(s);
        System.out.printf("本地月份简称：%tb%n", d);
        System.out.printf("本地月份全称：%tB%n", d);
        System.out.printf("当前日期时一年中的第几天：%tj%n", d);
        System.out.printf("本地星期的简称：%tA%n", d);
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n", d);
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n", d);
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n", d);
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n", d);
        System.out.printf("两位数字的日（不补0）：%te%n", d);
    }

    public static void testCalendar() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(calendar.get(Calendar.MONTH));
    }

}
