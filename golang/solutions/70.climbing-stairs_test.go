package solutions

import (
	"fmt"
	"testing"
)

func TestClimbStairs(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		var tests = []struct {
			input int
			want  int
		}{
			{1, 1},
			{2, 2},
			{3, 3},
			{5, 8},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := climbStairs(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
