package topic_strings

/**
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

/*
Runtime
0 ms
Beats
100%
Memory
2.1 MB
Beats
74.17%
*/

func removeNthFromEnd(head *ListNode, n int) *ListNode {
	l := r(head, n)
	if l == n {
		if l == 1 {
			return nil
		} else {
			return head.Next
		}
	}
	return head
}

func r(node *ListNode, n int) int {
	if node.Next == nil {
		return 1
	}
	index := r(node.Next, n) + 1
	if index == n+1 {
		node.Next = node.Next.Next
	}
	return index
}
