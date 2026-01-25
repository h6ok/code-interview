package com.codeinterview.string;

public class ReverseInteger {

    public static int solution(int x) {
        boolean minus = x < 0;

        int base = minus ? -1 * x : x;
        int reversed = 0;

        while (base > 0) {
            int surplus = base % 10;
            base = base / 10;

            reversed = reversed * 10 + surplus;
        }

        return minus ? -1 * reversed : reversed;
    }
}
