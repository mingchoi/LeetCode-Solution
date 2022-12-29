package io.github.mingchoi.leetcodesolutionjava.solution.q811_subdomain_visit_count;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Runtime: 9 ms, faster than 82.69% of Java online submissions for Subdomain Visit Count.
Memory Usage: 37.1 MB, less than 96.97% of Java online submissions for Subdomain Visit Count.
 */
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : cpdomains) {
            String[] splited = str.split(" ");
            int count = Integer.valueOf(splited[0]);
            String domain = splited[1];
            map.put(domain, map.getOrDefault(domain, 0) + count);

            char[] chars = domain.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '.') {
//                    String subdomain = domain.substring(i + 1);
                    String subdomain = new String(chars, i + 1, chars.length - i - 1);
                    map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String domain : map.keySet())
            list.add(map.get(domain) + " " + domain);
        return list;
    }
}