package com.leetcode.study.Chuji;

public class C203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res=new ListNode(0),pre=res;
        while (head!=null){
            if(head.val==val){
                head=head.next;
            }else{
                if(head!=null){
                    ListNode node=new ListNode(head.val);
                    pre.next=node;
                    pre=node;
                }else{

                    break;
                }
                head=head.next;
            }
        }
        pre.next=null;
        return  res.next;

    }

    class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
