package io.github.mingchoi.leetcodesolutionjava.solution.q106_construct_binary_tree_from_inorder_and_postorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void buildTree() {
        TreeNode r;

        r = new Solution().buildTree(
                new int[]{9, 3, 15, 20, 7},
                new int[]{9, 15, 7, 20, 3}
        );
        assertEquals(3, r.val);
        assertEquals(9, r.left.val);
        assertEquals(20, r.right.val);
        assertEquals(15, r.right.left.val);
        assertEquals(7, r.right.right.val);
    }
}