package com.leetcode.study.Chuji;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class C653 {
    /**
     * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     *
     *
     * @param root
     * @param k
     * @return
     */

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set=new HashSet<>();
        return inorder(root,k,set);
    }
    public boolean inorder(TreeNode node, int k, HashSet<Integer> set){
        if(node==null){
            return false;
        }
        if(set.contains(k-node.val)){
            return true;
        }
        set.add(node.val);
        return inorder(node.left,k,set)||inorder(node.right,k,set);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
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
}
