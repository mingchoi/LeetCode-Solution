package io.github.mingchoi.leetcodesolutionjava.solution.q289_game_of_life;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Game of Life.
 */
public class Solution {
    public void gameOfLife(int[][] board) {
        if (board.length == 0) return;

        // copy last state
        int[][] last = new int[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            last[r] = new int[board[0].length];
            for (int c = 0; c < board[0].length; c++) {
                last[r][c] = board[r][c];
            }
        }

        // update
        int collast = board[0].length - 1;
        int rowlast = board.length - 1;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                int neighbors = countNeighbors(last, collast, rowlast, r, c);
                board[r][c] = cellShouldLive(last[r][c], neighbors);
            }
        }
    }

    private int cellShouldLive(int state, int neighbors) {
        if (neighbors < 2) {
            return 0;
        } else if (neighbors > 3) {
            return 0;
        } else if (neighbors == 2 && state == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private int countNeighbors(int[][] board, int collast, int rowlast, int r, int c) {
        int neighbors = 0;
        if (r > 0) {
            // TL
            if (c > 0) {
                if (board[r - 1][c - 1] == 1) neighbors++;
            }
            // T
            if (board[r - 1][c] == 1) neighbors++;
            // TR
            if (c < collast) {
                if (board[r - 1][c + 1] == 1) neighbors++;
            }
        }
        // L
        if (c > 0) {
            if (board[r][c - 1] == 1) neighbors++;
        }
        // R
        if (c < collast) {
            if (board[r][c + 1] == 1) neighbors++;
        }
        if (r < rowlast) {
            // BL
            if (c > 0) {
                if (board[r + 1][c - 1] == 1) neighbors++;
            }
            // B
            if (board[r + 1][c] == 1) neighbors++;
            // BR
            if (c < collast) {
                if (board[r + 1][c + 1] == 1) neighbors++;
            }
        }
        return neighbors;
    }

    private void print(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
}
