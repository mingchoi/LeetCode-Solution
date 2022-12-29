package solutions

/*
 * @lc app=leetcode id=237 lang=golang
 *
 * [237] Delete Node in a Linked List
 */

type ListNode struct {
	Val  int
	Next *ListNode
}

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 100 % of golang submissions (2.8 MB)
*/

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteNode(node *ListNode) {
	node.Val = node.Next.Val
	node.Next = node.Next.Next
}

// @lc code=end
