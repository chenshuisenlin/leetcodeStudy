package com.leetcode.study.Jianzhi;

import java.util.LinkedList;

public class Jianzhi35 {
    public Node copyRandomList(Node head) {
        Node res = null;
        Node cur = null;
        Node temp=head;
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> listR=new LinkedList<>();
        while(temp!=null){
            list.addLast(temp.val);
            listR.addLast(temp.random.val);
            temp=temp.next;

        }
        while (!list.isEmpty()){
            cur.val=list.removeLast();
            cur.next=res;
            res=cur;
        }
        while (!listR.isEmpty()){
            int target=listR.getFirst();
            
        }
        return res;
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}