package io.github.mingchoi.leetcodesolutionjava.solution.q78_subsets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subsets() {
        class TestCase {
            public List<List<Integer>> expected;
            public int[] s;

            public TestCase(List<List<Integer>> ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(2, 3),
                        Arrays.asList(1, 3),
                        Arrays.asList(1, 2),
                        Arrays.asList(3),
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList()
                ), new int[]{1, 2, 3})
        };

        for (TestCase c : cases) {
            List<List<Integer>> r = new Solution().subsets(c.s);
            assertEquals(c.expected.size(), r.size());
            for (int i = 0; i < c.expected.size(); i++) {
                assertEquals(c.expected.get(0), r.get(0));
            }

        }
    }
}