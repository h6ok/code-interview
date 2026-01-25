package com.codeinterview.trees;

/**
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 */
public class MaximumDepth {

    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = helper(root, 1);

        return depth;
    }

    private static int helper(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return depth;
        }

        int leftDepth = node.left != null ? helper(node.left, depth + 1) : depth;
        int rightDepth = node.right != null ? helper(node.right, depth + 1) : depth;

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
