package com.company.easy;

import com.company.structures.ListNode;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 * Runtime: 14ms, beats: 15.21%; Memory: 58.34MB, beats: 80.89%
 *
 * @author Mike Kostenko on 22/03/2024
 */
public class A234LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode first = head;
        while (head != null) {
            st.push(head.getVal());
            head = head.next;
        }
        head = first;
        while(head != null) {
            if (head.getVal() != st.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
