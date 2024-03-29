package com.company.structures;

import lombok.Getter;

/**
 * @author Mike Kostenko on 30/01/2024
 */
public class ListNode {
    @Getter
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

    public String printStructure() {
        StringBuilder sb = new StringBuilder();
        ListNode tmp = this;
        while (tmp != null) {
            sb.append(tmp);
            if (tmp.next != null) {
                sb.append(" -> ");
            }
            tmp = tmp.next;
        }
        return sb.toString();
    }
}
