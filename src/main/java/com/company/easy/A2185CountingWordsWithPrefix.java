package com.company.easy;

import java.util.stream.Stream;

/**
 <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">2185. Counting Words With a Given Prefix</a>
 * Runtime: 2ms, beats: 13.74%; Memory: 43.04MB, beats: 39.71%
 *
 * @author Mike Kostenko on 9 Jan 2025
 */
public class A2185CountingWordsWithPrefix {
    public static int prefixCount(String[] words, String pref) {
        return (int) Stream.of(words).filter(s -> s.startsWith(pref)).count();
    }

    public static void main(String[] args) {
        String[] input = {"pay","attention","practice","attend"};
        String pref = "at";

        System.out.println(A2185CountingWordsWithPrefix.prefixCount(input, pref));
    }
}
