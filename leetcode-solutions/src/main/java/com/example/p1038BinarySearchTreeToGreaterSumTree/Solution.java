package com.example.p1038BinarySearchTreeToGreaterSumTree;

public class Solution {
    private int carryOver;

    public TreeNode bstToGst(TreeNode root) {
        carryOver = 0;
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.right);
        root.val = carryOver = root.val + carryOver;
        dfs(root.left);
    }
}