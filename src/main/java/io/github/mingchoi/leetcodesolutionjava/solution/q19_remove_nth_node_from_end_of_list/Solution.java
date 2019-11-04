package io.github.mingchoi.leetcodesolutionjava.solution.q19_remove_nth_node_from_end_of_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode emptyHead = new ListNode(0);
        emptyHead.next = head;
        fn(emptyHead, emptyHead.next, n);
        return emptyHead.next;
    }

    private int fn(ListNode prev, ListNode node, int n) {
        int index;

        // Recursively get index
        if (node.next == null) {
            index = 1;
        } else {
            index = fn(node, node.next, n) + 1;
        }

        // Remove node
        if (index == n) {
            prev.next = node.next;
        }
        return index;
    }
}
