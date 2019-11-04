package io.github.mingchoi.leetcodesolutionjava.solution.q155_min_stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Integer min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min == null) min = x;
        else if (x < min) min = x;
    }

    public void pop() {
        int x = stack.pop();
        if (x == min) {
            min = null;
            if (stack.isEmpty()) {
                min = null;
            } else {
                min = stack.peek();
                for (Integer i : stack) {
                    if (i < min) min = i;
                }
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
