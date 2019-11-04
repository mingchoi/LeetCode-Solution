package io.github.mingchoi.leetcodesolutionjava.solution.q78_subsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<String, Boolean> map = new HashMap<>();
        List<Integer> remain = new ArrayList<>();
        for (int i : nums) {
            remain.add(i);
        }
        fn(result, map, remain);
        result.add(new ArrayList<Integer>());
        return result;
    }

    private void fn(List<List<Integer>> result, HashMap<String, Boolean> map, List<Integer> remain) {
        if (remain.size() == 0) {
            return;
        }

        String key = remain.toString();
        if (!map.containsKey(key)) {
            result.add(new ArrayList<>(remain));
            map.put(key, true);
        } else {
            return;
        }
        for (int i = 0; i < remain.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>(remain);
            arr.remove(i);
            fn(result, map, arr);
        }
    }
}
