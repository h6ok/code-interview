package com.codeinterview.linkedlist;

/**
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 */
public class RemoveNthNode {

    public static ListNode solution(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }
}
