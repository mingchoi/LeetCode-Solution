package io.github.mingchoi.leetcodesolutionjava.solution.q98_validate_binary_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValidBST() {
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
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(3)
                        )
                ),
                new TestCase(false,
                        new TreeNode(5,
                                new TreeNode(1),
                                new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(6)
                                )
                        )
                ),
                new TestCase(false,
                        new TreeNode(10,
                                new TreeNode(5),
                                new TreeNode(15,
                                        new TreeNode(6),
                                        new TreeNode(20)
                                )
                        )
                ),
                new TestCase(false,
                        new TreeNode(5,
                                new TreeNode(1),
                                new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(6)
                                )
                        )
                ),
                new TestCase(false,
                        new TreeNode(3,
                                new TreeNode(1,
                                        new TreeNode(0),
                                        new TreeNode(2, null, new TreeNode(3))
                                ),
                                new TreeNode(5,
                                        new TreeNode(4),
                                        new TreeNode(6)
                                )
                        )
                ),

        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().isValidBST(c.node));
        }
    }
}