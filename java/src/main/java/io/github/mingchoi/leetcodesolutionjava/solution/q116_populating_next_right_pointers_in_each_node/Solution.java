package io.github.mingchoi.leetcodesolutionjava.solution.q116_populating_next_right_pointers_in_each_node;

import java.util.HashMap;
/*
Runtime: 5 ms, faster than 22.18% of Java online submissions for Populating Next Right Pointers in Each Node.
Memory Usage: 37.9 MB, less than 6.35% of Java online submissions for Populating Next Right Pointers in Each Node.
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        HashMap<Integer, Node> map = new HashMap<>();
        traversal(root, 0, map);
        return root;
    }

    void traversal(Node node, int index, HashMap<Integer, Node> map) {
        if (node.right != null) {
            traversal(node.right, getRightIndex(index), map);
        }
        if (node.left != null) {
            traversal(node.left, getLeftIndex(index), map);
        }
        map.put(index, node);
        if (!isRightMostNode(index) && map.get(index + 1) != null) {
            node.next = map.get(index + 1);
        }
    }

    boolean isRightMostNode(int index) {
        int x = index + 2;
        return x != 0 && (x & (x - 1)) == 0;
    }

    int getLeftIndex(int index) {
        return index * 2 + 1;
    }

    int getRightIndex(int index) {
        return index * 2 + 2;
    }
}
