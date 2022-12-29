package io.github.mingchoi.leetcodesolutionjava.solution.q140_word_break_ii;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordBreak() {
        class TestCase {
            public List<String> expected;
            public String s;
            public List<String> strs;

            public TestCase(List<String> ex, String s, List<String> strs) {
                this.expected = ex;
                this.s = s;
                this.strs = strs;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(
                        Arrays.asList("cats and dog", "cat sand dog"),
                        "catsanddog",
                        Arrays.asList("cat", "cats", "and", "sand", "dog")
                ),
                new TestCase(
                        Arrays.asList(""),
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                        Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
                )
        };

        for (TestCase c : cases) {
            assertTrue(new Solution().wordBreak(c.s, c.strs).containsAll(c.expected));
        }
    }
}