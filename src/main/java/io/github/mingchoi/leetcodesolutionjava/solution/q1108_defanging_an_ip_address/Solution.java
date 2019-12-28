package io.github.mingchoi.leetcodesolutionjava.solution.q1108_defanging_an_ip_address;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
Memory Usage: 34 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
 */
public class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append('[');
                sb.append('.');
                sb.append(']');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}