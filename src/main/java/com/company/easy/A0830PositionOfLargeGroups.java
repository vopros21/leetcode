package com.company.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  <a href="https://leetcode.com/problems/positions-of-large-groups/">830. Positions of Large Groups</a>
 *  Runtime: 3ms, beats:8.56 %; Memory: 44.68MB, beats: 38.29%
 *
 * @author Mike Kostenko on 09/03/2024
 */
public class A0830PositionOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0;
        int end = 0;
        char c = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c){
                if (i - start >= 3) {
                    res.add(new ArrayList<>(List.of(start, i - 1)));
                }
                start = i;
                c = s.charAt(start);
            }
            end = i;
        }
        if (end - start >= 2) {
            res.add(new ArrayList<>(List.of(start, end)));
        }
        return res;
    }

    public static void main(String[] args) {
        A0830PositionOfLargeGroups cl = new A0830PositionOfLargeGroups();
        String s = "aaa";
        System.out.println(cl.largeGroupPositions(s));
    }
}
