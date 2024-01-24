package com.company;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/">1457. Pseudo-Palindromic Paths in a Binary Tree</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 * @author Mike Kostenko on 24/01/2024
 */
public class B1457PseudoPalindromicPath {
    static Stack<TreeNode> stack = new Stack<>();
    static Map<TreeNode, Integer> visited = new HashMap<>();
    static int res;
    static List<Integer> list = new ArrayList<>();
    public static int pseudoPalindromicPaths (TreeNode root) {
        stack.add(root);
        int levels = 0;
        visited.put(root, levels);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (visited.get(current) < levels) {
                while (levels != visited.get(current)) {
                    list.remove(levels - 1);
                    levels--;
                }
            }
            list.add(current.val);
            if (current.left == null && current.right == null) {
                if (checkPath(list)) {
                    System.out.println("List: " + list);
                    res++;
                    System.out.println("Result: " + res);
                }
                list.remove(levels);
            } else {
                levels++;
                if (current.left != null) {
                    stack.add(current.left);
                    visited.put(current.left, levels);
                }
                if (current.right != null) {
                    stack.add(current.right);
                    visited.put(current.right, levels);
                }
            }
        }
        return res;
    }

    private static boolean checkPath(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i: list) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.size() == 1 || set.isEmpty();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode secondLevelLeft = new TreeNode(7);
        TreeNode secondLevelRight = new TreeNode(1);
        root.left = secondLevelLeft;
        root.right = secondLevelRight;
        TreeNode thirdLevelOne = new TreeNode(1);
        TreeNode thirdLevelTwo = new TreeNode(5);
        TreeNode thirdLevelThree = new TreeNode(3);
        TreeNode fourthLevelOne = new TreeNode(5);
        TreeNode fourthLevelTwo = new TreeNode(4);
        secondLevelLeft.right = thirdLevelOne;
        secondLevelRight.left = thirdLevelTwo;
        secondLevelRight.right = thirdLevelThree;
        thirdLevelOne.right = fourthLevelOne;
        thirdLevelThree.right = fourthLevelTwo;
        System.out.println(pseudoPalindromicPaths(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
}
