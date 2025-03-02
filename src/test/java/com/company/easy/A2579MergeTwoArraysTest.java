package com.company.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class A2579MergeTwoArraysTest {

    @Test
    void mergeArrays() {
        A2579MergeTwoArrays instance = new A2579MergeTwoArrays();

        int[][] input1 = {{1, 3}, {2, 4}};
        int[][] input2 = {{2, 1}, {5, 6}, {7, 8}};
        int[][] expected = {{1, 3}, {2, 5}, {5, 6}, {7, 8}};
        assertArrayEquals(expected, instance.mergeArrays(input1, input2));

        int[][] input3 = {{1, 2}, {3, 4}};
        int[][] input4 = {{2, 3}, {3, 5}};
        int[][] expected2 = {{1, 2}, {2, 3}, {3, 9}};
        assertArrayEquals(expected2, instance.mergeArrays(input3, input4));

        int[][] input5 = {{1, 1}};
        int[][] input6 = {{1, 2}};
        int[][] expected3 = {{1, 3}};
        assertArrayEquals(expected3, instance.mergeArrays(input5, input6));
    }
}
