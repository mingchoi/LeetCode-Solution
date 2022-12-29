package solutions

import "testing"

func TestRemoveNthFromEnd(t *testing.T) {
	t.Run("Test 12345, n=2", func(t *testing.T) {
		head := &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
				Next: &ListNode{
					Val: 3,
					Next: &ListNode{
						Val: 4,
						Next: &ListNode{
							Val: 5,
						},
					},
				},
			},
		}
		want := []int{1, 2, 3, 5}

		r := removeNthFromEnd(head, 2)
		i := 0
		pt := r
		for pt != nil {
			if pt.Val != want[i] {
				t.Errorf("got %v, want %v", pt.Val, want[i])
			}
			pt = pt.Next
			i++
		}
	})

	t.Run("Test 1, n=1", func(t *testing.T) {
		head := &ListNode{
			Val: 1,
		}

		r := removeNthFromEnd(head, 1)
		if r != nil {
			t.Errorf("got %v, want %v", head, nil)
		}
	})

	t.Run("Test 12, n=2", func(t *testing.T) {
		head := &ListNode{
			Val: 1,
			Next: &ListNode{
				Val: 2,
			},
		}

		want := []int{2}
		r := removeNthFromEnd(head, 2)
		i := 0
		pt := r
		for pt != nil {
			if pt.Val != want[i] {
				t.Errorf("got %v, want %v", pt.Val, want[i])
			}
			pt = pt.Next
			i++
		}
	})
}
