package com.leetcode.study.Jianzhi;

import java.util.HashMap;
import java.util.LinkedList;

public class Jianzhi35 {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node cur = head;
        // 1. 复制各节点，并构建拼接链表
        while(cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        // 2. 构建各新节点的 random 指向
        cur = head;
        while(cur != null) {
            if(cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        // 3. 拆分两链表
        cur = head.next;
        Node pre = head, res = head.next;
        while(cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; // 单独处理原链表尾节点
        return res;      // 返回新链表头节点

        /*//时间复杂度 O(N)O(N) ： 两轮遍历链表，使用 O(N)O(N) 时间。
        //空间复杂度 O(N)O(N) ： 哈希表 dic 使用线性大小的额外空
        if(head==null){
            return null;
        }
        Node cur = head;
        HashMap<Node,Node> map=new HashMap<>();
        while (cur!=null){
            Node node =new Node(cur.val);
            //node.next=cur.next;
            map.put(cur, node);
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);*/
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
