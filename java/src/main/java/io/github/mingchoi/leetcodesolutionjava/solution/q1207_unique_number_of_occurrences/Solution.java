package io.github.mingchoi.leetcodesolutionjava.solution.q1207_unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;
/*
Runtime: 2 ms, faster than 88.45% of Java online submissions for Unique Number of Occurrences.
Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int v : map.values()) {
            if (set.contains(v))
                return false;
            else
                set.add(v);
        }
        return true;
    }
}
