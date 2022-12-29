package io.github.mingchoi.leetcodesolutionjava.solution.q139_word_break;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordBreak() {
        class TestCase {
            public Boolean expected;
            public String s;
            public List<String> strs;

            public TestCase(Boolean ex, String s, List<String> strs) {
                this.expected = ex;
                this.s = s;
                this.strs = strs;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(true, "leetcode", Arrays.asList("leet", "code")),
                new TestCase(true, "applepenapple", Arrays.asList("apple", "pen")),
                new TestCase(false, "catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")),
                new TestCase(false,
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                        Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"))

        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().wordBreak(c.s, c.strs));
        }
    }
}