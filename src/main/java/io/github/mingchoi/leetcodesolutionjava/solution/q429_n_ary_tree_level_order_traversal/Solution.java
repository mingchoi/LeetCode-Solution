package io.github.mingchoi.leetcodesolutionjava.solution.q429_n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.List;
/*
Runtime: 1 ms, faster than 99.97% of Java online submissions for N-ary Tree Level Order Traversal.
Memory Usage: 40.5 MB, less than 100.00% of Java online submissions for N-ary Tree Level Order Traversal.
 */
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        add(list, root, 0);
        return list;
    }

    public void add(List<List<Integer>> list, Node node, int lv) {
        if (list.size() <= lv) list.add(new ArrayList<>());
        List<Integer> lvList = list.get(lv);
        lvList.add(node.val);
        for (Node n : node.children) add(list, n, lv + 1);
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

    ;
}