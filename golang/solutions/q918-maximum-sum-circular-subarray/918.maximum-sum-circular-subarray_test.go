package solutions

import (
	"fmt"
	"testing"
)

func TestReverseString(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		var tests = []struct {
			input []int
			want  int
		}{
			{[]int{1, -2, 3, -2}, 3},
			{[]int{5, -3, 5}, 10},
			{[]int{5, -3, 4}, 9},
			{[]int{-3, -2, -3}, -2},
			{[]int{0, 5, 8, -9, 9, -7, 3, -2}, 16},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := maxSubarraySumCircular(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
