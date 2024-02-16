package com.company.medium;

import java.util.*;

/**
 <a href="https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/">1481. Least Number of Unique Integers after K Removals</a>
 * Runtime: 67ms, beats: 25.33%; Memory: 77.58MB, beats: 5.33%
 *
 * @author Mike Kostenko on 16/02/2024
 */
public class B1481LeastNumberOfIntegers {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        if (k == arr.length) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set  = new HashSet<>();
        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            set.add(i);
        }
        int curr = 1;
        while (true) {
            for (int i: map.keySet()) {
                if (map.get(i) == curr) {
                    map.put(i, map.get(i) - Math.min(k, curr));
                    if (map.get(i) == 0) {
                        set.remove(i);
                    }
                    k = Math.max(k - curr, 0);
                    if (k == 0) {
                        return set.size();
                    }
                }
            }
            curr++;
        }
    }

    public static void main(String[] args) {
        B1481LeastNumberOfIntegers cl = new B1481LeastNumberOfIntegers();
        int[] arr = {5,5,4};
        int k = 1;
        System.out.println(Arrays.toString(arr) + ": " + cl.findLeastNumOfUniqueInts(arr, k));
        int[] arr2 = {4,3,1,1,3,3,2};
        int k2 = 3;
        System.out.println(Arrays.toString(arr2) + ": " + cl.findLeastNumOfUniqueInts(arr2, k2));
    }
}
