package solutions

import "testing"

func TestIsPalindrome(t *testing.T) {
	t.Run("Test 'A man, a plan, a canal: Panama'", func(t *testing.T) {
		input := "A man, a plan, a canal: Panama"
		want := true
		r := isPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '0P'", func(t *testing.T) {
		input := "0P"
		want := false
		r := isPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test 'a'", func(t *testing.T) {
		input := "a"
		want := true
		r := isPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})
}
