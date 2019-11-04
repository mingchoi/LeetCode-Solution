package io.github.mingchoi.leetcodesolutionjava.solution.q150_evaluate_reverse_polish_notation;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int pt = 0;
        Stack<Integer> stack = new Stack<>();
        while (pt < tokens.length) {
            if (!isOperator(tokens[pt])) {
                stack.add(Integer.parseInt(tokens[pt]));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (tokens[pt]) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
            pt++;
        }
        return stack.pop();
    }

    // Recurive_TLE

    public int evalRPN_Recurive_TLE(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        if (tokens.length == 3) {
            return calculate(tokens[0], tokens[1], tokens[2]);
        }
        String[] lhs;
        String[] rhs;
        String operator = tokens[tokens.length - 1];

        int pt = tokens.length - 2;
        int opCount = 1;
        int numCount = 0;
        while (opCount != numCount) {
            if (isOperator(tokens[pt])) {
                opCount++;
            } else {
                numCount++;
            }
            pt--;
        }

        lhs = new String[pt + 1];
        rhs = new String[tokens.length - pt - 2];

        for (int i = 0; i < lhs.length; i++) {
            lhs[i] = tokens[i];
        }

        for (int i = pt + 1; i < tokens.length - 1; i++) {
            rhs[i - pt - 1] = tokens[i];
        }

        switch (operator) {
            case "+":
                return evalRPN(lhs) + evalRPN(rhs);
            case "-":
                return evalRPN(lhs) - evalRPN(rhs);
            case "*":
                return evalRPN(lhs) * evalRPN(rhs);
            case "/":
                return evalRPN(lhs) / evalRPN(rhs);
        }
        return 0;
    }

    public boolean isOperator(String token) {
        return token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/");
    }

    public int calculate(String lhs, String rhs, String operator) {
        switch (operator) {
            case "+":
                return Integer.parseInt(lhs) + Integer.parseInt(rhs);
            case "-":
                return Integer.parseInt(lhs) - Integer.parseInt(rhs);
            case "*":
                return Integer.parseInt(lhs) * Integer.parseInt(rhs);
            case "/":
                return Integer.parseInt(lhs) / Integer.parseInt(rhs);
        }
        return 0;
    }
}