package solutions

import (
	"fmt"
	"testing"
)

func TestRob(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		var tests = []struct {
			input []int
			want  int
		}{
			{[]int{1, 2, 3, 1}, 4},
			{[]int{2, 7, 9, 3, 1}, 12},
			{[]int{2, 1, 1, 2}, 4},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := rob(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
