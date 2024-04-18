package com.company.easy;/**
 * <a href="https://leetcode.com/problems/island-perimeter/">463. Island Perimeter</a>
 * Runtime: 9ms, beats: 14.23%; Memory: 45.30MB, beats: 81.43%
 *
 * @author Mike Kostenko on 18/04/2024
 */
public class A0463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int[][] neighbors = new int[][]{{i - 1, j}, {i + 1, j}, {i, j - 1}, {i, j + 1}};
                    for (int[] neigh: neighbors) {
                        if (neigh[0] < 0 || neigh[0] >= grid.length || neigh[1] < 0 || neigh[1] >= grid[0].length || grid[neigh[0]][neigh[1]] == 0) {
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        A0463IslandPerimeter solution = new A0463IslandPerimeter();
        System.out.printf("Test 1: perimeter: 16 -> %d\n", solution.islandPerimeter(grid));
        grid = new int[][]{{1, 0}};
        System.out.printf("Test 2: perimeter: 4 -> %d\n", solution.islandPerimeter(grid));
        grid = new int[][]{{0, 1}};
        System.out.printf("Test 3: perimeter: 4 -> %d", solution.islandPerimeter(grid));
    }
}
