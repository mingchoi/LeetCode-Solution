package io.github.mingchoi.leetcodesolutionjava.solution.q66_plus_one;

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        digits[len] += 1;
        for (int i = len; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if (digits[0] == 10) {
            digits[0] = 0;
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = digits[i - 1];
                return arr;
            }

        }
        return digits;
    }
}
