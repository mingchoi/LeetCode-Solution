package io.github.mingchoi.leetcodesolutionjava.solution.q149_max_points_on_a_line;

import java.util.HashMap;
import java.util.HashSet;

class Solution {

    public int maxPoints(int[][] points) {
        if (points.length == 1) return 1;
        HashMap<Double, HashSet> dict = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Double slope = 1.0 * (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
//                System.out.println(points[i][0] + "," + points[i][1] + " -> " +
//                        points[j][0] + "," + points[j][1] + " : " + slope.toString());
                if (!dict.containsKey(slope)) {
                    HashSet set = new HashSet();
                    set.add(points[i]);
                    set.add(points[j]);
                    dict.put(slope, set);
                } else {
                    HashSet set = dict.get(slope);
                    set.add(points[i]);
                    set.add(points[j]);
                    dict.put(slope, set);
                }
            }
        }
        Integer max = 0;
        for (HashSet set : dict.values()) {
            if (set.size() > max) {
                max = set.size();
            }
        }
        return max;
    }
}