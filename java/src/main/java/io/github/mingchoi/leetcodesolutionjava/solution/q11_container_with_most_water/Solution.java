package io.github.mingchoi.leetcodesolutionjava.solution.q11_container_with_most_water;

/*
Runtime: 2 ms, faster than 95.43% of Java online submissions for Container With Most Water.
Memory Usage: 40 MB, less than 94.87% of Java online submissions for Container With Most Water.
 */
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            int water = containWater(height[start], height[end], end - start);
            if (water > max) {
                max = water;
            }
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }

    public int containWater(int a, int b, int dis) {
        return Math.min(a, b) * dis;
    }
}
