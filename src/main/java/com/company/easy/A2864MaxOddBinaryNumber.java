package com.company.easy;

/**
 <a href="https://leetcode.com/problems/maximum-odd-binary-number/description">2864. Maximum Odd Binary Number</a>
 * Runtime: 2ms, beats: 83.47%; Memory: 43.28MB, beats: 69.38%
 *
 * @author Mike Kostenko on 01/03/2024
 */
public class A2864MaxOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == '1') {
                sb.insert(0, c);
            } else {
                sb.append(c);
            }
        }
        sb.deleteCharAt(0);
        sb.append('1');
        return sb.toString();
    }
}
