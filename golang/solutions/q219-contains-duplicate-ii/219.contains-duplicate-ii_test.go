package solutions

import (
	"fmt"
	"testing"
)

func TestContainsNearbyDuplicate(t *testing.T) {
	t.Run("Test containsNearbyDuplicate", func(t *testing.T) {
		var tests = []struct {
			input  []int
			input2 int
			want   bool
		}{
			{[]int{1, 2, 3, 1}, 3, true},
			{[]int{1, 0, 1, 1}, 1, true},
			{[]int{1, 2, 3, 1, 2, 3}, 2, false},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := containsNearbyDuplicate(v.input, v.input2)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
