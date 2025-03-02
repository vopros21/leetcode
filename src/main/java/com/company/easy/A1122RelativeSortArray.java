package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/relative-sort-array">1122. Relative Sort Array</a>
 * Runtime: 5ms, beats: 13.33%; Memory: 41.98MB, beats: 61.60π%
 * <p>
 *
 * @author Mike Kostenko on 11/06/2024
 */
public class A1122RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        int[] res = new int[arr1.length];
        List<Integer> tmp = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(Arrays.stream(arr2).boxed().toList());
        for (int i: arr1) {
            freq[i]++;
            if (!list2.contains(i)) {
                tmp.add(i);
            }
        }
        int k = 0;
        for (int i: arr2) {
            for (int j = 0; j < freq[i]; j++) {
                res[k] = i;
                k++;
            }
        }
        tmp.sort(Comparator.naturalOrder());
        int i = 0;
        while (k < res.length) {
            res[k] = tmp.get(i);
            i++;
            k++;
        }
        return res;
    }
}
