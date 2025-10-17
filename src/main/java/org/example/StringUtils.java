package org.example;

public class StringUtils {

    public static int getLength(String input) {
        if (input == null) return 0;
        return input.length();
    }

    public static boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
