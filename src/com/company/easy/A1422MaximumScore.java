package com.company.easy;

/**
 *  * <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/">1422. Maximum Score After Splitting a String</a>
 *  * Runtime: 8ms, beats: 12.97%; Memory: 45.12MB, beats: 5.06%
 *
 * @author Mike Kostenko on 1/01/2025
 */
public class A1422MaximumScore {
    public static int maxScore(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i ++) {
            int cur = count(s.substring(0, i), '0') + count(s.substring(i), '1');
            if (cur > score) {
                score = cur;
            }
        }
        return score;
    }

    private static int count(String st, char c) {
        int res = 0;
        for (char ch: st.toCharArray()) {
            if (ch == c) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(A1422MaximumScore.maxScore("00"));
    }
}
