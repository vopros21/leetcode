package com.company.medium;

/**
 <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/">2149. Rearrange Array Elements by Sign</a>
 * Runtime: 4ms, beats: 57.10%; Memory: 76.58MB, beats: 83.17%
 *
 * @author Mike Kostenko on 14/02/2024
 */
public class B2149RearrangeArrayElements {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int num : nums) {
            if (num > 0) {
                res[pos] = num;
                pos += 2;
            } else {
                res[neg] = num;
                neg += 2;
            }
        }
        return res;
    }
}
