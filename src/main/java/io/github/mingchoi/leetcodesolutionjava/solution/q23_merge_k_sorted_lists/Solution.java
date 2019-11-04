package io.github.mingchoi.leetcodesolutionjava.solution.q23_merge_k_sorted_lists;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));
        ListNode head = new ListNode(0);
        ListNode node = head;

        while (true) {
            if (list.size() == 0) {
                break;
            }

            int index = 0;
            int min = list.get(0).val;
            for (int i = 1; i < list.size(); i++) {
                int val = list.get(i).val;
                if (val < min) {
                    index = i;
                    min = val;
                }
            }

            node.next = new ListNode(min);
            node = node.next;

            ListNode next = list.get(index).next;
            if (next == null) {
                list.remove(index);
            } else {
                list.set(index, next);
            }
        }

        return head.next;
    }
}
