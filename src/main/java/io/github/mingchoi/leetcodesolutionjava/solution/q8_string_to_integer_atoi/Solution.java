package io.github.mingchoi.leetcodesolutionjava.solution.q8_string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {
        int multiplier = 1;
        long count = 0;
        boolean broken = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == ' ' || c == '+') {
                if (count != 0) {
                    broken = true;
                }
                continue;
            } else if (c == '-') {
                count *= -1;
                continue;
            } else if (broken) {
                return 0;
            }

            Integer in = char2int(c);
            if (in == null) {
                return 0;
            }
            count += (long)in * multiplier;
            multiplier *= 10;
        }
        if (count > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (count < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) count;
    }

    public Integer char2int(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return null;
        }
    }

}
