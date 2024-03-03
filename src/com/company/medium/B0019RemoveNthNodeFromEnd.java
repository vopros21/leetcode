package com.company.medium;

import com.company.structures.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description">19. Remove Nth Node From End of List</a>
 *  * Runtime: 0ms, beats: 100%; Memory: 41.42MB, beats: 76.47%
 *
 * @author Mike Kostenko on 03/03/2024
 */
public class B0019RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode tmp = head;
        int count = 1;
        while (tmp.next != null) {
            count++;
            tmp = tmp.next;
        }
        if (count == n) {
            return head.next;
        }
        tmp = head;
        while (tmp != null) {
            if (count == 1) {
                return tmp.next;
            }
            if (count == n + 1 && tmp.next != null) {
                tmp.next = tmp.next.next;
            }
            count--;
            tmp = tmp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        B0019RemoveNthNodeFromEnd ob = new B0019RemoveNthNodeFromEnd();
        System.out.println("<---TEST1--->");
        ListNode listA = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, new ListNode(5)))));
        System.out.println(listA.printStructure());
        ListNode result = ob.removeNthFromEnd(listA, 2);
        System.out.println(result == null ? null : result.printStructure());

        System.out.println("<---TEST2--->");
        ListNode listB = new ListNode(1);
        System.out.println(listB.printStructure());
        ListNode resB = ob.removeNthFromEnd(listB, 1);
        System.out.println(resB);

        System.out.println("<---TEST3--->");
        ListNode listC = new ListNode(1, new ListNode(2));
        System.out.println(listC.printStructure());
        ListNode resC = ob.removeNthFromEnd(listC, 1);
        System.out.println(resC.printStructure());

        System.out.println("<---TEST4--->");
        ListNode listD = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, new ListNode(5)))));
        System.out.println(listD.printStructure());
        ListNode resD = ob.removeNthFromEnd(listD, 5);
        System.out.println(resD.printStructure());
    }
}
