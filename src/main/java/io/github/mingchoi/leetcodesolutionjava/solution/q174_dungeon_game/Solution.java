package io.github.mingchoi.leetcodesolutionjava.solution.q174_dungeon_game;

public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] max = new int[dungeon.length][dungeon[0].length];
        int[][] hp = new int[dungeon.length][dungeon[0].length];

        for (int x = 0; x < dungeon.length; x++) {
            for (int y = 0; y < dungeon[0].length; y++) {

                if (x == 0 && y == 0) {
                    hp[x][y] = dungeon[x][y];
                    max[x][y] = hp[x][y];
                } else if (x == 0) {
                    hp[x][y] = hp[x][y - 1] + dungeon[x][y];
                    max[x][y] = Math.min(max[x][y - 1], hp[x][y]);
                } else if (y == 0) {
                    hp[x][y] = hp[x - 1][y] + dungeon[x][y];
                    max[x][y] = Math.min(max[x - 1][y], hp[x][y]);
                } else {
                    // TODO: need better condition
                    if (max[x - 1][y] > max[x][y - 1]) {
                        hp[x][y] = hp[x - 1][y] + dungeon[x][y];
                        max[x][y] = Math.min(max[x - 1][y], hp[x][y]);
                    } else {
                        hp[x][y] = hp[x][y - 1] + dungeon[x][y];
                        max[x][y] = Math.min(max[x][y - 1], hp[x][y]);
                    }
                }
            }
        }

        for (int x = 0; x < dungeon.length; x++) {
            for (int y = 0; y < dungeon.length; y++) {
                System.out.print(max[x][y] + ",");
            }
            System.out.print("\n");
        }

        for (int x = 0; x < dungeon.length; x++) {
            for (int y = 0; y < dungeon.length; y++) {
                System.out.print(hp[x][y] + ",");
            }
            System.out.print("\n");
        }

        return Math.max(1, 1 - max[dungeon.length - 1][dungeon[0].length - 1]);
    }
}