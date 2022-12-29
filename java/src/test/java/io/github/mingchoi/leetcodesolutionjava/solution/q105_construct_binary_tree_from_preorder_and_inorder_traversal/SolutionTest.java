package io.github.mingchoi.leetcodesolutionjava.solution.q105_construct_binary_tree_from_preorder_and_inorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void buildTree() {
        TreeNode r;
        r = new Solution().buildTree(
                new int[]{3, 9, 20, 15, 7},
                new int[]{9, 3, 15, 20, 7}
        );
        assertEquals(3, r.val);
        assertEquals(9, r.left.val);
        assertEquals(20, r.right.val);
        assertEquals(15, r.right.left.val);
        assertEquals(7, r.right.right.val);

        r = new Solution().buildTree(
                new int[]{1, 2, 3},
                new int[]{2, 3, 1}
        );
        assertEquals(1, r.val);
        assertEquals(2, r.left.val);
        assertEquals(3, r.left.right.val);

//        r = new Solution().buildTree(
//                new int[]{4, 1, 2, 3},
//                new int[]{1, 2, 3, 4}
//        );
    }
}