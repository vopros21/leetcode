package com.company.structures;

/**
 * @author Mike Kostenko on 15/04/2024
 */
public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode() {}
     public TreeNode(int val) { this.val = val; }
     public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
