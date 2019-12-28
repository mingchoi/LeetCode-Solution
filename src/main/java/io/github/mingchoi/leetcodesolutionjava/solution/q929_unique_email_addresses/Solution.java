package io.github.mingchoi.leetcodesolutionjava.solution.q929_unique_email_addresses;

import java.util.HashSet;

/*
Runtime: 6 ms, faster than 96.92% of Java online submissions for Unique Email Addresses.
Memory Usage: 38.1 MB, less than 98.73% of Java online submissions for Unique Email Addresses.
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(cleanEmail(email));
        }
        return set.size();
    }

    String cleanEmail(String email) {
        StringBuilder sb = new StringBuilder();
        boolean afterPlus = false;
        boolean afterAt = false;
        for (char c : email.toCharArray()) {
            if (c == '+')
                afterPlus = true;
            else if (c == '@')
                afterAt = true;
            if (afterAt) {
                sb.append(c);
            } else if (!afterPlus && c != '.') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}