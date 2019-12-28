package io.github.mingchoi.leetcodesolutionjava.solution.q589_n_ary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/*
Runtime: 1 ms, faster than 98.44% of Java online submissions for N-ary Tree Preorder Traversal.
Memory Usage: 40.3 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        add(list, root);
        return list;
    }

    public void add(ArrayList<Integer> list, Node node) {
        list.add(node.val);
        for (Node n : node.children) add(list, n);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}