package io.github.mingchoi.leetcodesolutionjava.solution.q876_middle_of_the_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void middleNode() {
        ListNode third = new ListNode(3,
                new ListNode(4,
                        new ListNode(5)));
        assertEquals(third,
                new Solution().middleNode(
                        new ListNode(1,
                                new ListNode(2, third
                                )
                        )
                )
        );

        ListNode forth = new ListNode(4,
                new ListNode(5,
                        new ListNode(6)));
        assertEquals(forth,
                new Solution().middleNode(
                        new ListNode(1,
                                new ListNode(2, new ListNode(3, forth)
                                )
                        )
                )
        );

        ListNode first = new ListNode(1);
        assertEquals(first, new Solution().middleNode(first));
    }
}