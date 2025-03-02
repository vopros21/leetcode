package com.company;

/**
 * <a href="https://leetcode.com/problems/single-number/">Single number</a>
 *  * Runtime: 1ms, beats: 100%; Memory: 42.2MB, beats: 90.85%
 * @author Mike Kostenko on 16/04/2023
 */
public class SingleNumberInList {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums){
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 3, 1, 4, 4};
        System.out.println(new SingleNumberInList().singleNumber(numbers));
    }
}
