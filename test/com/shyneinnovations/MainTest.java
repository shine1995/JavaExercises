package com.shyneinnovations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void main() throws Exception {

    }

    @Test
    public void isPalindromeTest() {
        assertEquals(Main.isPalindrome("bababab"), true);
        assertEquals(Main.isPalindrome("bababa"), false);
        assertEquals(Main.isPalindrome("ba Ba BA b"), true);
    }

}