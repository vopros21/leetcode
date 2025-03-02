package com.company.easy;

/**
 * <a href="https://leetcode.com/problems/find-the-pivot-integer/">2485. Find the Pivot Integer</a>
 *  * Runtime: 0ms, beats: 100%; Memory: 40.29MB, beats: 88.87%
 *
 * @author Mike Kostenko on 13/03/2024
 */
public class A2485FindThePivotInteger {
    public int pivotInteger(int n) {
        int leftSum = 0;
        int rightSum = 0;
        int left = 0;
        int right = n + 1;
        while (left != right) {
            if (leftSum < rightSum) {
                left++;
                leftSum += left;
            } else {
                right--;
                rightSum += right;
            }
        }
        return leftSum == rightSum ? left : -1;
    }

    public static void main(String[] args) {
        A2485FindThePivotInteger cl = new A2485FindThePivotInteger();
        int n = 8;
        int result = cl.pivotInteger(n);
        System.out.println("Answer for " + n + " is " + result);
        result = cl.pivotInteger(1);
        System.out.println("Answer for " + 1 + " is " + result);
        result = cl.pivotInteger(4);
        System.out.println("Answer for " + 4 + " is " + result);
    }
}
