package com.codeinterview.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    @DisplayName("n=3 のケース: [1, 2, Fizz]")
    void testFizzBuzz_Small() {
        List<String> result = FizzBuzz.Solution(3);
        assertEquals(3, result.size());
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
    }

    @Test
    @DisplayName("n=5 のケース: [..., 4, Buzz]")
    void testFizzBuzz_Five() {
        List<String> result = FizzBuzz.Solution(5);
        assertEquals("Buzz", result.get(4));
    }

    @Test
    @DisplayName("n=15 のケース: 15番目が FizzBuzz になること")
    void testFizzBuzz_Fifteen() {
        List<String> result = FizzBuzz.Solution(15);
        assertEquals("FizzBuzz", result.get(14)); // 0-indexedなのでインデックスは14
        assertEquals("Fizz", result.get(2)); // 3番目
        assertEquals("Buzz", result.get(4)); // 5番目
    }

    @Test
    @DisplayName("リスト全体の内容を検証 (n=15)")
    void testFizzBuzz_FullList() {
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, FizzBuzz.Solution(15));
    }
}
