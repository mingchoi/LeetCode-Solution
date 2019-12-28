package io.github.mingchoi.leetcodesolutionjava.solution.q771_jewels_and_stones;

import java.util.HashSet;

/*
Runtime: 1 ms, faster than 94.30% of Java online submissions for Jewels and Stones.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Jewels and Stones.
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for (char j : J.toCharArray()) set.add(j);
        int count = 0;
        for (char s : S.toCharArray())
            if (set.contains(s)) count++;
        return count;
    }
}