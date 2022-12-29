package io.github.mingchoi.leetcodesolutionjava.solution.q315_count_of_smaller_numbers_after_self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Runtime: 329 ms, faster than 16.59% of Java online submissions for Count of Smaller Numbers After Self.
Memory Usage: 38.9 MB, less than 100.00% of Java online submissions for Count of Smaller Numbers After Self.
 */
public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> result = new ArrayList();
        for (int i = nums.length - 1; i > -1; i--) {
            int curr = nums[i];
            int found = list.indexOf(curr);
            if (found == -1) {
                list.add(curr);
                list.sort(Integer::compareTo);
                result.add(list.indexOf(curr));
            } else {
                list.add(found, curr);
                result.add(found);
            }
//            for (int j : list) {
//                System.out.print(j + ", ");
//            }
//            System.out.println();
//
//            System.out.println(list.indexOf(curr));
        }
        Collections.reverse(result);
        return result;
    }
}