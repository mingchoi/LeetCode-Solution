package io.github.mingchoi.leetcodesolutionjava.solution.q108_convert_sorted_array_to_binary_search_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortedArrayToBST() {
        class TestCase {
            public TreeNode expected;
            public int[] a;

            public TestCase(TreeNode ex, int[] a) {
                this.expected = ex;
                this.a = a;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        new TreeNode(0,
                                new TreeNode(-3,
                                        new TreeNode(-10),
                                        null
                                ),
                                new TreeNode(9,
                                        new TreeNode(5),
                                        null
                                )
                        ),
                        new int[]{-10, -3, 0, 5, 9}
                ),
                new TestCase(
                        new TreeNode(3,
                                new TreeNode(1,
                                        new TreeNode(0),
                                        new TreeNode(2)
                                ),
                                new TreeNode(5,
                                        new TreeNode(4),
                                        null
                                )
                        ),
                        new int[]{0, 1, 2, 3, 4, 5}
                ),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().sortedArrayToBST(c.a));
        }
    }
}