package com.company.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 * Runtime: 33ms, beats: 5.11%; Memory: 54.66MB, beats: 5.05%
 *
 * @author Mike Kostenko on 19/04/2024
 */
public class B0200NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    walkOnIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void walkOnIsland(char[][] grid, int i, int j) {
        Set<int[]> cells = new HashSet<>();
        cells.add(new int[]{i, j});
        while (!cells.isEmpty()) {
            List<int[]> newCells = new ArrayList<>();
            for (int[] cell : cells) {
                int x = cell[0];
                int y = cell[1];
                if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == '0') {
                    continue;
                }
                grid[x][y] = '0';
                newCells.add(new int[]{x - 1, y});
                newCells.add(new int[]{x + 1, y});
                newCells.add(new int[]{x, y - 1});
                newCells.add(new int[]{x, y + 1});
            }
            cells = new HashSet<>(newCells);
        }
    }
}
