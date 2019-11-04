package io.github.mingchoi.leetcodesolutionjava.solution.q234_palindrome_linked_list;

import io.github.mingchoi.leetcodesolutionjava.datastructure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        assertTrue(
                new Solution().isPalindrome(
                        new ListNode(-129, new ListNode(-129))
                )
        );
    }
}