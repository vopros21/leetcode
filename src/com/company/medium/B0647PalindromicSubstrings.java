package com.company.medium;

/**
 <a href="https://leetcode.com/problems/palindromic-substrings/">647. Palindromic Substrings</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 *
 * @author Mike Kostenko on 10/02/2024
 */
public class B0647PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int even = palindromeCount(s, i, i+1);
            int odd = palindromeCount(s, i-1, i+1);
            ans += even + odd + 1;
        }
        return ans;
    }

    public static int palindromeCount(String s, int left, int right) {
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strings = {"abc", "a", "aaa", "", "abcba", "abaaba", "reaba"};
        for (String s: strings) {
            System.out.println(s + ":\n" + countSubstrings(s));
        }
    }
}
