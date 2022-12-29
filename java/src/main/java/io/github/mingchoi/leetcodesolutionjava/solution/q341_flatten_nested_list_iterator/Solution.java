package io.github.mingchoi.leetcodesolutionjava.solution.q341_flatten_nested_list_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface NestedInteger {
    boolean isInteger();
    Integer getInteger();
    List<NestedInteger> getList();
}

/*
Runtime: 3 ms, faster than 69.50% of Java online submissions for Flatten Nested List Iterator.
Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Flatten Nested List Iterator.
 */
public class Solution {
    public class NestedIterator implements Iterator<Integer> {
        List<Integer> list;
        int pt = -1;

        public NestedIterator(List<NestedInteger> nestedList) {
            list = unwrap(nestedList);
        }

        private List<Integer> unwrap(List<NestedInteger> nestedList) {
            ArrayList<Integer> l = new ArrayList<>();
            for (NestedInteger ni : nestedList) {
                if (ni.isInteger()) {
                    l.add(ni.getInteger());
                } else {
                    for (Integer i : unwrap(ni.getList())) l.add(i);
                }
            }
            return l;
        }

        @Override
        public Integer next() {
            return list.get(++pt);
        }

        @Override
        public boolean hasNext() {
            return pt + 1 < list.size();
        }
    }
}
