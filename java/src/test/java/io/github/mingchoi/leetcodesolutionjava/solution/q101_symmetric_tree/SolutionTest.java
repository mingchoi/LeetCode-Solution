package io.github.mingchoi.leetcodesolutionjava.solution.q101_symmetric_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isSymmetric() {
        class TestCase {
            public boolean expected;
            public TreeNode node;

            public TestCase(boolean ex, TreeNode node) {
                this.expected = ex;
                this.node = node;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(true,
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3),
                                        new TreeNode(4)
                                ),
                                new TreeNode(2,
                                        new TreeNode(4),
                                        new TreeNode(3)
                                )
                        )
                ),
                new TestCase(false,
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(2),
                                        null
                                ),
                                new TreeNode(2,
                                        new TreeNode(2),
                                        null
                                )
                        )
                ),

        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().isSymmetric(c.node));
        }
    }
}