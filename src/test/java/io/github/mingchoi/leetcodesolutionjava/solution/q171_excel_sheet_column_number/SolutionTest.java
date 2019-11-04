package io.github.mingchoi.leetcodesolutionjava.solution.q171_excel_sheet_column_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void titleToNumber() {
//        assertEquals(1, new Solution().titleToNumber("A"));
//        assertEquals(28, new Solution().titleToNumber("AB"));
        assertEquals(701, new Solution().titleToNumber("ZY"));
    }
}