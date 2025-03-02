package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/">349. Intersection of Two Arrays</a>
 * * Runtime: 6ms, beats: 14.46%; Memory: 42.75MB, beats: 93.83%
 *
 * @author Mike Kostenko on 10/03/2024
 */

public class A0349IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());
        List<Integer> l1 = new ArrayList<>();
        for (int i : nums2) {
            if (s1.contains(i) && !l1.contains(i)) {
                l1.add(i);
            }
        }
        return l1.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        A0349IntersectionTwoArrays cl = new A0349IntersectionTwoArrays();
        int[] n1 = {1, 3};
        int[] n2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(cl.intersection(n1, n2)));
    }
}
