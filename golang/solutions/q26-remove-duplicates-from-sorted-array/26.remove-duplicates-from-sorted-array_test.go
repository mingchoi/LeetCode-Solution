package solutions

import (
	"testing"
)

func TestRemoveDuplicates(t *testing.T) {
	t.Run("Test [1,1,2]", func(t *testing.T) {
		input := []int{1, 1, 2}
		want := 2
		wantInPlace := []int{1, 2}
		r := removeDuplicates(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
		for i := 0; i < want; i++ {
			if input[i] != wantInPlace[i] {
				t.Errorf("got %v, want %v", r, want)
			}
		}
	})
}
