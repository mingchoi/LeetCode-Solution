package io.github.mingchoi.leetcodesolutionjava.solution.q206_reverse_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseList() {
        assertEquals(
                new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))).toString(),
                new Solution().reverseList(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
                ).toString()
        );
    }
}