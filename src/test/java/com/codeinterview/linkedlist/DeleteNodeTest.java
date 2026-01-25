package com.codeinterview.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeleteNodeTest {

    @Test
    @DisplayName("基本ケース: [4, 5, 1, 9] から 5 を削除")
    void testDeleteNode_Case1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // 削除対象ノード (値が5のノード)
        ListNode nodeToDelete = head.next;

        DeleteNode.solution(nodeToDelete);

        // 結果の検証: 4 -> 1 -> 9
        assertEquals(4, head.val);
        assertEquals(1, head.next.val);
        assertEquals(9, head.next.next.val);
        assertNull(head.next.next.next);
    }

    @Test
    @DisplayName("基本ケース: [4, 5, 1, 9] から 1 を削除")
    void testDeleteNode_Case2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNode nodeToDelete = head.next.next;

        DeleteNode.solution(nodeToDelete);

        // 結果の検証: 4 -> 5 -> 9
        assertEquals(4, head.val);
        assertEquals(5, head.next.val);
        assertEquals(9, head.next.next.val);
        assertNull(head.next.next.next);
    }
}
