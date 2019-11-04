package io.github.mingchoi.leetcodesolutionjava.solution.q49_group_anagrams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagrams() {
        class TestCase {
            public List<List<String>> expected;
            public String[] s;

            public TestCase(List<List<String>> ex, String[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(
                        Arrays.asList("ate", "eat", "tea"),
                        Arrays.asList("bat"),
                        Arrays.asList("nat", "tan")
                ), new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().groupAnagrams(c.s));
        }
    }
}