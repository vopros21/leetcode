package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  * <a href="https://leetcode.com/problems/unique-number-of-occurrences/">1207. Unique Number of Occurrences</a>
 *  * Runtime: 2ms, beats: 98.1%; Memory: 41.5MB, beats: 45.5%
 *
 * @author Mike Kostenko on 17/01/2024
 */
public class A1207NumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(Arrays.toString(arr) + ": " + calc(arr));
        int[] arr2 = {1, 2};
        System.out.println(Arrays.toString(arr) + ": " + calc(arr2));
        int[] arr3 = {};
        System.out.println(Arrays.toString(arr) + ": " + calc(arr3));
    }

    private static boolean calc(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k: input) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        Set<Integer> set = Set.copyOf(map.values());
        return map.keySet().size() == set.size();
    }
}
