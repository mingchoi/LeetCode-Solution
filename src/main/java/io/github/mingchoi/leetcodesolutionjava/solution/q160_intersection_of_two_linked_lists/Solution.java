package io.github.mingchoi.leetcodesolutionjava.solution.q160_intersection_of_two_linked_lists;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.HashMap;

public class Solution {
    /*
    Runtime: 8 ms, faster than 13.81% of Java online submissions for Intersection of Two Linked Lists.
    Memory Usage: 38.7 MB, less than 47.86% of Java online submissions for Intersection of Two Linked Lists.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        HashMap<ListNode, Boolean> dict = new HashMap<>();
        ListNode c = headA;
        while (c != null) {
            dict.put(c, true);
            c = c.next;
        }
        c = headB;
        while (c != null) {
            if (dict.get(c) != null) {
                return c;
            }
            c = c.next;
        }
        return null;
    }
}