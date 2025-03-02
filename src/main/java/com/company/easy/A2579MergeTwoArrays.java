package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 <a href="https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/">2570. Merge Two 2D Arrays by Summing Values</a>
 * Runtime: 5ms, beats: 28.44%; Memory: 45.30MB, beats: 73.05%
 *
 * @author Mike Kostenko on 2 Mar 2025
 */
public class A2579MergeTwoArrays {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> tmpList = new ArrayList<>();
        int first = 0;
        int second = 0;
        while (first < nums1.length && second < nums2.length) {
            if (nums1[first][0] < nums2[second][0]) {
                tmpList.add(Arrays.asList(nums1[first][0], nums1[first][1]));
                first++;
            } else if (nums1[first][0] > nums2[second][0]) {
                tmpList.add(Arrays.asList(nums2[second][0], nums2[second][1]));
                second++;
            } else {
                tmpList.add(Arrays.asList(nums1[first][0], nums1[first][1] + nums2[second][1]));
                first++;
                second++;
            }
        }
        while (first < nums1.length) {
            tmpList.add(Arrays.asList(nums1[first][0], nums1[first][1]));
            first++;
        }
        while (second < nums2.length) {
            tmpList.add(Arrays.asList(nums2[second][0], nums2[second][1]));
            second++;
        }
        return tmpList.stream().map(l -> l.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] input1 = {{1, 3}, {2, 4}};
        int[][] input2 = {{2, 1}, {5, 6}, {7, 8}};

        System.out.println(Arrays.deepToString(new A2579MergeTwoArrays().mergeArrays(input1, input2)));
    }
}