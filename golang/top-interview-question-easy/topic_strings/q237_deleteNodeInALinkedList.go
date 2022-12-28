package topic_strings

/*
Runtime
0 ms
Beats
100%
Memory
2.8 MB
Beats
100%
*/
func deleteNode(node *ListNode) {
	node.Val = node.Next.Val
	node.Next = node.Next.Next
}
