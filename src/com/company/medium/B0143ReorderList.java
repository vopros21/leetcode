package com.company.medium;

import com.company.structures.ListNode;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 * Runtime: 3ms, beats: 23.73%; Memory: 48.27MB, beats: 42.05%
 *
 * @author Mike Kostenko on 23/03/2024
 */
public class B0143ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new java.util.ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }
        current = head;
        for (int i = 1; i <= nodes.size() / 2; i++) {
            current.next = nodes.get(nodes.size() - i);
            current = current.next;
            current.next = nodes.get(i);
            current = current.next;
        }
        current.next = null;
    }

    public static void main(String[] args) {
        B0143ReorderList test = new B0143ReorderList();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        test.reorderList(head);
        System.out.println(head.printStructure()); // 1->5->2->4->3
    }
}
