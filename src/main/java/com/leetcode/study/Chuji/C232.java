package com.leetcode.study.Chuji;

import java.util.Stack;

public class C232 {
    class MyQueue {
        Stack<Integer> a ;
        Stack<Integer> b ;

        public MyQueue() {
            a=new Stack<>();
            b=new Stack<>();
        }

        public void push(int x) {
            a.push(x);
            b.push(a.peek());
        }

        public int pop() {
            return b.pop();
        }

        public int peek() {
            return b.peek();
        }

        public boolean empty() {
            return b.empty();
        }
    }
}
