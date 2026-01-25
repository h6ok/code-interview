package com.codeinterview.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthTest {

    @Test
    @DisplayName("基本ケース: [3, 9, 20, null, null, 15, 7] -> 3")
    void testMaxDepth_Basic() {
        // 3
        // / \
        // 9 20
        // / \
        // 15 7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        assertEquals(3, MaximumDepth.solution(root));
    }

    @Test
    @DisplayName("要素が1つのケース: [1] -> 1")
    void testMaxDepth_Single() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, MaximumDepth.solution(root));
    }

    @Test
    @DisplayName("空の木: null -> 0")
    void testMaxDepth_Empty() {
        assertEquals(0, MaximumDepth.solution(null));
    }

    @Test
    @DisplayName("偏った木 (Skewed Tree): 1 -> 2 -> 3 -> 4 -> 4")
    void testMaxDepth_Skewed() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        assertEquals(4, MaximumDepth.solution(root));
    }
}
