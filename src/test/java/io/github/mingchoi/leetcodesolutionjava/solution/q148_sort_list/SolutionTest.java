package io.github.mingchoi.leetcodesolutionjava.solution.q148_sort_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortList() {
        class TestCase {
            public ListNode expected;
            public ListNode head;

            public TestCase(ListNode ex, ListNode head) {
                this.expected = ex;
                this.head = head;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(null, null),
                new TestCase(
                        new ListNode(1, new ListNode(2)),
                        new ListNode(2, new ListNode(1))
                ),
                new TestCase(
                        new ListNode(1, new ListNode(2, new ListNode(3))),
                        new ListNode(3, new ListNode(2, new ListNode(1)))
                ),
                new TestCase(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4)))),
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(4,
                                                new ListNode(1))))
                ),
                new TestCase(
                        new ListNode(-1,
                                new ListNode(0,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5))))),
                        new ListNode(-1,
                                new ListNode(5,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(0)))))
                )
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().sortList(c.head));
        }
    }
}