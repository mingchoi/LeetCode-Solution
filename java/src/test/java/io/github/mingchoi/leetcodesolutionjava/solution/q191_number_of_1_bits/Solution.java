package io.github.mingchoi.leetcodesolutionjava.solution.q191_number_of_1_bits;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
Memory Usage: 33.1 MB, less than 5.41% of Java online submissions for Number of 1 Bits.
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((n & (1 << i)) != 0  ){
                count++;
            }
        }
        return count;
    }
}