package solutions

import (
	"fmt"
	"testing"
)

func TestHammingDistance(t *testing.T) {
	t.Run("Test hammingDistance", func(t *testing.T) {
		var tests = []struct {
			input  int
			input2 int
			want   int
		}{
			{1, 4, 2},
			{3, 1, 1},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := hammingDistance(v.input, int(v.input2))
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
