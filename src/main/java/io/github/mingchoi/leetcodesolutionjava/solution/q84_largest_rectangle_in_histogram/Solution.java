package io.github.mingchoi.leetcodesolutionjava.solution.q84_largest_rectangle_in_histogram;

class Solution {
    public int largestRectangleArea_n2(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int lo = i;
            int hi = i;
            while (lo > 0 && heights[lo - 1] >= heights[i]) {
                lo--;
            }
            while (hi < heights.length - 1 && heights[hi + 1] >= heights[i]) {
                hi++;
            }
            int area = (hi - lo + 1) * heights[i];
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int[] los = new int[heights.length];
        int[] his = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            int lo = i;
            int hi = i;
            while (lo > 0 && heights[lo - 1] >= heights[i]) {
                if (los[lo - 1] != lo - 1) {
                    lo = los[lo - 1];
                } else {
                    lo--;
                }
            }
            los[i] = lo;
            while (hi < heights.length - 1 && heights[hi + 1] >= heights[i]) {
                hi++;
            }
            his[i] = hi;

            int area = (hi - lo + 1) * heights[i];
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
