package com.leetcode.study.Chuji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class C145 {
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(res);
        return res;

    }
    /**
     * 二叉树后续遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        postorder(node.left,list);
        postorder(node.right,list);
        list.add(node.val);
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
