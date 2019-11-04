package io.github.mingchoi.leetcodesolutionjava.solution.q42_trapping_rain_water;

import java.util.Arrays;

class Solution {
    public int trap(int[] height) {
        int count = 0;
        int max = 0;

        // Find highest wall
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }

        // level
        for (int level = 0; level < max; level++) {
            int firstWall = -1;
            int lastWall = -1;

            // find wall
            for (int i = 0; i < height.length; i++) {
                if (height[i] > 0) {
                    firstWall = i;
                    break;
                }
            }
            for (int i = height.length - 1; i > -1; i--) {
                if (height[i] > 0) {
                    lastWall = i;
                    break;
                }
            }
            if (firstWall == -1 || lastWall == -1 || Math.abs(firstWall - lastWall) < 2) {
                break;
            }

            //
            for (int i = firstWall; i < lastWall; i++) {
                if (height[i] == 0) {
                    count++;
                }

            }

            for (int i = 0; i < height.length; i++) {
                if (height[i] != 0) {
                    height[i] = height[i] - 1;
                }
            }

        }
        return count;
    }
}
