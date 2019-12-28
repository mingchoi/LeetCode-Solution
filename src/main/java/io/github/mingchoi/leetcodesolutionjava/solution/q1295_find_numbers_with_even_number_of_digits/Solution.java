package io.github.mingchoi.leetcodesolutionjava.solution.q1295_find_numbers_with_even_number_of_digits;

/*

Runtime: 1 ms, faster than 98.57% of Java online submissions for Find Numbers with Even Number of Digits.
Memory Usage: 38.8 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            int c = 1;
            while (n > 9) {
                n /= 10;
                c++;
            }
            if (c % 2 == 0) sum++;
        }
        return sum;
    }
}
