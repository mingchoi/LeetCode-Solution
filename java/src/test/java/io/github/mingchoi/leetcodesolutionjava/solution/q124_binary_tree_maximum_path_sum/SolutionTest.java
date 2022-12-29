package io.github.mingchoi.leetcodesolutionjava.solution.q124_binary_tree_maximum_path_sum;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxPathSum() {
        TreeNode root;

        // Test 1
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(6, new Solution().maxPathSum(root));

        // Test 2
        root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(42, new Solution().maxPathSum(root));

        // Test 3
        root = new TreeNode(2);
        root.left = new TreeNode(-1);
        assertEquals(2, new Solution().maxPathSum(root));

        // Test 4
        root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        assertEquals(4, new Solution().maxPathSum(root));
    }
}