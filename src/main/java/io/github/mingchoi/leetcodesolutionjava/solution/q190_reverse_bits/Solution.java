package io.github.mingchoi.leetcodesolutionjava.solution.q190_reverse_bits;
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Bits.
Memory Usage: 29.7 MB, less than 7.32% of Java online submissions for Reverse Bits.
 */
public class Solution {
    public int reverseBits(int n) {
        boolean fix = (n & 0x80000000) != 0;
        return ((n & 0x1) << 31) |
                ((n & 0x2) << 29) |
                ((n & 0x4) << 27) |
                ((n & 0x8) << 25) |
                ((n & 0x10) << 23) |
                ((n & 0x20) << 21) |
                ((n & 0x40) << 19) |
                ((n & 0x80) << 17) |
                ((n & 0x100) << 15) |
                ((n & 0x200) << 13) |
                ((n & 0x400) << 11) |
                ((n & 0x800) << 9) |
                ((n & 0x1000) << 7) |
                ((n & 0x2000) << 5) |
                ((n & 0x4000) << 3) |
                ((n & 0x8000) << 1) |
                ((n & 0x10000) >> 1) |
                ((n & 0x20000) >> 3) |
                ((n & 0x40000) >> 5) |
                ((n & 0x80000) >> 7) |
                ((n & 0x100000) >> 9) |
                ((n & 0x200000) >> 11) |
                ((n & 0x400000) >> 13) |
                ((n & 0x800000) >> 15) |
                ((n & 0x1000000) >> 17) |
                ((n & 0x2000000) >> 19) |
                ((n & 0x4000000) >> 21) |
                ((n & 0x8000000) >> 23) |
                ((n & 0x10000000) >> 25) |
                ((n & 0x20000000) >> 27) |
                ((n & 0x40000000) >> 29) |
                (fix ? 1 : 0);
    }

    public void print(int n) {
        boolean[] ba = new boolean[]{
                (n & 1) != 0,
                (n & 2) != 0,
                (n & 4) != 0,
                (n & 8) != 0,
                (n & 0x10) != 0,
                (n & 0x20) != 0,
                (n & 0x40) != 0,
                (n & 0x80) != 0,
                (n & 0x100) != 0,
                (n & 0x200) != 0,
                (n & 0x400) != 0,
                (n & 0x800) != 0,
                (n & 0x1000) != 0,
                (n & 0x2000) != 0,
                (n & 0x4000) != 0,
                (n & 0x8000) != 0,
                (n & 0x10000) != 0,
                (n & 0x20000) != 0,
                (n & 0x40000) != 0,
                (n & 0x80000) != 0,
                (n & 0x100000) != 0,
                (n & 0x200000) != 0,
                (n & 0x400000) != 0,
                (n & 0x800000) != 0,
                (n & 0x1000000) != 0,
                (n & 0x2000000) != 0,
                (n & 0x4000000) != 0,
                (n & 0x8000000) != 0,
                (n & 0x10000000) != 0,
                (n & 0x20000000) != 0,
                (n & 0x40000000) != 0,
                (n & 0x80000000) != 0,
        };
        for (int i = ba.length - 1; i >= 0; i--) {
            System.out.print(ba[i] ? "1" : "0");
        }
        System.out.print(" " + n + "\n");
    }
}