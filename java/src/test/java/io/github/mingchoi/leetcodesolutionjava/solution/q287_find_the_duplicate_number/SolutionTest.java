package io.github.mingchoi.leetcodesolutionjava.solution.q287_find_the_duplicate_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDuplicate() {
        assertEquals(2, new Solution().findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, new Solution().findDuplicate(new int[]{3, 1, 3, 4, 2}));
        assertEquals(2, new Solution().findDuplicate(new int[]{2, 2, 2, 2, 2}));
    }
}