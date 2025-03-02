package com.company;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a>
 * Runtime: 0ms, beats: 100% (looks like an error); Memory: 41.3MB, beats: 18.76%.
 * @author Mike Kostenko on 13/03/2023
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int maxIndex = digits.length - 1;
        if (digits[maxIndex] != 9) {
            digits[maxIndex] += 1;
            return digits;
        }
        for (int i = maxIndex; i >= 0; i--) {
            int k = digits[i] + 1;
            digits[i] = k % 10;
            if (k != 10) {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[maxIndex + 2];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, result.length - 1);
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
