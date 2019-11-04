package io.github.mingchoi.leetcodesolutionjava.solution.q2_add_two_numbers;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
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
                        new ListNode(new int[]{7, 0, 8}),
                        new ListNode(new int[]{2, 4, 3}),
                        new ListNode(new int[]{5, 6, 4})
                ),
                new TestCase(
                        new ListNode(new int[]{0, 3}),
                        new ListNode(new int[]{5}),
                        new ListNode(new int[]{5, 2})
                ),
                new TestCase(
                        new ListNode(new int[]{0, 1}),
                        new ListNode(new int[]{5}),
                        new ListNode(new int[]{5})
                ),
                new TestCase(
                        new ListNode(new int[]{0}),
                        new ListNode(new int[]{0}),
                        new ListNode(new int[]{0})
                )
        };
        for (TestCase c : cases) {
            ListNode r = new Solution().addTwoNumbers(c.l1, c.l2);
            assertEquals(r, c.expected);
        }
    }
}