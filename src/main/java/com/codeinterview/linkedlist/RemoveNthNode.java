package com.codeinterview.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNode {

    public static ListNode solution(ListNode head, int n) {
        Map<Integer, ListNode> nodeMap = new HashMap<>();

        int length = 1;
        ListNode node = head;

        while (node.next != null) {
            nodeMap.put(length, node);
            node = node.next;
            length++;
        }
        nodeMap.put(length, node);

        if (length == 1) {
            return null;
        }

        int index = length - n + 1;
        int prevIndex = length - n;

        if (nodeMap.get(prevIndex) == null) {
            head = nodeMap.get(index).next;
            return head;
        }

        nodeMap.get(prevIndex).next = nodeMap.get(index).next;
        return head;
    }
}
