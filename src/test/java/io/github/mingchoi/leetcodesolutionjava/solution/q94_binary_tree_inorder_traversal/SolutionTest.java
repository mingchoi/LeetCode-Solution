package io.github.mingchoi.leetcodesolutionjava.solution.q94_binary_tree_inorder_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void inorderTraversal() {
        class TestCase {
            public List<Integer> expected;
            public TreeNode node;

            public TestCase(List<Integer> ex, TreeNode node) {
                this.expected = ex;
                this.node = node;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(1, 3, 2), new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)))
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().inorderTraversal(c.node));
        }
    }
}