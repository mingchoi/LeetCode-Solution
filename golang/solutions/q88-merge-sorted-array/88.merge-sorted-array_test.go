package solutions

import (
	"fmt"
	"testing"
)

func TestMerge(t *testing.T) {
	t.Run("Test merge", func(t *testing.T) {
		var tests = []struct {
			input  []int
			input2 int
			input3 []int
			input4 int
			want   []int
		}{
			{[]int{1, 2, 3, 0, 0, 0}, 3,
				[]int{2, 5, 6}, 3,
				[]int{1, 2, 2, 3, 5, 6}},
			{[]int{0}, 0,
				[]int{1}, 1,
				[]int{1}},
			{[]int{1}, 1,
				[]int{0}, 0,
				[]int{1}},
			{[]int{4, 5, 6, 0, 0, 0}, 3,
				[]int{1, 2, 3}, 3,
				[]int{1, 2, 3, 4, 5, 6}},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				merge(v.input, v.input2, v.input3, v.input4)
				if fmt.Sprint(v.input) != fmt.Sprint(v.want) {
					t.Errorf("got %v, want %v", fmt.Sprint(v.input), fmt.Sprint(v.want))
				}
			})
		}
	})
}
