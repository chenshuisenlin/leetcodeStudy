package com.leetcode.study.Chuji;

import java.util.*;

public class C141 {
    public boolean hasCycle(ListNode head) {
    //3>2>0>4>2>0>4
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

        /*set方法 性能不理想
        Set<ListNode> set =new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return  false;*/
        /*自己写的狗屎
        LinkedList<ListNode> list =new LinkedList<>();
        int i=0;
        while (!list.contains(head)&&head!=null){
            list.add(i,head);
            i++;
            head=head.next;
        }
        if(head!=null){
            return true;
        }else{
            return false;
        }*/

/*        HashMap<ListNode,Integer> map =new HashMap<>();
        while(head!=null&&!map.containsKey(head)){
            map.put(head,head.val);
            head=head.next;
        }
        if(head!=null){
            return true;
        }else{
            return false;
        }*/
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

