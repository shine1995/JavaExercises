package com.shyneinnovations;

public class Main {

    public static void main(String[] args) {
	System.out.println(isPalindromeTwo("bababa"));
    }

    public static boolean isPalindromeTwo(String input) {
        // First, replaces all spaces in input String with "" (no spaces) and .toLowerCase
        input = input.replaceAll(" ", "").toLowerCase();

        //
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}
