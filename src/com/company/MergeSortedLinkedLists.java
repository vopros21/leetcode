package com.company;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">21. Merge Two Sorted Lists</a>
 * Runtime: 0ms, beats: 100% (looks like an error); Memory: 42MB, beats: 39,34%
 * @author Mike Kostenko on 12/03/2023
 */
public class MergeSortedLinkedLists {

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            } else if (list2 == null) {
                return list1;
            }
            ListNode beginning;
            if (list1.val < list2.val) {
                beginning = list1;
                list1 = list1.next;
            } else {
                beginning = list2;
                list2 = list2.next;
            }
            ListNode temp = beginning;
            while (list1 != null && list2 != null){
                if (list1.val < list2.val) {
                    temp.next = list1;
                    temp = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    temp = list2;
                    list2 = list2.next;
                }
            }
            if (list1 == null) {
                temp.next = list2;
            } else {
                temp.next = list1;
            }
            return beginning;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString(){
            return "ListNode: \n\tval: " + val + "\n\tnext: " + next;
        }
    }

    public static void main(String[] args) {
        Solution newSolution = new Solution();
        ListNode listA = new ListNode(4, new ListNode(5));
        ListNode listB = new ListNode(1, new ListNode(7));
        ListNode result = newSolution.mergeTwoLists(listA, listB);
        System.out.println(result);
    }
}
