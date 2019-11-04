package io.github.mingchoi.leetcodesolutionjava.solution.q322_coin_change;

import java.util.Arrays;

/*

 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0 || coins.length == 0) return 0;

        int[] t = new int[amount + 1];
        for (int i = 0; i < t.length; i++) t[i] = Integer.MAX_VALUE;

        // TODO:

        return 0;
    }

    public int coinChange_failed(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        if (coins.length == 0 || amount < coins[0]) return -1;
        int[] t = new int[amount];
        for (int c : coins) {
            if (c == amount) return 1;
            for (int i = c; i <= amount; i += c) {
                t[i - 1] = i / c;
            }
        }

//        print(t);

        int p = coins[0];
        while (p <= amount) {
            for (int i = coins.length - 1; i >= 0; i--) {
                int target = p - coins[i];
                if (target > 0) {
                    if (t[target - 1] != 0) {
                        if (t[p - 1] == 0) {
                            t[p - 1] = t[target - 1] + 1;
                        } else {
                            t[p - 1] = Math.min(t[p - 1], t[target - 1] + 1);
                        }
//                        System.out.println((p - 1) + "->" + t[p - 1]);
                        break;
                    }
                }
            }
//            print(t);
            p++;
        }

        return t[amount - 1] == 0 ? -1 : t[amount - 1];
    }

    private void print(int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] > 9) {
                System.out.print(t[i] + ",");
            } else {
                System.out.print(" " + t[i] + ",");
            }
        }
        System.out.print("\n");
    }

}
