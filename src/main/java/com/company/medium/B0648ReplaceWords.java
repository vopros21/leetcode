package com.company.medium;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/replace-words">648. Replace Words</a>
 * <p>
 * Runtime: 47ms, beats: 35.44%; Memory: 51.45MB, beats: 98.61%
 *
 * @author Mike Kostenko on 07/06/2024
 */
public class B0648ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        // sort dictionary alphabetically
        List<String> sorted = new ArrayList<>(dictionary);
        Collections.sort(sorted);

        Map<String, String> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                words[i] = map.get(words[i]);
            } else {
                for (String root : sorted) {
                    if (words[i].startsWith(root)) {
                        map.put(words[i], root);
                        words[i] = root;
                        break;
                    }
                }
            }
        }
        return words.length == 0 ? "" : String.join(" ", words);
    }

    public static void main(String[] args) {
        B0648ReplaceWords test = new B0648ReplaceWords();
        System.out.println(test.replaceWords(List.of("catt", "cat", "bat", "rat"), "the cattle was rattled by the battery"));
    }
}
