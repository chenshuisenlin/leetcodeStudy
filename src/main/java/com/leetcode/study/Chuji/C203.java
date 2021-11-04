package com.leetcode.study.Chuji;

public class C203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur =new ListNode(0),pre=cur;
        //cur.next=head;
        while (head!=null){
            if(head.val==val){
                head=head.next;
            }
            ListNode node=new ListNode(head.val);
            pre.next=node;
            pre=node;
        }
        return cur;

    }
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
