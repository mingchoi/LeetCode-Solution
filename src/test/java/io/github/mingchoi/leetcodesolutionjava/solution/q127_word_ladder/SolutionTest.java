package io.github.mingchoi.leetcodesolutionjava.solution.q127_word_ladder;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void ladderLength() {
        class TestCase {
            public int expected;
            public String arg1;
            public String arg2;
            public List<String> arg3;

            public TestCase(int ex, String arg1, String arg2, List<String> arg3) {
                this.expected = ex;
                this.arg1 = arg1;
                this.arg2 = arg2;
                this.arg3 = arg3;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(5, "hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")),
                new TestCase(0, "hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")),
                new TestCase(3, "hot", "dog", Arrays.asList("hot", "dog", "dot")),
                new TestCase(3, "hot", "dog", Arrays.asList("hot", "cog", "dog", "tot", "hog", "hop", "pot", "dot")),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().ladderLength(c.arg1, c.arg2, c.arg3));
        }
    }
}