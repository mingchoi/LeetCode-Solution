package io.github.mingchoi.leetcodesolutionjava.solution.q559_maximum_depth_of_n_ary_tree;

import java.util.List;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node c : root.children)
            max = Math.max(max, maxDepth(c));
        return max + 1;
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