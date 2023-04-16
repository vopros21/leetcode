package com.company;

/**
 * <a href="https://leetcode.com/problems/binary-search/">Binary Search</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 * @author Mike Kostenko on 16/04/2023
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (nums[middle] < target){
                left = middle + 1;
            } else if (nums[middle] > target){
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 0, 3, 5, 9, 12};
        System.out.println(new BinarySearch().search(numbers, 5));
    }
}


