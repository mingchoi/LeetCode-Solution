package io.github.mingchoi.leetcodesolutionjava.solution.q236_lowest_common_ancestor_of_a_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lowestCommonAncestor() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(root, new Solution().lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    public void lowestCommonAncestor2() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(8);
        assertEquals(root.left, new Solution().lowestCommonAncestor(root, new TreeNode(8), new TreeNode(4)));
    }
}