package com.leetcode.study.Chuji;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C235 {
    Queue<TreeNode> queue1=new LinkedList<>();
    Queue<TreeNode> queue2=new LinkedList<>();

    /**
     * 绝绝子方法 ，递归判断是否在左右子树  如果分别在左子树右子数 直接返回 绝了
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        //如果小于等于0，说明p和q位于root的两侧，直接返回即可
        if ((root.val - p.val) * (root.val - q.val) <= 0){
            return root;
        }

        //否则，p和q位于root的同一侧，就继续往下找
        return lowestCommonAncestor2(p.val < root.val ? root.left : root.right, p, q);
    }
    /**
     * 自己写的 比较笨 先拿到遍历到目标节点的两个路径 然后比较路劲上最后一个相同的路径返回
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        find(root,p,queue1);
        find(root,q,queue2);
        TreeNode node =root;
        while (!queue1.isEmpty()||!queue2.isEmpty()){
            if(queue1.peek()!=queue2.peek()){
                return node;
            }else{
                node=queue1.remove();
                queue2.remove();
            }

        }
        return root;
    }
    public void find(TreeNode node,TreeNode p,Queue<TreeNode> queue){
        if(node==null){
            return;
        }
        queue.add(node);
        if(p.val<node.val){
            find(node.left,p,queue);
        }
        if(p.val>node.val){
            find(node.right,p,queue);
        }
        if(p.val==node.val){
            return;
        }
    }
}
