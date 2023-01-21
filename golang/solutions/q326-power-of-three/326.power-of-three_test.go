package solutions

import (
	"fmt"
	"testing"
)

func TestIsPowerOfThree(t *testing.T) {
	t.Run("Test isPowerOfThree", func(t *testing.T) {
		var tests = []struct {
			input int
			want  bool
		}{
			{20, false},
			{27, true},
			{0, false},
			{-1, false},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := isPowerOfThree(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
