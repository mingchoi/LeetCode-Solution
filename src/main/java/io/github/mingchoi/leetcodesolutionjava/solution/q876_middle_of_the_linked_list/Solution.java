package io.github.mingchoi.leetcodesolutionjava.solution.q876_middle_of_the_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Middle of the Linked List.
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode pt1x = head;
        ListNode pt2x = head;
        while (pt2x != null && pt2x.next != null) {
            pt1x = pt1x.next;
            pt2x = pt2x.next.next;
        }
        return pt1x;
    }

    public ListNode middleNode_array(ListNode head) {
        if (head.next == null) return head;
        if (head.next.next == null) return head.next;
        ListNode[] list = new ListNode[100];
        ListNode curr = head;
        int len = 0;
        while (curr.next != null) {
            list[len] = curr;
            len++;
            curr = curr.next;
        }
        len++;
        return list[len / 2];
    }
}