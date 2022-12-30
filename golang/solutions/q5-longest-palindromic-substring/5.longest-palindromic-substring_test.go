package solutions

import "testing"

func TestLongestPalindrome(t *testing.T) {
	t.Run("Test babad", func(t *testing.T) {
		input := "babad"
		want := "bab"
		r := longestPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test cbbd", func(t *testing.T) {
		input := "cbbd"
		want := "bb"
		r := longestPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test a", func(t *testing.T) {
		input := "a"
		want := "a"
		r := longestPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test abc", func(t *testing.T) {
		input := "abc"
		want := "a"
		r := longestPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test babaddtattarrattatddetartrateedredividerb", func(t *testing.T) {
		input := "babaddtattarrattatddetartrateedredividerb"
		want := "ddtattarrattatdd"
		r := longestPalindrome(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

}
