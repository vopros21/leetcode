package com.company.easy;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a>
 * Runtime: 1175ms, beats: 6.77%; Memory: 55.54MB, beats: 78.31%
 *
 * @author Mike Kostenko on 27/01/2024
 */
public class A0219ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int kMax = Math.min(nums.length - i - 1, k);
            for (int j = 1; j <= kMax; j++) {
                if (i + j >= nums.length) {
                    return false;
                }
                if (nums[i] == nums[i + j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        System.out.println(containsNearbyDuplicate(numbers, 3));
    }
}
