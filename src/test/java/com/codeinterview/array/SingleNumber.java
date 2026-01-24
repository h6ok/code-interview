package com.codeinterview.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    @DisplayName("基本ケース1: [2, 2, 1] -> 1")
    void testSolution_Basic1() {
        int[] nums = { 2, 2, 1 };
        assertEquals(1, SingleNumber.Solution(nums));
    }

    @Test
    @DisplayName("基本ケース2: [4, 1, 2, 1, 2] -> 4")
    void testSolution_Basic2() {
        int[] nums = { 4, 1, 2, 1, 2 };
        assertEquals(4, SingleNumber.Solution(nums));
    }

    @Test
    @DisplayName("要素が1つだけのケース: [1] -> 1")
    void testSolution_SingleElement() {
        int[] nums = { 1 };
        assertEquals(1, SingleNumber.Solution(nums));
    }

    @Test
    @DisplayName("負の数が含まれるケース")
    void testSolution_Negative() {
        int[] nums = { -1, -1, -2 };
        assertEquals(-2, SingleNumber.Solution(nums));
    }
}
