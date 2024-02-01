package com.company.easy;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/implement-queue-using-stacks/">232. Implement Queue using Stacks</a>
 * Runtime: 0ms, beats: 100%; Memory: 41.25MB, beats: 40.09%
 * @author Mike Kostenko on 29/01/2024
 */
public class A0232MyQueue {
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

    public static void main(String[] args) {
     MyQueue obj = new MyQueue();
     obj.push(1);
     obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
class MyQueue {
    Stack<Integer> res;
    Stack<Integer> tmp;
    public MyQueue() {
        res = new Stack<>();
        tmp = new Stack<>();
    }
    public void push(int x) {
        while (!res.empty()) {
            tmp.push(res.pop());
        }
        res.push(x);
        while (!tmp.empty()) {
            res.push(tmp.pop());
        }
    }
    public int pop() {
        return res.pop();
    }
    public int peek() {
        return res.peek();
    }
    public boolean empty() {
        return res.empty();
    }
}
