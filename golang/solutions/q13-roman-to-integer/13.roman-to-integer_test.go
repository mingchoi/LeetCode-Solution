package solutions

import (
	"fmt"
	"testing"
)

func TestRomanToInt(t *testing.T) {
	t.Run("Test romanToInt", func(t *testing.T) {
		var tests = []struct {
			input string
			want  int
		}{
			{"I", 1},
			{"II", 2},
			{"III", 3},
			{"IV", 4},
			{"V", 5},
			{"VI", 6},
			{"VII", 7},
			{"VIII", 8},
			{"IX", 9},
			{"X", 10},
			{"XI", 11},
			{"XII", 12},
			{"XIII", 13},
			{"XIV", 14},
			{"XV", 15},
			{"XVI", 16},
			{"LVIII", 58},
			{"MCMXCIV", 1994},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := romanToInt(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
