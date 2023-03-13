package com.company;

import static com.company.MergeSortedLinkedLists.*;

public class Main {

    public static void main(String[] args) {
        Solution newSolution = new Solution();
        ListNode listA = new ListNode(4, new ListNode(5));
        ListNode listB = new ListNode(1, new ListNode(7));
        ListNode result = newSolution.mergeTwoLists(listA, listB);
        System.out.println(result);
    }
}
