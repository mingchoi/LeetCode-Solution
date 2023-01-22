package solutions

import (
	"fmt"
	"testing"
)

func TestStrStr(t *testing.T) {
	t.Run("Test trStr", func(t *testing.T) {
		var tests = []struct {
			input  string
			input2 string
			want   int
		}{
			{"a", "a", 0},
			{"sadbutsad", "sad", 0},
			{"leetcode", "leeto", -1},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := strStr(v.input, v.input2)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
