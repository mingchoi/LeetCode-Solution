package io.github.mingchoi.leetcodesolutionjava.solution.q344_reverse_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseString() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        new Solution().reverseString(input);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, input);

        input = new char[]{'H','a','n','n','a','h'};
        new Solution().reverseString(input);
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, input);
    }
}