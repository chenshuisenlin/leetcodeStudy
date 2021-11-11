package com.leetcode.study.Chuji;

public class C701 {
    public TreeNode insertIntoBST2(TreeNode root, int val) {


        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root,val);
        return root;
    }
    public void insert(TreeNode node,int val){
        if(node.val>val){
            if(node.left!=null){
                insert(node.left,val);
            }else{
                TreeNode nnode=new TreeNode();
                nnode.val=val;
                node.left=nnode;
                return;
            }
        }else{
            if(node.right!=null){
                insert(node.right,val);
            }else{
                TreeNode nnode=new TreeNode();
                nnode.val=val;
                node.right=nnode;
                return;
            }
        }

    }

}
