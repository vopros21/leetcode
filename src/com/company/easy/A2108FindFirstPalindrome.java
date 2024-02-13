package com.company.easy;

/**
 <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">2108. Find First Palindromic String in the Array</a>
 * Runtime: 2ms, beats: 71.53%; Memory: 44.72MB, beats: 76.00%
 *
 * @author Mike Kostenko on 13/02/2024
 */
public class A2108FindFirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (String s: words) {
            boolean isPal = true;
            for (int i = 0; i <= s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    isPal = false;
                    break;
                }
            }
            if (isPal) {
                return s;
            }
        }
        return "";
    }
}
