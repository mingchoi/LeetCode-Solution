package io.github.mingchoi.leetcodesolutionjava.solution.q1266_minimum_time_visiting_all_points;
/*
Runtime: 1 ms, faster than 84.70% of Java online submissions for Minimum Time Visiting All Points.
Memory Usage: 43.1 MB, less than 100.00% of Java online submissions for Minimum Time Visiting All Points.
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            count += Math.max(
                    Math.abs(points[i][0] - points[i + 1][0]),
                    Math.abs(points[i][1] - points[i + 1][1])
            );
        }
        return count;
    }
}