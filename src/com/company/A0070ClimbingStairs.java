package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 *  * <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 *  * Runtime: 0ms, beats: 100%; Memory: 39.95MB, beats: 52.67%
 *
 * @author Mike Kostenko on 18/01/2024
 */
public class A0070ClimbingStairs {
    private static final Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int res =  climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, res);
        return res;
    }
}
