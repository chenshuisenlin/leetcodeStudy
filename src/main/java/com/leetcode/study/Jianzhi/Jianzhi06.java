package com.leetcode.study.Jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Jianzhi06 {

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> list=new LinkedList<>();
        while (head.next!=null){
            list.addLast(head.val);
            //list.addFirst(head.val);
            head=head.next;
        }
        int[] arr= new int[list.size()];

        for(int i =0;i<arr.length;i++){
            arr[i]=list.removeLast();
        }
        return arr;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
