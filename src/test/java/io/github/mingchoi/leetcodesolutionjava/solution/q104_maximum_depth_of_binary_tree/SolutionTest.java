package io.github.mingchoi.leetcodesolutionjava.solution.q104_maximum_depth_of_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxDepth() {
        class TestCase {
            public int expected;
            public TreeNode node;

            public TestCase(int ex, TreeNode node) {
                this.expected = ex;
                this.node = node;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(3,
                                        new TreeNode(4),
                                        null
                                )
                        )
                ),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().maxDepth(c.node));
        }
    }
}