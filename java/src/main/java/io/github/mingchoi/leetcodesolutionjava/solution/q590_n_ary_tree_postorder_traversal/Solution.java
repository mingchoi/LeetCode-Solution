package io.github.mingchoi.leetcodesolutionjava.solution.q590_n_ary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;

/*
Runtime: 1 ms, faster than 98.37% of Java online submissions for N-ary Tree Postorder Traversal.
Memory Usage: 39.5 MB, less than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        add(list, root);
        return list;
    }

    public void add(ArrayList<Integer> list, Node node) {
        for (Node n : node.children)
            add(list, n);
        list.add(node.val);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}