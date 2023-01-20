package solutions

import (
	"fmt"
	"testing"
)

func TestReverseString(t *testing.T) {
	t.Run("Test Hello", func(t *testing.T) {
		var tests = []struct {
			input int
			want  bool
		}{
			{121, true},
			{-121, false},
			{10, false},
			{123454321, true},
			{12344321, true},
			{123456321, false},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := isPalindrome(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}

func BenchmarkIsPalindrome_string(b *testing.B) {
	b.Run("isPalindrome", func(b *testing.B) {
		for i := 0; i < b.N; i++ {
			isPalindrome(123454321)
		}
	})
	b.Run("isPalindrome_slice", func(b *testing.B) {
		for i := 0; i < b.N; i++ {
			isPalindrome_slice(123454321)
		}
	})
	b.Run("isPalindrome_string", func(b *testing.B) {
		for i := 0; i < b.N; i++ {
			isPalindrome_string(123454321)
		}
	})
}
