package io.github.mingchoi.leetcodesolutionjava.solution.q929_unique_email_addresses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numUniqueEmails() {
        assertEquals(2,
                new Solution().numUniqueEmails(new String[]{
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"
                })
        );
    }
}