package solutions

import (
	"fmt"
	"testing"
)

func TestLongestCommonPrefix(t *testing.T) {
	t.Run("Test longestCommonPrefix", func(t *testing.T) {
		var tests = []struct {
			input []string
			want  string
		}{
			{[]string{"flower", "flow", "flight"}, "fl"},
			{[]string{"dog", "racecar", "car"}, ""},
			{[]string{"a"}, "a"},
			{[]string{"ab", "a"}, "a"},
			{[]string{"a", "a"}, "a"},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := longestCommonPrefix(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
