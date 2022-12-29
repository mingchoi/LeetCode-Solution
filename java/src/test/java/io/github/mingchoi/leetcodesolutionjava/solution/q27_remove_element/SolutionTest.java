package io.github.mingchoi.leetcodesolutionjava.solution.q27_remove_element;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeElement() {
        assertEquals(2,
                new Solution().removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}