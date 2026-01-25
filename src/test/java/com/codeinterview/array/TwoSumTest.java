package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    @DisplayName("基本ケース: [2, 7, 11, 15], target=9")
    void testTwoSum_Basic() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = TwoSum.solution(nums, target); // クラス名は適宜調整してください

        // インデックス 0 と 1 を期待
        assertArrayEquals(new int[] { 0, 1 }, result);
    }

    @Test
    @DisplayName("同じ数字の組み合わせ: [3, 3], target=6")
    void testTwoSum_SameNumbers() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] result = TwoSum.solution(nums, target);

        assertArrayEquals(new int[] { 0, 1 }, result);
    }

    @Test
    @DisplayName("負の数が含まれるケース")
    void testTwoSum_Negative() {
        int[] nums = { -1, -2, -3, -4, -5 };
        int target = -8;
        int[] result = TwoSum.solution(nums, target);

        // -3 + -5 = -8
        assertArrayEquals(new int[] { 2, 4 }, result);
    }

    @Test
    @DisplayName("解が見つからないケース")
    void testTwoSum_Nosolution() {
        int[] nums = { 1, 2, 3 };
        int target = 7;
        int[] result = TwoSum.solution(nums, target);

        assertEquals(0, result.length);
    }
}
