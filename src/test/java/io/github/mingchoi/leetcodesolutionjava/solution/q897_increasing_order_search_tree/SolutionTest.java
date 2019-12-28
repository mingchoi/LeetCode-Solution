package io.github.mingchoi.leetcodesolutionjava.solution.q897_increasing_order_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void increasingBST() {
        TreeNode in = new TreeNode(5);
        in.left = new TreeNode(3);
        in.left.left = new TreeNode(2);
        in.left.right = new TreeNode(4);
        in.left.left.left = new TreeNode(1);
        in.right = new TreeNode(6);
        in.right.right = new TreeNode(8);
        in.right.right.left = new TreeNode(7);
        in.right.right.right = new TreeNode(9);
        new Solution().increasingBST(in);
    }
}