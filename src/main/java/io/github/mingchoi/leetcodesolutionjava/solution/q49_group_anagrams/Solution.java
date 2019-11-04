package io.github.mingchoi.leetcodesolutionjava.solution.q49_group_anagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = sortString(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<String>(Arrays.asList(str)));
            }
        }

        for (String key : map.keySet()) {
            List<String> arr = map.get(key);
            Collections.sort(arr);
            result.add(arr);
        }
        return result;
    }

    private String sortString(String str) {
        char[] result = str.toCharArray();
        Arrays.sort(result);
        return String.valueOf(result);
    }
}
