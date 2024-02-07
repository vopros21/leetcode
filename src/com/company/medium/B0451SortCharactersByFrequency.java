package com.company.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/sort-characters-by-frequency/">451. Sort Characters By Frequency</a>
 * Runtime: 18ms, beats: 44.57%; Memory: 45.76MB, beats: 31.44%
 *
 * @author Mike Kostenko on 07/02/2024
 */
public class B0451SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .map(entry -> String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        B0451SortCharactersByFrequency obj = new B0451SortCharactersByFrequency();
        String s = "tree";
        System.out.println(s + ": " + obj.frequencySort(s));
    }
}
