package org.example.string;

public class StringUtils {

    private StringUtils() {}

    public static String formatDate(Object s, String pattern) {
        String res = String.format(pattern, s);
        return res;
    }
}
