package com.leetcode.study.Chuji;

public class C226 {
    /**
     * 翻转二叉树
     *     4                            4
     *    /   \
     *   2     7                    7       2
     *  / \   / \
     * 1   3 6   9
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        copy(root);
        return root;
    }
    public void copy(TreeNode node ){
        if(node==null){
            return;
        }
        TreeNode temp=new TreeNode();
        temp=node.left;
        node.left=node.right;
        node.right=temp;
        copy(node.left);
        copy(node.right);
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
