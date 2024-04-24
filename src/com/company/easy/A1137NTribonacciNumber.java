package com.company.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number">1137. N-th Tribonacci Number</a>
 * Runtime: 0ms, beats: 100%; Memory: 40.60MB, beats: 8.00%
 *
 * @author Mike Kostenko on 24/04/2024
 */
public class A1137NTribonacciNumber {
    static Map<Integer, Integer> map = new HashMap<>();

    public int tribonacci(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }
        int left = tribonacci(n - 3);
        int mid = tribonacci(n - 2);
        int right = tribonacci(n - 1);
        int res = left + mid + right;
        map.put(n, res);
        return res;
    }
}
