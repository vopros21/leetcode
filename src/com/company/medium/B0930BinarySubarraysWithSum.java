package com.company.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/binary-subarrays-with-sum/">930. Binary Subarrays With Sum</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 *
 * @author Mike Kostenko on 14/03/2024
 */
public class B0930BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int count = 0;
        while (left < nums.length) {
            if (right == nums.length) {
                left++;
                right = left;
                continue;
            }
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            if (sum <= goal) {
                if (sum == goal)
                    count++;
                right++;
                continue;
            }
            left++;
            right--;
        }
        return count;
    }

    public static void main(String[] args) {
        B0930BinarySubarraysWithSum cl = new B0930BinarySubarraysWithSum();
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println("Result of calculation: " + Arrays.toString(nums) + ": " + cl.numSubarraysWithSum(nums, goal));
        int[] nums2 = {0,0,0,0,0};
        goal = 0;
        System.out.println("Result of calculation: " + Arrays.toString(nums2) + ": " + cl.numSubarraysWithSum(nums2, goal));
        int[] nums3 = {0,1,1,1,1};
        goal = 3;
        System.out.println("Result of calculation: " + Arrays.toString(nums3) + ": " + cl.numSubarraysWithSum(nums3, goal));
    }
}
