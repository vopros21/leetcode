package com.company.medium;

import java.util.Arrays;

/**
 <a href="https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/">2971. Find Polygon With the Largest Perimeter</a>
 * Runtime: 29ms, beats: 69.56%; Memory: 56.12MB, beats: 82.29%
 *
 * @author Mike Kostenko on 15/02/2024
 */
public class B2971FindPolygonPerimeter {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        B2971FindPolygonPerimeter cl = new B2971FindPolygonPerimeter();
        int[] nums = {5,5,5};
        System.out.println(Arrays.toString(nums) + ": " + cl.largestPerimeter(nums));
        int[] nums2 = {1,12,1,2,5,50,3};
        System.out.println(Arrays.toString(nums2) + ": " + cl.largestPerimeter(nums2));
        int[] nums3 = {5,5,50};
        System.out.println(Arrays.toString(nums3) + ": " + cl.largestPerimeter(nums3));
    }
}
