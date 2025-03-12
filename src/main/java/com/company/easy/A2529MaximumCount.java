package com.company.easy;

/**
 *  * <a href="https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/">2529. Maximum Count of Positive Integer and Negative Integer</a>
 *  * Runtime: 0ms, beats: 100.00%; Memory: 44.86MB, beats: 79.99%
 *
 * @author Mike Kostenko on 12 Mar 2025
 */
public class A2529MaximumCount {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int i: nums) {
            if (i > 0) {
                pos++;
            } else if (i < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
