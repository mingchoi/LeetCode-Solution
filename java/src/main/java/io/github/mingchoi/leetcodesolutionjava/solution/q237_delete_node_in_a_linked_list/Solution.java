package io.github.mingchoi.leetcodesolutionjava.solution.q237_delete_node_in_a_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.Stack;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}