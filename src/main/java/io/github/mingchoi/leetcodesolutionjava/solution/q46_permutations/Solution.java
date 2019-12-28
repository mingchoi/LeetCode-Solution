package io.github.mingchoi.leetcodesolutionjava.solution.q46_permutations;

import java.util.ArrayList;
import java.util.List;
/*
Runtime: 1 ms, faster than 97.03% of Java online submissions for Permutations.
Memory Usage: 37.3 MB, less than 97.16% of Java online submissions for Permutations.
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList remain = new ArrayList<>();
        for (int n : nums) {
            remain.add(n);
        }
        fn(result, new ArrayList<>(), remain);
        return result;
    }

    private void fn(List<List<Integer>> result, List<Integer> stack, List<Integer> remain) {
        if (remain.size() == 0) {
            result.add(stack);
            return;
        }

        for (int i = 0; i < remain.size(); i++) {
            ArrayList stack2 = new ArrayList<>(stack);
            stack2.add(remain.get(i));
            ArrayList remain2 = new ArrayList<>(remain);
            remain2.remove(i);
            fn(result, stack2, remain2);
        }
    }
}
