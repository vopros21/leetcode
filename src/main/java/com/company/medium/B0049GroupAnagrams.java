package com.company.medium;

import java.util.*;

/**
 <a href="https://leetcode.com/problems/group-anagrams/">49. Group Anagrams</a>
 * Runtime: 8ms, beats: 38.79%; Memory: 47.56MB, beats: 54.86%
 *
 * @author Mike Kostenko on 06/02/2024
 */
public class B0049GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            String sortedS = sort(s);
            if (map.containsKey(sortedS)) {
                map.get(sortedS).add(s);
            } else {
                map.put(sortedS, new ArrayList<>());
                map.get(sortedS).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
