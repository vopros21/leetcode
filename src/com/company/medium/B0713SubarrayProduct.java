package com.company.medium;

/**
 * <a href="https://leetcode.com/problems/subarray-product-less-than-k">713. Subarray Product Less Than K</a>
 * Runtime: 870ms, beats: 8.16%; Memory: 47.64MB, beats: 49.37%
 *
 * @author Mike Kostenko on 27/03/2024
 */
public class B0713SubarrayProduct {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = nums[i];
            if (prod >= k) {
                continue;
            }
            count += 1;
            int j = i + 1;
            while (prod < k && j < nums.length) {
                prod *= nums[j];
                count = prod < k ? count + 1 : count;
                j++;
            }
        }
        return count;
    }
    // create main class to test the solution
    public static void main(String[] args) {
        B0713SubarrayProduct solution = new B0713SubarrayProduct();
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100)); // 8
        System.out.println(solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0)); // 0
    }
}
