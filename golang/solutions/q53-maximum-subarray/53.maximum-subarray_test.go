package solutions

import (
	"fmt"
	"testing"
)

func TestMaxSubArray(t *testing.T) {
	t.Run("Test maxSubArray", func(t *testing.T) {
		var tests = []struct {
			input []int
			want  int
		}{
			{
				[]int{-2, 1, -3, 4, -1, 2, 1, -5, 4},
				6,
			},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := maxSubArray(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
