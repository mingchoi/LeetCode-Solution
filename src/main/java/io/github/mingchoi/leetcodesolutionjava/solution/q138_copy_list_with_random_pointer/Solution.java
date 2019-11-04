package io.github.mingchoi.leetcodesolutionjava.solution.q138_copy_list_with_random_pointer;

import java.util.HashMap;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }

    @Override
    public String toString() {
        if (next == null) {
            return String.valueOf(val);
        } else {
            return val + ", " + next.toString();
        }
    }
};

/*
Runtime: 1 ms, faster than 74.81% of Java online submissions for Copy List with Random Pointer.
Memory Usage: 33.8 MB, less than 99.07% of Java online submissions for Copy List with Random Pointer.
 */

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return head;

        HashMap<Node, Integer> srcnode2index = new HashMap<>();
        HashMap<Integer, Node> index2copnode = new HashMap<>();

        // Copy list
        int index = 0;
        Node sc = head.next;
        Node nh = new Node(head.val, null, null);
        Node nc = nh;
        srcnode2index.put(head, 0);
        index2copnode.put(0, nc);
        while (sc != null) {
            index++;
            nc.next = new Node(sc.val, null, null);
            srcnode2index.put(sc, index);
            nc = nc.next;
            index2copnode.put(index, nc);
            sc = sc.next;
        }

        // Map random pointer
        sc = head;
        nc = nh;
        while (sc != null) {
            if (sc.random != null) {
                int ptIndex = srcnode2index.get(sc.random);
                nc.random = index2copnode.get(ptIndex);
            }
            sc = sc.next;
            nc = nc.next;
        }

        // Return new list
        return nh;
    }
}
