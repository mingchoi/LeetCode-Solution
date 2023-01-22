package solutions

import (
	"fmt"
	"testing"
)

func TestIntersection(t *testing.T) {
	t.Run("Test intersection", func(t *testing.T) {
		var tests = []struct {
			input [][]int
			want  []int
		}{
			{[][]int{
				{1, 2, 2, 1},
				{2, 2}},
				[]int{2, 2}},
			{[][]int{
				{4, 9, 5},
				{9, 4, 9, 8, 4}},
				[]int{4, 9}},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := intersection(v.input)
				if fmt.Sprint(result) != fmt.Sprint(v.want) {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
