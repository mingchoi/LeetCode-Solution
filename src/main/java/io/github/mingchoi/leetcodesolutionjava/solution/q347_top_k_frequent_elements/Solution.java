package io.github.mingchoi.leetcodesolutionjava.solution.q347_top_k_frequent_elements;

import java.util.*;

/*
Runtime: 45 ms, faster than 32.13% of Java online submissions for Top K Frequent Elements.
Memory Usage: 40.8 MB, less than 56.03% of Java online submissions for Top K Frequent Elements.
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer c = map.get(i);
            if (c != null) {
                map.put(i, c + 1);
            } else {
                map.put(i, 1);
            }
        }

        // TODO: improve this by red black tree
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : map.keySet()) {
//            System.out.println("k: " + i + ", v: " + map.get(i));
            list.add(i);
        }

        Collections.sort(list, (o1, o2) ->
                map.get(o2) - map.get(o1)
        );

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        return result;
    }
}