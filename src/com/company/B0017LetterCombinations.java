package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations of a Phone Number</a>
 * Runtime: 0ms, beats: 100%; Memory: 42.13MB, beats: 28.15%
 *
 * @author Mike Kostenko on 23/01/2024
 */
public class B0017LetterCombinations {
    static Map<Character, char[]> map;
    static {
        map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'j', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }
    public static List<String> getResult(String input) {
        if (input.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        if (input.length() == 1) {
            for (char c: map.get(input.charAt(0))) {
                res.add(String.valueOf(c));
            }
            return res;
        } else {
            List<String> tmp = getResult(input.substring(1));
            for (char c: map.get(input.charAt(0))) {
                for (String s: tmp) {
                    String sb = c + s;
                    res.add(sb);
                }
            }
        }
        return res;
    }



    public static void main(String[] args) {
        String one = "";
        System.out.println(getResult(one));
    }
}
