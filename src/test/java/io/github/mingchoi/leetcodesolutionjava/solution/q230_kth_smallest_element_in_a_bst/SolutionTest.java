package io.github.mingchoi.leetcodesolutionjava.solution.q230_kth_smallest_element_in_a_bst;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void kthSmallest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(1,
                new Solution().kthSmallest(root, 1));
        assertEquals(2,
                new Solution().kthSmallest(root, 2));
        assertEquals(3,
                new Solution().kthSmallest(root, 3));
        assertEquals(4,
                new Solution().kthSmallest(root, 4));
    }
}