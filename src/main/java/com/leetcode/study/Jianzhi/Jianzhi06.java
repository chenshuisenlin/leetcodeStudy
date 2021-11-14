package com.leetcode.study.Jianzhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Jianzhi06 {

    public int[] reversePrint(ListNode head) {
        /*LinkedList<Integer> list=new LinkedList<>();*/
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while (head!=null){
            stack.push(head.val);
            i++;
            head=head.next;
        }
        int[] arr= new int[i];
        i=0;
        while (!stack.empty()){
            arr[i++]=stack.pop();
        }
        return arr;
    }
}

