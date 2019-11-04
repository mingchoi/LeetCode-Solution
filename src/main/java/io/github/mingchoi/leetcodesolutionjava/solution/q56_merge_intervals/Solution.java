package io.github.mingchoi.leetcodesolutionjava.solution.q56_merge_intervals;

import io.github.mingchoi.leetcodesolutionjava.datastructure.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) {
            return intervals;
        }
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        List<Interval> r = new ArrayList<>();
        r.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval a = r.get(r.size() - 1);
            Interval b = intervals.get(i);
            List<Interval> u = union(a, b);
            if (u.size() == 1) {
                r.set(r.size() - 1, u.get(0));
            } else {
                r.add(b);
            }
        }
        return r;
    }

    public List<Interval> union(Interval a, Interval b) {
        // sort
        if (a.start > b.start) {
            Interval t = b;
            b = a;
            a = t;
        }

        // check overlap
        if (b.start < a.start || b.start > a.end) {
            return Arrays.asList(a, b);
        }

        return Arrays.asList(new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end)));
    }
}
