package com.leetcode.study.Jianzhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class jianzhi07 {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++)
        {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
    TreeNode recur(int root, int left, int right) {
        if(left > right) {
            return null;                          // 递归终止
        }
        TreeNode node = new TreeNode(preorder[root]);          // 建立根节点
        int i = dic.get(preorder[root]);                       // 划分根节点、左子树、右子树
        node.left = recur(root + 1, left, i - 1);              // 开启左子树递归
        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
        return node;                                           // 回溯返回根节点
    }


    /**
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        int val=preorder[0];
        TreeNode node=new TreeNode();
        node.val=val;
        if(preorder.length==1){
            return node;
        }
        int i=0;
        while (inorder[i]!=val) {
            i++;
        }
        int[] linorder=Arrays.copyOfRange(inorder,0,i);
        System.out.println(Arrays.toString(linorder));
        int[] rinorder=Arrays.copyOfRange(inorder,i+1,inorder.length);
        System.out.println(Arrays.toString(rinorder));
        int[] lpreorder=Arrays.copyOfRange(preorder,1,linorder.length+1);
        System.out.println(Arrays.toString(lpreorder));
        int[] rpreorder=Arrays.copyOfRange(preorder,1+lpreorder.length,preorder.length);
        System.out.println(Arrays.toString(rpreorder));
        node.left=buildTree2(lpreorder,linorder);
        node.right=buildTree2(rpreorder,rinorder);
        return node;
    }

}
