package com.company.easy;

/**
 * <a href="https://leetcode.com/problems/robot-return-to-origin/">657. Robot Return to Origin</a>
 * Runtime: 4ms, beats: 97.31%; Memory: 44.55MB, beats: 35.95%
 *
 * @author Mike Kostenko on 08/03/2024
 */
public class A0657RobotReturned {
    public boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    ver++;
                    break;
                case 'D':
                    ver--;
                    break;
                case 'L':
                    hor--;
                    break;
                case 'R':
                    hor++;
            }
        }
        return hor == 0 && ver == 0;
    }

    public static void main(String[] args) {
        A0657RobotReturned cl = new A0657RobotReturned();
        String input = "UD";
        System.out.println(cl.judgeCircle(input));
    }
}

