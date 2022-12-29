package io.github.mingchoi.leetcodesolutionjava.solution.q191_number_of_1_bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void hammingWeight() {
        assertEquals(3,
                new Solution().hammingWeight(11)
        );
    }
}