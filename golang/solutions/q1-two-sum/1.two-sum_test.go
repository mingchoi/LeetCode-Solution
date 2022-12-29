package solutions

import "testing"

func TestTwoSum(t *testing.T) {
	t.Run("Test 2,7,11,15 t=9", func(t *testing.T) {
		input := []int{2, 7, 11, 15}
		target := 9
		want := []int{0, 1}
		result := twoSum(input, target)
		if result[0] != want[0] && result[1] != want[1] {
			t.Errorf("got [%v,%v], want [%v,%v]", result[0], result[1], want[0], want[1])
		}
	})
}
