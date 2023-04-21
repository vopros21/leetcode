package com.company;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 * * Runtime: 15ms, beats: 22.91%; Memory: 47.3MB, beats: 33.85%
 *
 * @author Mike Kostenko on 21/04/2023
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(new MajorityElement().majorityElement(numbers));
    }
}
