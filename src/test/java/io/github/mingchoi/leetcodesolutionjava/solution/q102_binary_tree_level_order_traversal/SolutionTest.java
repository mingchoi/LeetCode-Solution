package io.github.mingchoi.leetcodesolutionjava.solution.q102_binary_tree_level_order_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void levelOrder() {
        class TestCase {
            public List<List<Integer>> expected;
            public TreeNode node;

            public TestCase(List<List<Integer>> ex, TreeNode node) {
                this.expected = ex;
                this.node = node;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ),
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        )
                )
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().levelOrder(c.node));
        }
    }
}