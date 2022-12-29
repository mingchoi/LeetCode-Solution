package io.github.mingchoi.leetcodesolutionjava.solution.q295_find_median_from_data_stream;

import java.util.ArrayList;
import java.util.Collections;
/*
Runtime: 442 ms, faster than 6.42% of Java online submissions for Find Median from Data Stream.
Memory Usage: 67.1 MB, less than 50.85% of Java online submissions for Find Median from Data Stream.
 */
public class MedianFinder {
    private ArrayList<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
        Collections.sort(list);
    }

    public double findMedian() {
        if (list.size() % 2 == 0) {
            int mid = list.size() / 2;
            return 1.0 * (list.get(mid - 1) + list.get(mid)) / 2;
        } else {
            int mid = list.size() / 2;
            return list.get(mid);
        }
    }
}