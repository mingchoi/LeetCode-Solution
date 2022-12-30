package solutions

import (
	"fmt"
	"testing"
)

func TestMerge(t *testing.T) {
	t.Run("Test [[1,3],[2,6],[8,10],[15,18]]", func(t *testing.T) {
		input := [][]int{{1, 3}, {2, 6}, {8, 10}, {15, 18}}
		want := [][]int{{1, 6}, {8, 10}, {15, 18}}
		r := merge(input)
		if fmt.Sprint(input) != fmt.Sprint(want) {
			t.Errorf("got %v, want %v", r, want)
		}
	})
}
