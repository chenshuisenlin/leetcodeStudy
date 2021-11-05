package com.leetcode.study.Chuji;

public class C206 {
    public ListNode reverseList(ListNode head) {
        ListNode list= null;
        while (head!=null){
            ListNode node=new ListNode(head.val);
            node.next=list;
            head=head.next;
            list=node;
        }
        return list;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
