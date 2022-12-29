package io.github.mingchoi.leetcodesolutionjava.solution.q961_n_repeated_element_in_size_2n_array;

import java.util.HashSet;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : A) {
            if (set.contains(a)) {
                return a;
            } else {
                set.add(a);
            }
        }
        return 0;
    }
}