package com.leetcode.study.Chuji;

public class C83 {
    //删除链表重复元素 保证只出现一次  链表为升序链表
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list=head;
        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return list;
        /*内存占用更小一点的写法
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;*/
    }
    class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
