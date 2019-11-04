package io.github.mingchoi.leetcodesolutionjava.solution.q79_word_search;

import java.util.HashMap;
import java.util.Objects;

class Solution {

    class Step {
        public int x;
        public int y;

        public Step(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Step step = (Step) o;
            return x == step.x &&
                    y == step.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public boolean exist(char[][] board, String word) {
        char c0 = word.charAt(0);
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == c0) {
                    HashMap<Step, Boolean> map = new HashMap<>();
                    map.put(new Step(x, y), true);
                    if (fn(board, map, x, y, word, 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean fn(char[][] b, HashMap<Step, Boolean> map, int x, int y, String word, int pointer) {
        if (pointer >= word.length()) {
            return true;
        }

        char t = word.charAt(pointer);
        boolean valid = false;

        // check top
        if (y != 0) {
            if (!map.containsKey(new Step(x, y - 1)) && b[y - 1][x] == t) {
                HashMap<Step, Boolean> mapNext = new HashMap<>(map);
                mapNext.put(new Step(x, y - 1), true);
                if (fn(b, mapNext, x, y - 1, word, pointer + 1)) {
                    valid = true;
                }
            }
        }

        // check left
        if (x != 0) {
            if (!map.containsKey(new Step(x - 1, y)) && b[y][x - 1] == t) {
                HashMap<Step, Boolean> mapNext = new HashMap<>(map);
                mapNext.put(new Step(x - 1, y), true);
                if (fn(b, mapNext, x - 1, y, word, pointer + 1)) {
                    valid = true;
                }
            }
        }

        // check down
        if (y != b.length - 1) {
            if (!map.containsKey(new Step(x, y + 1)) && b[y + 1][x] == t) {
                HashMap<Step, Boolean> mapNext = new HashMap<>(map);
                mapNext.put(new Step(x, y + 1), true);
                if (fn(b, mapNext, x, y + 1, word, pointer + 1)) {
                    valid = true;
                }
            }
        }

        // check right
        if (x != b[0].length - 1) {
            if (!map.containsKey(new Step(x + 1, y)) && b[y][x + 1] == t) {
                HashMap<Step, Boolean> mapNext = new HashMap<>(map);
                mapNext.put(new Step(x + 1, y), true);
                if (fn(b, mapNext, x + 1, y, word, pointer + 1)) {
                    valid = true;
                }
            }
        }

        return valid;
    }
}
