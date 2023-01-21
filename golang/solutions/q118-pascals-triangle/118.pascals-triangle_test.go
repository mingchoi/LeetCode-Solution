package solutions

import (
	"fmt"
	"testing"
)

func TestGenerate(t *testing.T) {
	t.Run("Test generate", func(t *testing.T) {
		var tests = []struct {
			input int
			want  [][]int
		}{
			// {1, [][]int{{1}}},
			// {2, [][]int{{1}, {1, 1}}},
			{5, [][]int{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}}},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := generate(v.input)
				if fmt.Sprint(result) != fmt.Sprint(v.want) {
					t.Errorf("got \n%v, want \n%v", fmt.Sprint(result), fmt.Sprint(v.want))
				}
			})
		}
	})
}
