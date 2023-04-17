package com.company;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/description/">Search insert position</a>
 *  * Runtime: ms, beats: %; Memory: MB, beats: %
 * @author Mike Kostenko on 17/04/2023
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = -1;
        while (left <= right){
            middle = (left + right) / 2;
            if (nums[middle] < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return middle;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 3, 5, 6};
            System.out.println(new SearchInsertPosition().searchInsert(numbers, 7));
        }
}
