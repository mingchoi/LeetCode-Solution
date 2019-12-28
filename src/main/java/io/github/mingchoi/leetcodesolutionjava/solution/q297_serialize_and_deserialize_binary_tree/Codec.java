package io.github.mingchoi.leetcodesolutionjava.solution.q297_serialize_and_deserialize_binary_tree;

import io.github.mingchoi.leetcodesolutionjava.datastructure.TreeNode;

import java.util.*;

public class Codec {

    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n == null) {
                sb.append("_,");
            } else {
                queue.offer(n.left);
                queue.offer(n.right);
                sb.append(n.val + ",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;
        String[] list = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode head = new TreeNode(Integer.valueOf(list[0]));
        int pt = 0;
        queue.offer(head);
        while (pt < list.length) {
            if (!list[pt].equals("_")) {
                TreeNode parent = queue.poll();
                int leftIndex = pt * 2 + 1;
                int rightIndex = pt * 2 + 2;
                if (leftIndex < list.length && !list[leftIndex].equals("_")) {
                    TreeNode leftNode = new TreeNode(Integer.valueOf(list[leftIndex]));
                    parent.left = leftNode;
                    queue.offer(leftNode);
                }
                if (rightIndex < list.length && !list[rightIndex].equals("_")) {
                    TreeNode rightNode = new TreeNode(Integer.valueOf(list[rightIndex]));
                    parent.right = rightNode;
                    queue.offer(rightNode);
                }
            }
            pt++;
        }
        return head;
    }
}
