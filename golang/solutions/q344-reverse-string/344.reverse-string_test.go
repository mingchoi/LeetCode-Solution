package solutions

import "testing"

func TestReverseString(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		input := []byte("hello")
		want := []byte("olleh")
		reverseString([]byte(input))
		for i := 0; i < len(input); i++ {
			if input[i] != want[i] {
				t.Errorf("got %v, want %v", string(input[i]), string(want[i]))
			}
		}
	})
}
