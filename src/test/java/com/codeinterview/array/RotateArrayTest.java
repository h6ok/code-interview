package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    @DisplayName("基本ケース: [1,2,3,4,5,6,7], k=3")
    void testRotate_Basic() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int[] expected = { 5, 6, 7, 1, 2, 3, 4 };

        RotateArray.Solution(nums, k);

        assertArrayEquals(expected, nums, "配列が正しく右に3回転していません");
    }

    @Test
    @DisplayName("kが0のケース: 配列が変化しないこと")
    void testRotate_ZeroK() {
        int[] nums = { 1, 2, 3, 4 };
        int k = 0;
        int[] expected = { 1, 2, 3, 4 };

        RotateArray.Solution(nums, k);

        assertArrayEquals(expected, nums);
    }

    @Test
    @DisplayName("kが配列の長さを超えるケース: k % length と同等")
    void testRotate_LargeK() {
        int[] nums = { 1, 2, 3 };
        int k = 4; // 1回転と同じ
        int[] expected = { 3, 1, 2 };

        RotateArray.Solution(nums, k);

        assertArrayEquals(expected, nums);
    }

    @Test
    @DisplayName("要素が1つのケース")
    void testRotate_SingleElement() {
        int[] nums = { 1 };
        int k = 5;
        int[] expected = { 1 };

        RotateArray.Solution(nums, k);

        assertArrayEquals(expected, nums);
    }
}
