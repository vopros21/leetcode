package com.company.easy;


import java.util.HashSet;
import java.util.Set;

/**
 <a href="https://leetcode.com/problems/find-missing-and-repeated-values/">2965. Find Missing and Repeated Values</a>
 * Runtime: 5ms, beats: 44.38%; Memory: 45.77MB, beats: 26.65%
 *
 * @author Mike Kostenko on 6 Mar 2025
 */
public class A2965FindMissingAndRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> nums = new HashSet<>();
        for (int[] line: grid) {
            for (int i: line) {
                if (nums.contains(i)) {
                    res[0] = i;
                }
                nums.add(i);
            }
        }
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if (!nums.contains(i)) {
                res[1] = i;
            }
        }
        return res;
    }
}
