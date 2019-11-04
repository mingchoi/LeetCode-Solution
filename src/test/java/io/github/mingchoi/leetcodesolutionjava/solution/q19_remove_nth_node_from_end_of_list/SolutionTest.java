package io.github.mingchoi.leetcodesolutionjava.solution.q19_remove_nth_node_from_end_of_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        class TestCase {
            public ListNode expected;
            public ListNode l1;
            public int n;

            public TestCase(ListNode ex, ListNode l1, int n) {
                this.expected = ex;
                this.l1 = l1;
                this.n = n;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        new ListNode(new int[]{1, 2, 3, 5}),
                        new ListNode(new int[]{1, 2, 3, 4, 5}),
                        2
                ),
                new TestCase(
                        new ListNode(new int[]{1, 2}),
                        new ListNode(new int[]{1, 2, 3}),
                        1
                ),
                new TestCase(
                        new ListNode(new int[]{2, 3}),
                        new ListNode(new int[]{1, 2, 3}),
                        3
                )
        };

        for (TestCase c : cases) {
            ListNode r = new Solution().removeNthFromEnd(c.l1, c.n);
            assertEquals(c.expected, r);
        }
    }
}