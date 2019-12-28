package io.github.mingchoi.leetcodesolutionjava.solution.q1281_subtract_the_product_and_sum_of_digits_of_an_integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subtractProductAndSum() {
        assertEquals(15,
                new Solution().subtractProductAndSum(234));
    }
}