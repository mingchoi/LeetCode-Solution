package io.github.mingchoi.leetcodesolutionjava.solution.q148_sort_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

class Solution {
    public ListNode sortList(ListNode head) {
        return quickSort(head);
    }

    class Pivot {
        int val;
        ListNode smaller;
        ListNode bigger;
    }

    public ListNode concat(ListNode head, ListNode tail) {
        ListNode c = head;
        while (c.next != null) {
            c = c.next;
        }
        c.next = tail;
        return head;
    }

    public ListNode quickSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Pivot p = new Pivot();
        p.val = head.val;
        ListNode h = head.next;
        while (h != null) {
            ListNode c = h;
            h = c.next;
            if (c.val > p.val) {
                c.next = p.bigger;
                p.bigger = c;
            } else {
                c.next = p.smaller;
                p.smaller = c;
            }
        }

        if (p.smaller != null)
            p.smaller = quickSort(p.smaller);
        if (p.bigger != null)
            p.bigger = quickSort(p.bigger);

        ListNode pn = new ListNode(p.val);
        pn.next = p.bigger;
        if (p.smaller != null) {
            return concat(p.smaller, pn);
        }
        return pn;
    }
}