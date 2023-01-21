package solutions

import (
	"fmt"
	"testing"
)

func TestIsValid(t *testing.T) {
	t.Run("Test isValid", func(t *testing.T) {
		var tests = []struct {
			input string
			want  bool
		}{
			{"()", true},
			{"(]", false},
			{"()[]{}", true},
			{"([)]", false},
			{"()()", true},
			{"(())([])", true},
			{"(", false},
			{"(()", false},
			{"())", false},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := isValid(v.input)
				if result != v.want {
					t.Errorf("got %v, want %v", result, v.want)
				}
			})
		}
	})
}
