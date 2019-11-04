package io.github.mingchoi.leetcodesolutionjava.datastructure;

public class TreeNode {
    public int val;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof TreeNode)) return false;
        TreeNode node = (TreeNode) obj;
        return isEqual(this, node);
    }

    boolean isEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.val == b.val &&
                    isEqual(a.left, b.left) &&
                    isEqual(a.right, b.right);
        }
        return false;
    }
}
