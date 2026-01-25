package com.codeinterview.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveNthFromEndTest {

    @Test
    @DisplayName("基本ケース: [1,2,3,4,5], n=2 -> [1,2,3,5]")
    void testRemoveNth_Basic() {
        ListNode head = createList(new int[] { 1, 2, 3, 4, 5 });
        ListNode result = RemoveNthNode.solution(head, 2);
        assertListEquals(new int[] { 1, 2, 3, 5 }, result);
    }

    @Test
    @DisplayName("要素が1つのケース: [1], n=1 -> null")
    void testRemoveNth_Single() {
        ListNode head = new ListNode(1);
        ListNode result = RemoveNthNode.solution(head, 1);
        assertNull(result);
    }

    @Test
    @DisplayName("先頭を削除するケース: [1,2], n=2 -> [2]")
    void testRemoveNth_Head() {
        ListNode head = createList(new int[] { 1, 2 });
        // 注意: 提示されたコードだとここでエラーになる可能性があります
        ListNode result = RemoveNthNode.solution(head, 2);
        assertListEquals(new int[] { 2 }, result);
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
            assertNotNull(actual);
            assertEquals(val, actual.val);
            actual = actual.next;
        }
        assertNull(actual);
    }
}
