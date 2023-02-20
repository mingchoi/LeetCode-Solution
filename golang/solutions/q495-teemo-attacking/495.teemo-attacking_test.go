package solutions

import (
	"fmt"
	"testing"
)

func TestFindPoisonedDuration(t *testing.T) {
	t.Run("Test findPoisonedDuration", func(t *testing.T) {
		var tests = []struct {
			input  []int
			input2 int
			want   int
		}{
			{[]int{1, 4}, 2, 4},
			{[]int{1, 2}, 2, 3},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := findPoisonedDuration(v.input, v.input2)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
