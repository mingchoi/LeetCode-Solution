package io.github.mingchoi.leetcodesolutionjava.solution.q1281_subtract_the_product_and_sum_of_digits_of_an_integer;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 32.9 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        for (char c : String.valueOf(n).toCharArray()) {
            int num = c - '0';
            sum += num;
            product *= num;
        }
        return product - sum;
    }
}