package com.company.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/">2966. Divide Array Into Arrays With Max Difference</a>
 * Runtime: 25ms, beats: 38.13%; Memory: 59.27MB, beats: 13.52%
 *
 * @author Mike Kostenko on 01/02/2024
 */
public class B2966DivideArrayIntoThree {
    public int[][] divideArray(int[] nums, int k) {
        int size = nums.length;
        if (size % 3 != 0)
            return new int[0][0];

        Arrays.sort(nums);

        int[][] result = new int[size / 3][3];
        int groupIndex = 0;
        for (int i = 0; i < size; i += 3) {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                result[groupIndex][0] = nums[i];
                result[groupIndex][1] = nums[i + 1];
                result[groupIndex][2] = nums[i + 2];
                groupIndex++;
            } else {
                return new int[0][0];
            }
        }
        return result;
    }
}
