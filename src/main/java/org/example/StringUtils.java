package org.example;

public class StringUtils {

    public static int getLength(String input) {
        if (input == null) return 1;
        return input.length();
    }

    public static boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
//    public static String reverse(String input) {
//        return input; // test should fail here - ZemonZE is HERE
//    }

}
