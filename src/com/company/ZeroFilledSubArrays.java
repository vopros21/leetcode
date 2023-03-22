package com.company;

/**
 * <a href="https://leetcode.com/problems/number-of-zero-filled-subarrays/">2348. Number of Zero-Filled Subarrays</a>
 * Runtime: 6ms, beats: 34.17%; Memory: 59.6MB, beats: 72.41%.
 * @author Mike Kostenko on 21/03/2023
 */
public class ZeroFilledSubArrays {
    public static long zeroFilledSubarray(int[] nums) {
       long count = 0;
       int tmp = 0;
       for (int i: nums) {
           if (i != 0) {
               count += ((long) tmp * (tmp + 1)) / 2;
               tmp = 0;
           } else {
               tmp++;
           }
       }
       count += ((long) tmp * (tmp + 1)) / 2;
       return count;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 0, 0, 0, 1, 0, 0, 1};
//        int[] a1 = {2, 10, 2012};
//        int[] a1 = {};
        System.out.println(zeroFilledSubarray(a1));
    }
}
