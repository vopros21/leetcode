package com.company.medium;

/**
 * <a href="https://leetcode.com/problems/find-the-duplicate-number/">287. Find the Duplicate Number</a>
 * Runtime: 2ms, beats: 97.31%; Memory: 59.70MB, beats: 6.65%
 *
 * @author Mike Kostenko on 24/03/2024
 */
public class B0287FindDuplicate {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for (int e : nums) {
            if (count[e] != 0) {
                return e;
            }
            count[e]++;
        }
        return 0;
    }

    public static void main(String[] args) {
        B0287FindDuplicate test = new B0287FindDuplicate();
        System.out.println(test.findDuplicate(new int[]{1, 3, 4, 2, 2})); // 2
        System.out.println(test.findDuplicate(new int[]{3, 1, 3, 4, 2})); // 3
        System.out.println(test.findDuplicate(new int[]{1, 1})); // 1
        System.out.println(test.findDuplicate(new int[]{1, 1, 2})); // 1
    }
}
