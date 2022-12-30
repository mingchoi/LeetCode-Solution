package solutions

import "testing"

func TestRemoveNthFromEnd(t *testing.T) {
	t.Run("Test '42'", func(t *testing.T) {
		input := "42"
		want := 42
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '   -42'", func(t *testing.T) {
		input := "   -42"
		want := -42
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '4193 with words'", func(t *testing.T) {
		input := "4193 with words"
		want := 4193
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test 'words and 987'", func(t *testing.T) {
		input := "words and 987"
		want := 0
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '-91283472332'", func(t *testing.T) {
		input := "-91283472332"
		want := -2147483648
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '3.14159'", func(t *testing.T) {
		input := "3.14159"
		want := 3
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '+-12'", func(t *testing.T) {
		input := "+-12"
		want := 0
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '-+12'", func(t *testing.T) {
		input := "-+12"
		want := 0
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '  -0012a42'", func(t *testing.T) {
		input := "  -0012a42"
		want := -12
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '00000-42a1234'", func(t *testing.T) {
		input := "00000-42a1234"
		want := 0
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '   +0 123'", func(t *testing.T) {
		input := "   +0 123"
		want := 0
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '  0000000000012345678'", func(t *testing.T) {
		input := "  0000000000012345678"
		want := 12345678
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '9223372036854775808'", func(t *testing.T) {
		input := "9223372036854775808"
		want := 2147483647
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

	t.Run("Test '1553255926290448384'", func(t *testing.T) {
		input := "1553255926290448384"
		want := 2147483647
		r := myAtoi(input)
		if r != want {
			t.Errorf("got %v, want %v", r, want)
		}
	})

}
