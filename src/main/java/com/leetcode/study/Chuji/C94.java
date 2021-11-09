package com.leetcode.study.Chuji;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class C94 {
    /**二叉树 中序遍历
     * 左 中 右
     * 迭代方法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        TreeNode node=root;
        while (node!=null||!stack.empty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node=stack.pop();
                list.add(node.val);
                node=node.right;
            }
        }
        return list;
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        inorder(node.right,list);
        list.add(node.val);
        inorder(node.left,list);
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
