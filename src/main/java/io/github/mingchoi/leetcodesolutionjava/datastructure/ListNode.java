package io.github.mingchoi.leetcodesolutionjava.datastructure;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode n) {
        val = x;
        next = n;
    }

    public ListNode(int[] list) {
        if (list.length <= 0) {
            return;
        }

        ListNode current = this;
        current.val = list[0];

        for (int i = 1; i < list.length; i++) {
            current.next = new ListNode(list[i]);
            if (i < list.length - 1) {
                current = current.next;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof ListNode)) {
            return false;
        }

        ListNode n = (ListNode) o;

        if (this.next == null && n.next == null) {
            return (this.val == n.val);

        } else if (this.next != null && n.next != null) {
            return (this.val == n.val) && this.next.equals(n.next);
        }

        return false;
    }

    @Override
    public String toString() {
        if (next == null) {
            return String.valueOf(val);
        } else {
            return val + ", " + next.toString();
        }
    }
}