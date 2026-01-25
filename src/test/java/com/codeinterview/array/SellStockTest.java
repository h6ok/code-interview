package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SellStockTest {

    @Test
    @DisplayName("基本ケース: 複数の山がある場合")
    void testsolution_Basic() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        // 1円で買って5円で売る(+4)、3円で買って6円で売る(+3) = 合計 7
        assertEquals(7, SellStock.solution(prices));
    }

    @Test
    @DisplayName("右肩上がりのケース")
    void testsolution_Increasing() {
        int[] prices = { 1, 2, 3, 4, 5 };
        // 1円で買って5円で売る = 合計 4
        assertEquals(4, SellStock.solution(prices));
    }

    @Test
    @DisplayName("右肩下がりのケース: 利益ゼロ")
    void testsolution_Decreasing() {
        int[] prices = { 7, 6, 4, 3, 1 };
        assertEquals(0, SellStock.solution(prices));
    }

    @Test
    @DisplayName("平坦な価格のケース")
    void testsolution_Flat() {
        int[] prices = { 2, 2, 2, 2, 2 };
        assertEquals(0, SellStock.solution(prices));
    }

    @Test
    @DisplayName("要素が1つだけのケース")
    void testsolution_SingleElement() {
        int[] prices = { 1 };
        assertEquals(0, SellStock.solution(prices));
    }

    @Test
    @DisplayName("急落と急騰が混ざるケース")
    void testsolution_Fluctuating() {
        int[] prices = { 2, 1, 2, 0, 1 };
        // 1->2(+1), 0->1(+1) = 合計 2
        assertEquals(2, SellStock.solution(prices));
    }
}
