package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoPointersTest {

    @Test
    @DisplayName("正常系：leftがrightの部分列である場合")
    void testIsSubsequence() {
        int[] left = { 1, 3, 5 };
        int[] right = { 1, 2, 3, 4, 5 };
        assertTrue(TwoPointers.Solution(left, right), "1, 3, 5 は順番通りに含まれているのでtrue");
    }

    @Test
    @DisplayName("正常系：leftがrightと完全に一致する場合")
    void testExactMatch() {
        int[] left = { 1, 2, 3 };
        int[] right = { 1, 2, 3 };
        assertTrue(TwoPointers.Solution(left, right));
    }

    @Test
    @DisplayName("不一致：要素は存在するが順番が違う場合")
    void testWrongOrder() {
        int[] left = { 5, 3 };
        int[] right = { 1, 3, 5 };
        assertFalse(TwoPointers.Solution(left, right), "順番が逆なのでfalseになるべき");
    }

    @Test
    @DisplayName("不一致：leftの方が要素が多い場合")
    void testLeftLongerThanRight() {
        int[] left = { 1, 2, 3, 4 };
        int[] right = { 1, 2 };
        assertFalse(TwoPointers.Solution(left, right));
    }

    @Test
    @DisplayName("境界値：rightが空の場合")
    void testEmptyRight() {
        int[] left = { 1 };
        int[] right = {};
        assertFalse(TwoPointers.Solution(left, right));
    }

    @Test
    @DisplayName("leftが空の場合")
    void testEmptyLeft() {
        int[] left = {};
        int[] right = { 1, 2, 3 };
        assertFalse(TwoPointers.Solution(left, right), "leftが空なのでFalseになるべき");
    }
}
