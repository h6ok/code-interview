package com.codeinterview.array;

/**
 * You are given an integer array prices where prices[i] is the price of a given
 * stock on the ith day.
 * 
 * On each day, you may decide to buy and/or sell the stock. You can only hold
 * at most one share of the stock at any time. However, you can sell and buy the
 * stock multiple times on the same day, ensuring you never hold more than one
 * share of the stock.
 * 
 * Find and return the maximum profit you can achieve.
 */
public class SellStock {

    public static int solution(int[] prices) {
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
