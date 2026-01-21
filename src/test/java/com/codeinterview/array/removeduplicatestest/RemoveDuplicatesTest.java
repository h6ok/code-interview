package com.codeinterview.array.removeduplicatestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codeinterview.array.removeduplicates.RemoveDuplicates;

class RemoveDuplicatesTest {

    @Test
    @DisplayName("基本ケース1: [1, 1, 2] -> k=2, nums=[1, 2, ...]")
    void testRemoveDuplicates_Basic1() {
        int[] nums = { 1, 1, 2 };
        int[] expectedNums = { 1, 2 };

        int k = RemoveDuplicates.Solution(nums);

        assertEquals(expectedNums.length, k, "返り値 k が正しくありません");
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i], i + "番目の要素が一致しません");
        }
    }

    @Test
    @DisplayName("基本ケース2: 重複が多い場合")
    void testRemoveDuplicates_Basic2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] expectedNums = { 0, 1, 2, 3, 4 };

        int k = RemoveDuplicates.Solution(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    @DisplayName("エッジケース: 要素が1つだけの場合")
    void testRemoveDuplicates_SingleElement() {
        int[] nums = { 1 };

        int k = RemoveDuplicates.Solution(nums);

        assertEquals(1, k);
        assertEquals(1, nums[0]);
    }

    @Test
    @DisplayName("エッジケース: すべて同じ要素の場合")
    void testRemoveDuplicates_AllSame() {
        int[] nums = { 1, 1, 1, 1 };

        int k = RemoveDuplicates.Solution(nums);

        assertEquals(1, k);
        assertEquals(1, nums[0]);
    }

    @Test
    @DisplayName("エッジケース: すべて異なる要素の場合")
    void testRemoveDuplicates_AllUnique() {
        int[] nums = { 1, 2, 3 };
        int[] expectedNums = { 1, 2, 3 };

        int k = RemoveDuplicates.Solution(nums);

        assertEquals(3, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
