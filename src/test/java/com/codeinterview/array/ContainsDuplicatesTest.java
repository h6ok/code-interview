package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContainsDuplicatesTest {

    @Test
    @DisplayName("重複があるケース（隣接）: [1, 2, 3, 1]")
    void testsolution_HasDuplicates() {
        int[] nums = { 1, 2, 3, 1 };
        assertTrue(ContainsDuplicates.solution(nums), "重複がある場合はtrueを返すべきです");
    }

    @Test
    @DisplayName("重複がないケース: [1, 2, 3, 4]")
    void testsolution_NoDuplicates() {
        int[] nums = { 1, 2, 3, 4 };
        assertFalse(ContainsDuplicates.solution(nums), "すべての要素がユニークな場合はfalseを返すべきです");
    }

    @Test
    @DisplayName("同じ数字が連続しているケース: [1, 1, 1, 3, 3]")
    void testsolution_MultipleDuplicates() {
        int[] nums = { 1, 1, 1, 3, 3 };
        assertTrue(ContainsDuplicates.solution(nums));
    }

    @Test
    @DisplayName("エッジケース: 要素が1つだけ")
    void testsolution_SingleElement() {
        int[] nums = { 1 };
        assertFalse(ContainsDuplicates.solution(nums));
    }

    @Test
    @DisplayName("エッジケース: 配列が空")
    void testsolution_EmptyArray() {
        int[] nums = {};
        assertFalse(ContainsDuplicates.solution(nums));
    }

    @Test
    @DisplayName("負の数が含まれるケース")
    void testsolution_NegativeNumbers() {
        int[] nums = { -1, 2, -1 };
        assertTrue(ContainsDuplicates.solution(nums));
    }
}
