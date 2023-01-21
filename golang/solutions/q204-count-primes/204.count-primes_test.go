package solutions

import (
	"fmt"
	"testing"
)

func TestCountPrimes(t *testing.T) {
	t.Run("Test CountPrimes", func(t *testing.T) {
		var tests = []struct {
			input int
			want  int
		}{
			{10, 4},
			{0, 0},
			{1, 0},
			{2, 0},
			{100, 25},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := countPrimes(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
