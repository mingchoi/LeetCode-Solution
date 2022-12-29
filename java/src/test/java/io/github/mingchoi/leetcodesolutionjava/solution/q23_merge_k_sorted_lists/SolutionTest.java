package io.github.mingchoi.leetcodesolutionjava.solution.q23_merge_k_sorted_lists;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mergeKLists() {
        class TestCase {
            public ListNode expected;
            public ListNode[] l1;

            public TestCase(ListNode ex, ListNode[] l1) {
                this.expected = ex;
                this.l1 = l1;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        new ListNode(new int[]{1, 1, 2, 3, 4, 4, 5, 6}),
                        new ListNode[]{
                                new ListNode(new int[]{1, 4, 5}),
                                new ListNode(new int[]{1, 3, 4}),
                                new ListNode(new int[]{2, 6})
                        }
                )
        };

        for (TestCase c : cases) {
            ListNode r = new Solution().mergeKLists(c.l1);
            assertEquals(c.expected, r);
        }
    }
}