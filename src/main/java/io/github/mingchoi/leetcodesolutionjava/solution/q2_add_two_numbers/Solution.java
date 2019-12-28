package io.github.mingchoi.leetcodesolutionjava.solution.q2_add_two_numbers;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

/*
Runtime: 2 ms, faster than 79.53% of Java online submissions for Add Two Numbers.
Memory Usage: 42.1 MB, less than 90.59% of Java online submissions for Add Two Numbers.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int i = 0;
        boolean carry = false;
        while (true) {
            int sum = 0;
            if (carry) {
                sum += 1;
                carry = false;
            }
            if (l1 != null) {
                sum += l1.val;
            }
            if (l2 != null) {
                sum += l2.val;
            }
            if (sum > 9) {
                sum -= 10;
                carry = true;
            }

            current.next = new ListNode(sum);
            current = current.next;

            // Next
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // Break if end
            if (l1 == null && l2 == null && carry == false) {
                break;
            }
        }

        return result.next;
    }
}
