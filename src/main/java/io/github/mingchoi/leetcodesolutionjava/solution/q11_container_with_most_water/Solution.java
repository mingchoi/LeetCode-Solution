package io.github.mingchoi.leetcodesolutionjava.solution.q11_container_with_most_water;

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
