package com.codeinterview.array.sellstock;

public class SellStock {

    public static int Solution(int[] prices) {
        int total = 0;
        int start = 0;
        boolean increasing = true;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] > prices[i]) {
                increasing = false;
                total += prices[i - 1] - prices[start];
                start = i;
            }
            increasing = true;
        }

        if (increasing) {
            total += prices[prices.length - 1] - prices[start];
        }

        return total;
    }
}
