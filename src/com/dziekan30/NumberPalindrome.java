package com.dziekan30;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;

            stored /= 10;
        }

        if (number == reverse){
            return true;
        } else
            return false;

    }
}
