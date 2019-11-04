package io.github.mingchoi.leetcodesolutionjava.solution.q206_reverse_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 37.2 MB, less than 98.56% of Java online submissions for Reverse Linked List.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode src = head.next;
        ListNode tar = head;
        tar.next = null;
        while (src != null) {
            ListNode tmp = src.next;
            src.next = tar;
            tar = src;
            src = tmp;
        }
        return tar;
    }
}
