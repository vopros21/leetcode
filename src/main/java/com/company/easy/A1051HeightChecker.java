package com.company.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/height-checker/">1051. Height Checker</a>
 * Runtime: 3ms, beats: 11.65%; Memory: 41.62MB, beats: 12.81%
 * <p>
 *
 * @author Mike Kostenko on 10/06/2024
 */
public class A1051HeightChecker {
    public int heightChecker(int[] heights) {
        List<Integer> expected = new ArrayList<>();
        for (int height : heights) {
            expected.add(height);
        }
        Collections.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected.get(i)) {
                count++;
            }
        }
        return count;
    }
}
