package com.company.structures;

/**
 * @author Mike Kostenko on 30/01/2024
 */
public class ListNode {
    int val;
    public ListNode next;
    @SuppressWarnings("unused")
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "{value: " + val + ", hasNext: " + (next != null) + "}";
    }
}
