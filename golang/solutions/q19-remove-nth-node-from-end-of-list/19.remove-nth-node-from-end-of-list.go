package solutions

/*
 * @lc app=leetcode id=19 lang=golang
 *
 * [19] Remove Nth Node From End of List
 */

type ListNode struct {
	Val  int
	Next *ListNode
}

/*
Your runtime beats 100 % of golang submissions
Your memory usage beats 73.24 % of golang submissions (2.1 MB)
*/

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
	l := r_q19(head, n)
	if l == n {
		if l == 1 {
			return nil
		} else {
			return head.Next
		}
	}
	return head
}

func r_q19(node *ListNode, n int) int {
	if node.Next == nil {
		return 1
	}
	index := r_q19(node.Next, n) + 1
	if index == n+1 {
		node.Next = node.Next.Next
	}
	return index
}

// @lc code=end
