package io.github.mingchoi.leetcodesolutionjava.solution.q190_reverse_bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseBits() {
//        assertEquals(
//                1,
//                new Solution().reverseBits(1)
//        );
        assertEquals(
                964176192,
                new Solution().reverseBits(43261596)
        );
    }
}