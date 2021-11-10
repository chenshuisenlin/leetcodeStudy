package com.leetcode.study.Chuji;

import java.util.*;

public class C102 {
    /**
     * bfs 广度优先算法 注意层级打印关系
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root==null){
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int n=queue.size();
            List<Integer> list =new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(list);

        }
        return res;

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Stack<Stack<TreeNode>> zStack=new Stack<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        TreeNode node=root;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(node);
        zStack.push(stack);
        while (zStack!=null){
            stack=zStack.pop();
            node=stack.pop();
            while (node!=null||!stack.empty()){
                List<Integer> list=new ArrayList<>();
                list.add(node.val);
                res.add(list);
                Stack<TreeNode> stack2=new Stack<>();
                if(node.left!=null){
                    stack2.push(node.left);
                }
                if(node.right!=null){
                    stack2.push(node.right);
                }
                if (!stack2.empty()){
                    zStack.push(stack2);
                }
            }
        }
        return res;
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
