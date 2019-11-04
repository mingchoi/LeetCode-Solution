package io.github.mingchoi.leetcodesolutionjava.solution.q138_copy_list_with_random_pointer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void copyRandomList() {
        Node n1 = new Node(1, null, null);
        Node n2 = new Node(2, null, null);
        n1.next = n2;
        n1.random = n2;
        n2.random = n2;
        new Solution().copyRandomList(n1);
    }
}