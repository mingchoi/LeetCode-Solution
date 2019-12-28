package io.github.mingchoi.leetcodesolutionjava.solution.q36_valid_sudoku;

import java.util.HashMap;
/*
Runtime: 3 ms, faster than 70.89% of Java online submissions for Valid Sudoku.
Memory Usage: 43.9 MB, less than 81.16% of Java online submissions for Valid Sudoku.
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            HashMap<Character, Boolean> map = new HashMap<>();
            for (int col = 0; col < 9; col++) {
                Character c = board[row][col];
                if (c != '.') {
                    if (map.containsKey(c)) {
                        return false;
                    } else {
                        map.put(c, true);
                    }
                }
            }
        }

        for (int col = 0; col < 9; col++) {
            HashMap<Character, Boolean> map = new HashMap<>();
            for (int row = 0; row < 9; row++) {
                Character c = board[row][col];
                if (c != '.') {
                    if (map.containsKey(c)) {
                        return false;
                    } else {
                        map.put(c, true);
                    }
                }
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                HashMap<Character, Boolean> map = new HashMap<>();
                for (int col = 0; col < 3; col++) {
                    for (int row = 0; row < 3; row++) {
                        Character c = board[x * 3 + row][y * 3 + col];
                        if (c != '.') {
                            if (map.containsKey(c)) {
                                return false;
                            } else {
                                map.put(c, true);
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
