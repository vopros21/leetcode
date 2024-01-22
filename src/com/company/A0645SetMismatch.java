package com.company;

import java.util.*;

/**
 *  * <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a>
 *  * Runtime: 13ms, beats: 14.85%; Memory: 45.42MB, beats: 42.36%
 * @author Mike Kostenko on 22/01/2024
 */
public class A0645SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long totalSum = 0;
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            totalSum += i + 1;
            if (set.contains(nums[i])) {
                res[0] = nums[i];
                continue;
            }
            set.add(nums[i]);
            sum += nums[i];
        }
        res[1] = (int) (totalSum - sum);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
