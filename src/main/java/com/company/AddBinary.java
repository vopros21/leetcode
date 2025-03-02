package com.company;

/**
 * <a href="https://leetcode.com/problems/add-binary/">Add Binary</a>
 * Runtime: ms, beats: %; Memory: MB, beats: %
 *
 * @author Mike Kostenko on 13/03/2023
 */
public class AddBinary {
    // parceInt and toBinaryString: https://stackoverflow.com/questions/8548586/adding-binary-numbers
    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        String shortWord;
        String longWord;
        char c = '0';
        if (a.length() > b.length()) {
            shortWord = b;
            longWord = a;
        } else {
            shortWord = a;
            longWord = b;
        }
        int lenShort = shortWord.length();
        int lenLong = longWord.length();
        for (int i = 0; i < lenLong; i++) {
            char curLong = longWord.charAt(lenLong - i - 1);
            char curShort = i >= lenShort ? '0' : shortWord.charAt(lenShort - i - 1);
            char temp = curShort == curLong ? '0' : '1';
            result.insert(0, c == temp ? '0' : '1');
            c = (curLong == '1' && temp == '0') ? '1' : '0';
        }
        if (c == '1') {
            result.insert(0, c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String one = "11111";
        String two = "1";
        System.out.println(addBinary(one, two));
    }
}
