package com.leetcode.study.Chuji;

public class C104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return depth(root,0);
    }
    public int depth(TreeNode node ,int length){
        if(node==null){
            return length;
        }
        return Math.max(depth(node.left,length+1),depth(node.right,length+1));
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
