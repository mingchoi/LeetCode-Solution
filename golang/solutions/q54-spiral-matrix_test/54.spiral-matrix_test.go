package solutions

import (
	"fmt"
	"testing"
)

func TestSpiralOrder(t *testing.T) {
	t.Run("Test [[1,2,3],[4,5,6],[7,8,9]]", func(t *testing.T) {
		input := [][]int{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		}
		want := fmt.Sprint([]int{1, 2, 3, 6, 9, 8, 7, 4, 5})
		r := fmt.Sprint(spiralOrder(input))
		if want != r {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test [[1,2,3,4],[5,6,7,8],[9,10,11,12]]", func(t *testing.T) {
		input := [][]int{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
		}
		want := fmt.Sprint([]int{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7})
		r := fmt.Sprint(spiralOrder(input))
		if want != r {
			t.Errorf("got %v, want %v", r, want)
		}
	})
}
