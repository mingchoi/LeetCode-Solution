package io.github.mingchoi.leetcodesolutionjava.solution.q118_pascals_triangle;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generate() {
        class TestCase {
            public List<List<Integer>> expected;
            public int s;

            public TestCase(List<List<Integer>> ex, int s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        Arrays.asList(
                                Arrays.asList(1),
                                Arrays.asList(1, 1),
                                Arrays.asList(1, 2, 1),
                                Arrays.asList(1, 3, 3, 1),
                                Arrays.asList(1, 4, 6, 4, 1)
                        )
                        , 5)
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().generate(c.s));
        }
    }
}