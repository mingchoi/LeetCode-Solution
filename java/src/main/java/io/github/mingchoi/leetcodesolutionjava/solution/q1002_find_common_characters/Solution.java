package io.github.mingchoi.leetcodesolutionjava.solution.q1002_find_common_characters;

import java.util.ArrayList;
import java.util.List;

/**
 * Just count the characters and reduce intersection of words. Then, convert it back to List.
 * https://leetcode.com/problems/find-common-characters/discuss/447986/Java-best-solution-100-faster-100-lessor
 */

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Common Characters.
Memory Usage: 37 MB, less than 100.00% of Java online submissions for Find Common Characters.
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        int[] last = count(A[0]);
        for (int i = 1; i < A.length; i++) {
            last = intersection(last, count(A[i]));
        }
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (last[i] != 0) {
                char a = 'a';
                a += i;
                String s = String.valueOf(a);
                while (last[i] > 0) {
                    arr.add(s);
                    last[i]--;
                }
            }
        }
        return arr;
    }

    int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }

    int[] count(String str) {
        int[] t = new int[26];
        for (char c : str.toCharArray()) t[c - 'a']++;
        return t;
    }
}