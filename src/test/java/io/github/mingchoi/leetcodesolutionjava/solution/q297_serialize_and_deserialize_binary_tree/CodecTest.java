package io.github.mingchoi.leetcodesolutionjava.solution.q297_serialize_and_deserialize_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodecTest {

    @Test
    public void serialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        assertEquals("1,2,3,_,_,4,5,_,_,_,_", new Codec().serialize(root));
    }

    @Test
    public void deserialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        TreeNode result = new Codec().deserialize("1,2,3,_,_,4,5");
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.right.left.val);
        assertEquals(5, result.right.right.val);
    }
}