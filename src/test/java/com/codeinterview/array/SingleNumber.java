package com.codeinterview.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

    @Test
    @DisplayName("基本ケース1: [2, 2, 1] -> 1")
    void testsolution_Basic1() {
        int[] nums = { 2, 2, 1 };
        assertEquals(1, SingleNumber.solution(nums));
    }

    @Test
    @DisplayName("基本ケース2: [4, 1, 2, 1, 2] -> 4")
    void testsolution_Basic2() {
        int[] nums = { 4, 1, 2, 1, 2 };
        assertEquals(4, SingleNumber.solution(nums));
    }

    @Test
    @DisplayName("要素が1つだけのケース: [1] -> 1")
    void testsolution_SingleElement() {
        int[] nums = { 1 };
        assertEquals(1, SingleNumber.solution(nums));
    }

    @Test
    @DisplayName("負の数が含まれるケース")
    void testsolution_Negative() {
        int[] nums = { -1, -1, -2 };
        assertEquals(-2, SingleNumber.solution(nums));
    }
}
