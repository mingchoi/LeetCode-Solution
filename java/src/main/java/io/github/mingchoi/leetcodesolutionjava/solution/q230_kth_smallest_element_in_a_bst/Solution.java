package io.github.mingchoi.leetcodesolutionjava.solution.q230_kth_smallest_element_in_a_bst;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
Runtime: 1 ms, faster than 73.05% of Java online submissions for Kth Smallest Element in a BST.
Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Kth Smallest Element in a BST.
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        loop:
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            if (stack.isEmpty()) break loop;
            if (curr == null) {
                TreeNode print = stack.pop();
                curr = print.right;
//                System.out.println(print.val);
                k--;
                if (k == 0) return print.val;
            }
        }

        return -1;
    }

    public int kthSmallest_slow(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        collect(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    public void collect(TreeNode node, ArrayList<Integer> list) {
        list.add(node.val);
        if (node.left != null) collect(node.left, list);
        if (node.right != null) collect(node.right, list);
    }
}