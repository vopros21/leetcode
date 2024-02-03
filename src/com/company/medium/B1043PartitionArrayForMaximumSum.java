package com.company.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/partition-array-for-maximum-sum/">1043. Partition Array for Maximum Sum</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 *
 * @author Mike Kostenko on 03/02/2024
 */
public class B1043PartitionArrayForMaximumSum {
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int res = 0;
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (high == low) {
                res += arr[high];
                break;
            }
            if (high - low < k) {
                k = high - low;
                if (k < 0) {
                    continue;
                }
            }
            res += arr[high] * k;
            low += k - 1;
            high--;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,5,7,3,6,1,9,9,3};
        int k = 4;
        System.out.println("MaxSum: " + maxSumAfterPartitioning(arr, k));
    }
}
