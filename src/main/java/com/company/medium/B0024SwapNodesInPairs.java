package com.company.medium;

import com.company.structures.ListNode;

/**
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">24. Swap Nodes in Pairs</a>
 * Runtime: 0ms, beats: 100%; Memory: 40.80MB, beats: 70.92%
 *
 * @author Mike Kostenko on 30/01/2024
 */
public class B0024SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode f = head;
        ListNode s = head.next;
        head = s;
        while (true) {
            ListNode t = s.next;
            s.next = f;
            f.next = t;
            if (t == null || t.next == null) {
                break;
            }
            f.next = t.next;
            f = t;
            s = f.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        B0024SwapNodesInPairs nodesInPairs = new B0024SwapNodesInPairs();
        ListNode current = nodesInPairs.swapPairs(head);
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
