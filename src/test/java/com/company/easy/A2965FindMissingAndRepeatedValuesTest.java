package com.company.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class A2965FindMissingAndRepeatedValuesTest {

    private final A2965FindMissingAndRepeated solution = new A2965FindMissingAndRepeated();

    @Test
    public void testExample1() {
        int[][] grid = {
                {1, 3},
                {2, 2}
        };
        int[] expected = {2, 4};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testExample2() {
        int[][] grid = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };
        int[] expected = {9, 5};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testMinimumSizeGrid() {
        int[][] grid = {{1, 1}};
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testLargerGrid() {
        int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 15}
        };
        int[] expected = {15, 16};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testRepeatedInFirstPosition() {
        int[][] grid = {
                {1, 2},
                {1, 4}
        };
        int[] expected = {1, 3};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testRepeatedInLastPosition() {
        int[][] grid = {
                {1, 2},
                {3, 1}
        };
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testMissingFirstNumber() {
        int[][] grid = {
                {2, 3},
                {4, 5}
        };
        int[] expected = {5, 1};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testMissingLastNumber() {
        int[][] grid = {
                {1, 2},
                {3, 1}
        };
        int[] expected = {1, 4};
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }

    @Test
    public void testMultipleRepeatedValues() {
        // Note: This test should fail as the method assumes only one repeated value
        // But it's good to test edge cases
        int[][] grid = {
                {1, 2},
                {2, 2}
        };
        int[] expected = {2, 3}; // First encountered repeated value is 2, missing is 3
        assertArrayEquals(expected, solution.findMissingAndRepeatedValues(grid));
    }
}
