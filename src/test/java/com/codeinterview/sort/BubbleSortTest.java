package com.codeinterview.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    @DisplayName("正常系：バラバラな順序の配列が昇順にソートされること")
    void testStandardSort() {
        int[] input = { 5, 3, 8, 4, 2 };
        int[] expected = { 2, 3, 4, 5, 8 };

        int[] result = BubbleSort.Solution(input);

        assertArrayEquals(expected, result, "標準的なソートが正しく行われる必要があります");
    }

    @Test
    @DisplayName("正常系：既にソート済みの配列")
    void testAlreadySorted() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        assertArrayEquals(expected, BubbleSort.Solution(input));
    }

    @Test
    @DisplayName("正常系：逆順に並んでいる配列")
    void testReverseSorted() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };

        assertArrayEquals(expected, BubbleSort.Solution(input));
    }

    @Test
    @DisplayName("正常系：同じ値（重複）を含む配列")
    void testWithDuplicates() {
        int[] input = { 3, 1, 2, 1, 3 };
        int[] expected = { 1, 1, 2, 3, 3 };

        assertArrayEquals(expected, BubbleSort.Solution(input));
    }

    @Test
    @DisplayName("境界値：要素が1つだけの場合")
    void testSingleElement() {
        int[] input = { 10 };
        int[] expected = { 10 };

        assertArrayEquals(expected, BubbleSort.Solution(input));
    }

    @Test
    @DisplayName("境界値：空の配列の場合")
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};

        assertArrayEquals(expected, BubbleSort.Solution(input));
    }
}
