package io.github.mingchoi.leetcodesolutionjava.solution.q17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    private HashMap<Character, List<String>> comb = new HashMap<>();

    public Solution() {
        comb.put('2', Arrays.asList("a", "b", "c"));
        comb.put('3', Arrays.asList("d", "e", "f"));
        comb.put('4', Arrays.asList("g", "h", "i"));
        comb.put('5', Arrays.asList("j", "k", "l"));
        comb.put('6', Arrays.asList("m", "n", "o"));
        comb.put('7', Arrays.asList("p", "q", "r", "s"));
        comb.put('8', Arrays.asList("t", "u", "v"));
        comb.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        num2char(result, digits, "");
        return result;
    }

    public void num2char(List<String> result, String digits, String str) {
        if (digits.length() == 0) {
            result.add(str);
            return;
        }
        for (String s : comb.get(digits.charAt(0))) {
            String remain = digits.substring(1);
            num2char(result, remain, str + s);
        }
    }
}