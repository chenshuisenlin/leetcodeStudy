package com.leetcode.study.zhongdeng;

import java.util.ArrayList;
import java.util.List;

public class C230 {
    /**
     * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
     *
     *  
     *
     * 示例 1：
     *
     *
     * 输入：root = [3,1,4,null,2], k = 1
     * 输出：1
     * @param args
     */
    public static void main(String[] args) {

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
    }
    public void inorder(TreeNode node, List<Integer> list){
        if(node==null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
