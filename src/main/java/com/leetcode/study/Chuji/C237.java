package com.leetcode.study.Chuji;

public class C237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
