package com.leetcode.study.Chuji;

public class C21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0),pre=res;
        while (l1!=null&&l2!=null){
            int val=0;
            if(l1.val<=l2.val){
                val=l1.val;
                l1=l1.next;
            }else{
                val=l2.val;
                l2=l2.next;
            }
            ListNode node=new ListNode(val);
            pre.next=node;
            pre=node;
        }
        pre.next=l1==null?l2:l1;
        return  res.next;

        /*//用时超过6% 内存76% 太屎了
        ListNode curl1=l1,curl2=l2;
        ListNode res=new ListNode(0),pre=res;
        while (curl1!=null||curl2!=null){
            if(curl1!=null&&curl2!=null){
                if(curl1.val<=curl2.val){
                    ListNode node=new ListNode(curl1.val);
                    pre.next=node;
                    curl1=curl1.next;
                    pre=node;
                }else{
                    ListNode node=new ListNode(curl2.val);
                    pre.next=node;
                    curl2=curl2.next;
                    pre=node;
                }
            }else if(curl1!=null&&curl2==null){
                ListNode node=new ListNode(curl1.val);
                pre.next=node;
                curl1=curl1.next;
                pre=node;
            }else if(curl1==null&&curl2!=null){
                ListNode node=new ListNode(curl2.val);
                pre.next=node;
                curl2=curl2.next;
                pre=node;
            }
        }
        return res.next;*/


    }
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
