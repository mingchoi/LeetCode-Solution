package solutions

/*
 * @lc app=leetcode id=104 lang=golang
 *
 * [104] Maximum Depth of Binary Tree
 */

/*
Your runtime beats 89.41 % of golang submissions
Your memory usage beats 60.14 % of golang submissions (4.1 MB)
*/

// @lc code=start
func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	left := maxDepth(root.Left)
	right := maxDepth(root.Right)
	if left > right {
		return 1 + left
	}
	return 1 + right
}

// @lc code=end

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}
