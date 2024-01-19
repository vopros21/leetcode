package com.company;

/**
 *  * <a href="https://leetcode.com/problems/minimum-falling-path-sum/">931. Minimum Falling Path Sum</a>
 *  * Runtime: 4ms, beats: 75.73%; Memory: 45.31MB, beats: 25.89%
 *
 * @author Mike Kostenko on 19/01/2024
 */
public class B0931MinFallingPathSum {
    static class Node {
        int d = Integer.MAX_VALUE;
        Node parent;
    }

    private static void relax(Node a, Node b, int cost) {
        if (a.d + cost < b.d) {
            b.d = a.d + cost;
            b.parent = a;
        }
    }
    public static int minFallingPathSum(int[][] matrix) {
        Node root = new Node();
        root.d = 0;
        int n = matrix.length;
        Node[][] nodes = new Node[n][n];
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Node current = new Node();
            relax(root, current, matrix[0][i]);
            nodes[0][i] = current;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int weight = matrix[i][j];
                Node current = new Node();
                int leftParentIndex = Math.max(0, j - 1);
                int rightParentIndex = Math.min(n - 1, j + 1);
                for (int k = leftParentIndex; k < rightParentIndex + 1; k++) {
                    relax(nodes[i - 1][k], current, weight);
                }
                nodes[i][j] = current;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nodes[n - 1][i].d < minSum) {
                minSum = nodes[n - 1][i].d;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[][] one = {{2,1,3}, {6,5,4}, {7,8,9}};
        int[][] two = {{-19, 57}, {-40, -5}};
        int[][] three = {{2, 3, 7, 1}, {5, 8, 1, 9}, {12,4,2,7}, {1,3,8,6}};
        System.out.println("one: " +minFallingPathSum(one));
        System.out.println("two: " +minFallingPathSum(two));
        System.out.println("three: " +minFallingPathSum(three));
    }
}
