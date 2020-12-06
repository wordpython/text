package com.wordpython.nowcoder;
/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

/**
 * 题目描述
 * 求给定二叉树的最大深度，
 * 最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。
 */
public class AQ二叉树的最大深度 {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        if(root==null) return 0;
        return maxDepth(root.left)>maxDepth(root.right)?
                maxDepth(root.left)+1:maxDepth(root.right)+1;
    }
    public int maxDepth1 (TreeNode root) {
        if(root == null)return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
