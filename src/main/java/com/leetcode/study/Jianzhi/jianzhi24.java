package com.leetcode.study.Jianzhi;

import java.util.Stack;

public class jianzhi24 {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        Stack<Integer> stack=new Stack<>();
        ListNode node =head;
        while (node!=null){
            stack.push(node.val);
            node=node.next;
        }
        node =head;
        while (!stack.empty()){
            ListNode newnode=new ListNode(stack.pop());
            head.next=newnode;
            head=head.next;
        }
        return node.next;
    }
}
