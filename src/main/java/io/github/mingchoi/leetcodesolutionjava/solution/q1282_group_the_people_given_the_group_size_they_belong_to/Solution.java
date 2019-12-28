package io.github.mingchoi.leetcodesolutionjava.solution.q1282_group_the_people_given_the_group_size_they_belong_to;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Runtime: 5 ms, faster than 86.10% of Java online submissions for Group the People Given the Group Size They Belong To.
Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Group the People Given the Group Size They Belong To.
 */
public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int n = groupSizes[i];
            if (!map.containsKey(n)) {
                map.put(n, new ArrayList<Integer>());
            }
            List<Integer> list = map.get(n);
            list.add(i);
            if (list.size() == n) {
                result.add(list);
                map.remove(n);
            }
        }
        return result;
    }
}