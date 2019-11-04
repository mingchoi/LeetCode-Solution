package io.github.mingchoi.leetcodesolutionjava.solution.q21_merge_two_sorted_lists;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            node = node.next;
        }
        return head.next;
    }
}
