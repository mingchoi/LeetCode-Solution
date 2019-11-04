package io.github.mingchoi.leetcodesolutionjava.solution.q237_delete_node_in_a_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.Stack;

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}