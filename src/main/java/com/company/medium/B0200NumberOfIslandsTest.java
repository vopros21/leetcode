package com.company.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class B0200NumberOfIslandsTest {
    static B0200NumberOfIslands cl = new B0200NumberOfIslands();

    @Test
    void numIslands1() {
        char[][] map = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        assertEquals(1, cl.numIslands(map));
    }

    @Test
    void numIsland3() {
        char[][] map = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        assertEquals(3, cl.numIslands(map));
    }
}