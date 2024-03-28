package com.company.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/">2958. Length of Longest Subarray With at Most K Frequency</a>
 * Runtime: 84ms, beats: 9.01%; Memory: 60.04MB, beats: 75.80%
 *
 * @author Mike Kostenko on 28/03/2024
 */
public class B2958LengthOfLongestSubArray {
    public int maxSubarrayLength(int[] nums, int k) {
        if (nums.length == 0) return 0;
        if (nums.length == k) return k;
        Map<Integer, Integer> count = new HashMap<>();
        int index = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                if (count.get(nums[i]) == k) {
                    count.put(nums[index], count.get(nums[index]) - 1);
                    index++;
                    i--;
                    continue;
                }
            }
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            res = Math.max(res, i - index + 1);
        }
        int countMax = 0;
        for (int value : count.values()) {
            countMax += value;
        }
        res = Math.max(res, countMax);
        return res;
    }

    // create main class to test the
    public static void main(String[] args) {
        B2958LengthOfLongestSubArray solution = new B2958LengthOfLongestSubArray();
        System.out.println("2 -> " + solution.maxSubarrayLength(new int[]{3, 1, 1}, 1)); // 2
        System.out.println("2 -> " + solution.maxSubarrayLength(new int[]{1, 4, 4, 3}, 1)); // 2
        System.out.println("2 -> " + solution.maxSubarrayLength(new int[]{2, 11}, 1)); // 2
        System.out.println("6 -> " + solution.maxSubarrayLength(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2)); // 6
        System.out.println("2 -> " + solution.maxSubarrayLength(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 1)); // 2
        System.out.println("4 -> " + solution.maxSubarrayLength(new int[]{5, 5, 5, 5, 5, 5, 5, 5}, 4)); // 4
    }
}
