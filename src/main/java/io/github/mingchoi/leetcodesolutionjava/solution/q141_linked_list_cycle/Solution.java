package io.github.mingchoi.leetcodesolutionjava.solution.q141_linked_list_cycle;


import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.HashMap;

public class Solution {


    public boolean hasCycle(ListNode head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ListNode node = head;
        while (node != null && node.next != null) {
            node = node.next;
            if (map.get(node.hashCode()) != null) {
                return true;
            }
            map.put(node.hashCode(), true);
        }
        return false;
    }
}
