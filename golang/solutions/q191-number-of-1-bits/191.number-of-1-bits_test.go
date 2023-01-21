package solutions

import (
	"fmt"
	"testing"
)

func TestHammingWeight(t *testing.T) {
	t.Run("Test hammingWeight", func(t *testing.T) {
		var tests = []struct {
			input uint32
			want  int
		}{
			{0b00000000000000000000000000001011, 3},
			{0b00000000000000000000000010000000, 1},
			{0b11111111111111111111111111111101, 31},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := hammingWeight(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
