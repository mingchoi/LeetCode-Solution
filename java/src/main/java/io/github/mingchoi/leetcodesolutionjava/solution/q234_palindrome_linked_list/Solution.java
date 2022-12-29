package io.github.mingchoi.leetcodesolutionjava.solution.q234_palindrome_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*
Runtime: 2 ms, faster than 39.47% of Java online submissions for Palindrome Linked List.
Memory Usage: 40.4 MB, less than 98.78% of Java online submissions for Palindrome Linked List.
*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode c = head;
        while (c != null) {
            len++;
            c = c.next;
        }
        c = head;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len / 2; i++) {
            stack.add(c.val);
            c = c.next;
        }
        if (len % 2 == 1) c = c.next;
        while (!stack.isEmpty()) {
            if (stack.pop() != c.val) {
                return false;
            }
            c = c.next;
        }
        return true;
    }

    /*
    Runtime: 7 ms, faster than 6.87% of Java online submissions for Palindrome Linked List.
    Memory Usage: 43.6 MB, less than 8.54% of Java online submissions for Palindrome Linked List.
     */
    public boolean isPalindrome_slow(ListNode head) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode c = head;
        while (c != null) {
            queue.add(c.val);
            stack.add(c.val);
            c = c.next;
        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) return false;
        }
        return true;
    }
}