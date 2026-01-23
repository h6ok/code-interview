package com.codeinterview.string;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    @DisplayName("基本ケース: 奇数文字数 ['h','e','l','l','o']")
    void testReverse_OddLength() {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        char[] expected = { 'o', 'l', 'l', 'e', 'h' };

        ReverseString.Solution(s);

        assertArrayEquals(expected, s, "文字列が正しく反転されていません");
    }

    @Test
    @DisplayName("基本ケース: 偶数文字数 ['H','a','n','n','a','h']")
    void testReverse_EvenLength() {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        char[] expected = { 'h', 'a', 'n', 'n', 'a', 'H' };

        ReverseString.Solution(s);

        assertArrayEquals(expected, s);
    }

    @Test
    @DisplayName("エッジケース: 要素が1つだけ")
    void testReverse_SingleChar() {
        char[] s = { 'a' };
        char[] expected = { 'a' };

        ReverseString.Solution(s);

        assertArrayEquals(expected, s);
    }

    @Test
    @DisplayName("エッジケース: 空の配列")
    void testReverse_Empty() {
        char[] s = {};
        char[] expected = {};

        ReverseString.Solution(s);

        assertArrayEquals(expected, s);
    }

    @Test
    @DisplayName("回文（Palindrome）のケース: 反転しても変わらない")
    void testReverse_Palindrome() {
        char[] s = { 'r', 'a', 'c', 'e', 'c', 'a', 'r' };
        char[] expected = { 'r', 'a', 'c', 'e', 'c', 'a', 'r' };

        ReverseString.Solution(s);

        assertArrayEquals(expected, s);
    }
}
