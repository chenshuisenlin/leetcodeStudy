package com.leetcode.study.Chuji;

public class C112 {
    /**
     * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
     *
     * 叶子节点 是指没有子节点的节点。
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            if(root.val-targetSum==0){
                return true;
            }else{
                return false;
            }
        }
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
    }
    public boolean sum(TreeNode node ,int nums){
        if(node==null){
            return false;
        }
        if(node.left==null&&node.right==null){
            if(node.val-nums==0){
                return true;
            }else{
                return false;
            }
        }
        return sum(node.left,nums-node.val)||sum(node.right,nums-node.val);
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
