package com.codeinterview.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseListTest {

    @Test
    @DisplayName("基本ケース: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]")
    void testReverse_Basic() {
        ListNode head = createList(new int[] { 1, 2, 3, 4, 5 });
        ListNode result = Reverse.solution(head);
        assertListEquals(new int[] { 5, 4, 3, 2, 1 }, result);
    }

    @Test
    @DisplayName("要素が1つのケース: [1] -> [1]")
    void testReverse_Single() {
        ListNode head = new ListNode(1);
        ListNode result = Reverse.solution(head);
        assertListEquals(new int[] { 1 }, result);
    }

    @Test
    @DisplayName("エッジケース: 空のリスト -> null")
    void testReverse_Empty() {
        ListNode result = Reverse.solution(null);
        assertNull(result);
    }

    // --- ヘルパーメソッド ---
    private ListNode createList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private void assertListEquals(int[] expected, ListNode actual) {
        for (int val : expected) {
            assertNotNull(actual, "リストが期待より短いです");
            assertEquals(val, actual.val);
            actual = actual.next;
        }
        assertNull(actual, "リストが期待より長いです");
    }
}
