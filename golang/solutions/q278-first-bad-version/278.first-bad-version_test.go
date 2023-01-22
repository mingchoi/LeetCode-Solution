package solutions

import (
	"fmt"
	"testing"
)

func TestFirstBadVersion(t *testing.T) {
	t.Run("Test firstBadVersion", func(t *testing.T) {
		var tests = []struct {
			input int
			want  int
		}{
			{5, 4},
			{100, 23},
			{99, 21},
			{100, 75},
			{100, 99},
			{100, 100},
			{1, 1},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				setBadVersion(v.want)
				result := firstBadVersion(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", fmt.Sprint(v.input), fmt.Sprint(v.want))
				}
			})
		}
	})
}
