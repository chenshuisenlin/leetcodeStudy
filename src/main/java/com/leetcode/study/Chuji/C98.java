package com.leetcode.study.Chuji;

import java.util.ArrayList;
import java.util.List;

public class C98 {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 访问左子树
        if (!isValidBST(root.left)) {
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        // 访问右子树
        return isValidBST(root.right);
    }

    /**
     * 想到了中序遍历能得出结果 但是没有想好怎么记录前一个节点的值
     *
     * @param list
     * @param root
     * @return
     */
    public boolean panduan (List<Integer> list , TreeNode root){
        int index=list.lastIndexOf(root.val);
        if(index==0||index==list.size()-1){
            return true;
        }
        for(int i=0;i<list.size();i++){
            if(i<index&&list.get(i)>=root.val){
                return false;
            }
            if(i>index&&list.get(i)<=root.val){
                return false;
            }
        }
        return panduan(list.subList(0,index-1),root.left)&&panduan(list.subList(index+1,list.size()-1),root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

}
