package com.company.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class B1992AllGroupsOfFarmlandTest {

    @Test
    void findFarmland1() {
        int[][] land = new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0, 0}, {1, 1, 2, 2}};
        int[][] actual = new B1992AllGroupsOfFarmland().findFarmland(land);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findFarmland2() {
        int[][] land = new int[][]{{1, 1}, {1, 1}};
        int[][] expected = new int[][]{{0, 0, 1, 1}};
        int[][] actual = new B1992AllGroupsOfFarmland().findFarmland(land);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findFarmland3() {
        int[][] land = new int[][]{{0}};
        int[][] expected = new int[][]{};
        int[][] actual = new B1992AllGroupsOfFarmland().findFarmland(land);
        assertArrayEquals(expected, actual);
    }
}