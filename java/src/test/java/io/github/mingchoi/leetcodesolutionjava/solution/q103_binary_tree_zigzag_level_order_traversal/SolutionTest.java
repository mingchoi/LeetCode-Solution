package io.github.mingchoi.leetcodesolutionjava.solution.q103_binary_tree_zigzag_level_order_traversal;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void zigzagLevelOrder() {
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
                        Arrays.asList(20, 9),
                        Arrays.asList(15, 7)
                ),
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        )
                ),
                new TestCase(Arrays.asList(
                        Arrays.asList(1),
                        Arrays.asList(3, 2),
                        Arrays.asList(4, 5)
                ),
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(4),
                                        null
                                ),
                                new TreeNode(3,
                                        null,
                                        new TreeNode(5)
                                )
                        )
                ),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().zigzagLevelOrder(c.node));
        }
    }
}