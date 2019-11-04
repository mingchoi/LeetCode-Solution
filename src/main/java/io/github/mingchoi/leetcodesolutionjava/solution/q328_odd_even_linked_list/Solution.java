package io.github.mingchoi.leetcodesolutionjava.solution.q328_odd_even_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Odd Even Linked List.
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddTail = odd;
        ListNode evenTail = even;

        boolean isOdd = true;
        ListNode curr = evenTail.next;

        while (curr != null) {
            if (isOdd) {
                oddTail.next = curr;
                oddTail = oddTail.next;
            } else {
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
            isOdd = !isOdd;
            curr = curr.next;
        }
        oddTail.next = even;
        evenTail.next = null;
        return odd;
    }
}
