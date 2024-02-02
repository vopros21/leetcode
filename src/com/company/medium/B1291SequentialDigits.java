package com.company.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/sequential-digits/">1291. Sequential Digits</a>
 * Runtime: 0ms, beats: 100%; Memory: 40.92MB, beats: 27.22%
 *
 * @author Mike Kostenko on 02/02/2024
 */
public class B1291SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int size = (int) (Math.log10(low) + 1);
        int res = 0;
        int addition = 0;
        for (int i = 1; i <= size; i++) {
            res = res * 10 + i;
            addition = addition * 10 + 1;
        }
        while (res <= high) {
            if ((int) (Math.log10(res) + 1) == size && res % 10 != 0) {
                if (res >= low) {
                    result.add(res);
                }
                res += addition;
            } else {
                size++;
                res = 0;
                for (int i = 1; i <= size; i++) {
                    res = res * 10 + i;
                }
                addition = addition * 10 + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        B1291SequentialDigits obj = new B1291SequentialDigits();
        int k = 58;
        int m = 155;
        System.out.println(k + " - " + m + ": " + obj.sequentialDigits(k, m));
    }
}
