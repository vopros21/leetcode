package com.company.medium;

/**
 * <a href="https://leetcode.com/problems/out-of-boundary-paths/">576. Out of Boundary Paths</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 *
 * @author Mike Kostenko on 26/01/2024
 */
public class B0576OutOfBoundaryPath {
    private static int res;

    public static void calculate(int m, int n, int maxMove, int startRow, int startColumn) {
        if (startColumn > n - 1 || startColumn < 0 || startRow > m - 1 || startRow < 0) {
            res++;
            return;
        }
        if (maxMove == 0) {
            return;
        }
        int[] moves = {1, -1};
        for (int i: moves) {
            calculate(m, n, maxMove - 1, startRow + i, startColumn);
        }
        for (int i: moves) {
            calculate(m, n, maxMove - 1, startRow, startColumn + i);
        }
    }
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        calculate(m, n, maxMove, startRow, startColumn);
        return res;
    }

    public static void main(String[] args) {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;
        System.out.println(findPaths(m, n ,maxMove, startRow, startColumn));
        res = 0;
        m = 1; n = 3; maxMove = 3;startColumn = 1;
        System.out.println(findPaths(m, n ,maxMove, startRow, startColumn));
    }
}
