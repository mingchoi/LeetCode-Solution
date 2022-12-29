package io.github.mingchoi.leetcodesolutionjava.solution.q657_robot_return_to_origin;

/*
Runtime: 4 ms, faster than 97.92% of Java online submissions for Robot Return to Origin.
Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Robot Return to Origin.
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                v++;
            } else if (c == 'D') {
                v--;
            } else if (c == 'L') {
                h--;
            } else if (c == 'R') {
                h++;
            }
        }
        return h == 0 && v == 0;
    }
}