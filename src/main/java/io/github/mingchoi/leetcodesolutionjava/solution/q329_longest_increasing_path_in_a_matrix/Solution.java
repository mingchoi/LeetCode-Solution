package io.github.mingchoi.leetcodesolutionjava.solution.q329_longest_increasing_path_in_a_matrix;

import java.util.HashSet;
import java.util.Objects;

// TODO: TLE
public class Solution {
    class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return x == position.x &&
                    y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;
        HashSet<Position> heads = new HashSet<>();
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                findHeads(matrix, heads, new Position(x, y));
            }
        }

        int[][] score = new int[matrix.length][matrix[0].length];

        for (Position p : heads) {
            findTails(matrix, score, new Position(p.x, p.y), 1);
        }

        int max = 0;
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                max = Math.max(score[y][x], max);
            }
        }

        return max;
    }

    public void findHeads(int[][] matrix, HashSet<Position> heads, Position pos) {
        int total = 0;
        int curr = matrix[pos.y][pos.x];
        // up
        if (pos.y > 0) {
            int up = matrix[pos.y - 1][pos.x];
            if (up < curr) {
                total++;
                findHeads(matrix, heads, new Position(pos.x, pos.y - 1));
            }
        }
        // down
        if (pos.y < matrix.length - 1) {
            int down = matrix[pos.y + 1][pos.x];
            if (down < curr) {
                total++;
                findHeads(matrix, heads, new Position(pos.x, pos.y + 1));
            }
        }
        // left
        if (pos.x > 0) {
            int left = matrix[pos.y][pos.x - 1];
            if (left < curr) {
                total++;
                findHeads(matrix, heads, new Position(pos.x - 1, pos.y));
            }
        }
        // right
        if (pos.x < matrix[0].length - 1) {
            int right = matrix[pos.y][pos.x + 1];
            if (right < curr) {
                total++;
                findHeads(matrix, heads, new Position(pos.x + 1, pos.y));
            }
        }
        if (total == 0) heads.add(pos);
    }

    public void findTails(int[][] matrix, int[][] scoreMatrix, Position pos, int score) {
        int curr = matrix[pos.y][pos.x];
        scoreMatrix[pos.y][pos.x] = score;
        // up
        if (pos.y > 0) {
            int up = matrix[pos.y - 1][pos.x];
            if (up > curr) {
                if (scoreMatrix[pos.y - 1][pos.x] < score + 1) {
                    findTails(matrix, scoreMatrix, new Position(pos.x, pos.y - 1), score + 1);
                }
            }
        }
        // down
        if (pos.y < matrix.length - 1) {
            int down = matrix[pos.y + 1][pos.x];
            if (down > curr) {
                if (scoreMatrix[pos.y + 1][pos.x] < score + 1) {
                    findTails(matrix, scoreMatrix, new Position(pos.x, pos.y + 1), score + 1);
                }
            }
        }
        // left
        if (pos.x > 0) {
            int left = matrix[pos.y][pos.x - 1];
            if (left > curr) {
                if (scoreMatrix[pos.y][pos.x - 1] < score + 1) {
                    findTails(matrix, scoreMatrix, new Position(pos.x - 1, pos.y), score + 1);
                }
            }
        }
        // right
        if (pos.x < matrix[0].length - 1) {
            int right = matrix[pos.y][pos.x + 1];
            if (right > curr) {
                if (scoreMatrix[pos.y][pos.x + 1] < score + 1) {
                    findTails(matrix, scoreMatrix, new Position(pos.x + 1, pos.y), score + 1);
                }
            }
        }
    }
}