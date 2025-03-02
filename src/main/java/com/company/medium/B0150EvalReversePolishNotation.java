package com.company.medium;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</a>
 * Runtime: 6ms, beats: 78.23%; Memory: 44.15MB, beats: 72.98%
 *
 * @author Mike Kostenko on 30/01/2024
 */
public class B0150EvalReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Set<String> set = Set.of("/", "+", "-", "*");
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens) {
            if (!set.contains(token)) {
                stack.add(Integer.parseInt(token));
                continue;
            }
            stack.add(calculate(stack.pop(), token, stack.pop()));
        }
        return stack.pop();
    }
    public static int calculate(int second, String operand, int first) {
        if ("/".equals(operand)) {
            return first / second;
        }
        if ("*".equals(operand)) {
            return first * second;
        }
        if ("-".equals(operand)) {
            return first - second;
        }
        return first + second;
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(Arrays.toString(tokens) + ": " + evalRPN(tokens));
        tokens = new String[]{"4", "13", "5", "/", "+"};
        System.out.println(Arrays.toString(tokens) + ": " + evalRPN(tokens));
        tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(Arrays.toString(tokens) + ": " + evalRPN(tokens));
    }
}
