package io.github.mingchoi.leetcodesolutionjava.datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void newFromArray() {
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode ln2 = new ListNode(new int[]{1, 2, 3});
        ListNode ln3 = new ListNode(new int[]{2, 2, 1});

        assertTrue(ln2.equals(ln1));
        assertFalse(ln2.equals(ln3));
    }

    @Test
    public void equals() {
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode ln2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode ln3 = new ListNode(1, new ListNode(2));
        ListNode ln4 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode ln5 = new ListNode(2, new ListNode(2, new ListNode(3)));

        assertTrue(ln1.equals(ln2));
        assertFalse(ln1.equals(ln3));
        assertFalse(ln1.equals(ln4));
        assertFalse(ln1.equals(ln5));
    }
}