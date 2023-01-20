package solutions

import (
	"fmt"
	"testing"
)

func TestIsPalindrome(t *testing.T) {
	t.Run("Test push", func(t *testing.T) {
		stack := Constructor()

		stack.Push(1)
		want := fmt.Sprint([]int{1})
		result := fmt.Sprint(stack.stack)
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Push(2)
		want = fmt.Sprint([]int{1, 2})
		result = fmt.Sprint(stack.stack)
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}
	})

	t.Run("Test pop", func(t *testing.T) {
		stack := Constructor()
		stack.Push(1)
		stack.Push(2)

		stack.Pop()
		want := fmt.Sprint([]int{1})
		result := fmt.Sprint(stack.stack)
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Pop()
		want = fmt.Sprint([]int{})
		result = fmt.Sprint(stack.stack)
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}
	})

	t.Run("Test GetMin", func(t *testing.T) {
		stack := Constructor()
		stack.Push(3)

		want := 3
		result := stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Push(1)
		want = 1
		result = stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Push(2)
		want = 1
		result = stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Pop()
		want = 1
		result = stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Pop()
		want = 3
		result = stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}
	})

	t.Run(`Test "MinStack","push","push","push","getMin","pop","getMin"`, func(t *testing.T) {
		stack := Constructor()
		stack.Push(0)
		stack.Push(1)
		stack.Push(0)

		want := 0
		result := stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}

		stack.Pop()
		want = 0
		result = stack.GetMin()
		if want != result {
			t.Errorf("got %v, want %v", result, want)
		}
	})
}
