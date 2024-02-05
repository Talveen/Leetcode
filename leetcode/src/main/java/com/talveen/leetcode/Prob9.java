package com.talveen.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2/4/2024
 * Time: 11:52 AM
 * URL: https://leetcode.com/problems/palindrome-number/description/
 */
public class Prob9 {
    public static void main(String[] args) {
        Prob9 prob9 =  new Prob9();
        int x = 121;
        boolean ans = prob9.isPalindrome(x);
        System.out.println(ans);
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

}
