package solutions

import (
	"fmt"
	"testing"
)

func TestFirstUniqChar(t *testing.T) {
	t.Run("Test firstUniqChar", func(t *testing.T) {
		var tests = []struct {
			input string
			want  int
		}{
			{"leetcode", 0},
			{"loveleetcode", 2},
			{"aabb", -1},
			{"ccca", 3},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := firstUniqChar(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
