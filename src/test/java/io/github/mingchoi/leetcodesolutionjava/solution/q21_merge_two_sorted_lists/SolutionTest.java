package io.github.mingchoi.leetcodesolutionjava.solution.q21_merge_two_sorted_lists;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        class TestCase {
            public ListNode expected;
            public ListNode l1;
            public ListNode l2;

            public TestCase(ListNode ex, ListNode l1, ListNode l2) {
                this.expected = ex;
                this.l1 = l1;
                this.l2 = l2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        new ListNode(new int[]{1, 1, 2, 3, 4, 4}),
                        new ListNode(new int[]{1, 2, 4}),
                        new ListNode(new int[]{1, 3, 4})
                )
        };

        for (TestCase c : cases) {
            ListNode r = new Solution().mergeTwoLists(c.l1, c.l2);
            assertEquals(c.expected, r);
        }
    }
}