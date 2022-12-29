package io.github.mingchoi.leetcodesolutionjava.solution.q130_surrounded_regions;

import java.util.HashMap;
/*
Runtime: 5 ms, faster than 17.47% of Java online submissions for Surrounded Regions.
Memory Usage: 40.6 MB, less than 96.43% of Java online submissions for Surrounded Regions.
 */
class Solution {
    int width;
    int height;
    HashMap<Integer, HashMap<Integer, Boolean>> map;

    Boolean getMap(int x, int y) {
        if (map.get(x) != null) {
            return map.get(x).get(y);
        }
        return null;
    }

    void setMap(int x, int y, boolean value) {
        if (map.get(x) == null) {
            map.put(x, new HashMap<Integer, Boolean>());
        }
        map.get(x).put(y, value);
    }

    public void solve(char[][] board) {
        width = board.length;
        if (width < 2) return;
        height = board[0].length;
        if (height < 2) return;
        map = new HashMap<>();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if ((x != 0 && x != width - 1) && (y != 0 && y != height - 1)) continue;
                if (board[x][y] == 'O' && getMap(x, y) == null) {
                    markAlive(x, y, board);
                }
            }
        }

        int a = 1;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (board[x][y] == 'O' && getMap(x, y) == null) {
                    board[x][y] = 'X';
                }
            }
        }
        a = 1;

    }

    void markAlive(int x, int y, char[][] board) {
        setMap(x, y, true);

        if (x > 0) {
            if (board[x - 1][y] == 'O' && getMap(x - 1, y) == null) {
                markAlive(x - 1, y, board);
            }
        }

        if (x < width - 1) {
            if (board[x + 1][y] == 'O' && getMap(x + 1, y) == null) {
                markAlive(x + 1, y, board);
            }
        }

        if (y > 0) {
            if (board[x][y - 1] == 'O' && getMap(x, y - 1) == null) {
                markAlive(x, y - 1, board);
            }
        }

        if (y < height - 1) {
            if (board[x][y + 1] == 'O' && getMap(x, y + 1) == null) {
                markAlive(x, y + 1, board);
            }
        }
    }
}
