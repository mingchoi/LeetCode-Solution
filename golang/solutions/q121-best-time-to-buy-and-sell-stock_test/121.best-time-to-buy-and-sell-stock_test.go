package solutions

import (
	"fmt"
	"testing"
)

func TestMaxProfit(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		var tests = []struct {
			input []int
			want  int
		}{
			{[]int{7, 1, 5, 3, 6, 4}, 5},
			{[]int{7, 6, 4, 3, 1}, 0},
			{[]int{1, 2}, 1},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := maxProfit(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
