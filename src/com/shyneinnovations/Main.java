package com.shyneinnovations;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isPalindrome(String input) {
        // First, replaces all spaces in input String with "" (no spaces) and .toLowerCase
        input = input.replaceAll(" ", "").toLowerCase();

        // Iterates over two Char simultaneously starting from two directions, i(0) and i(end)
        for (int i = 0; i < input.length(); i++) {

            // Are the two compared Char's equal?
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
