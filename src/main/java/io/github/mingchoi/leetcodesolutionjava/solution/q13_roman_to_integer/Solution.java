package io.github.mingchoi.leetcodesolutionjava.solution.q13_roman_to_integer;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int index = 0;
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        while (index < s.length()) {
            char c1 = s.charAt(index);
            char c2 = s.charAt(index + 1);
            if ((c1 == 'C' && c2 == 'M')
                    || (c1 == 'X' && c2 == 'C')
                    || (c1 == 'I' && c2 == 'X')
                    || (c1 == 'C' && c2 == 'D')
                    || (c1 == 'X' && c2 == 'L')
                    || (c1 == 'I' && c2 == 'V')) {
                count += map.get(c2) - map.get(c1);
                index += 2;
            } else {
                count += map.get(c1);
                index += 1;
            }
        }

        return count;
    }
}
