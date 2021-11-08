package com.leetcode.study.Chuji;

import java.util.Stack;

public class C232 {
    class MyQueue {
        Stack<Integer> A;
        Stack<Integer> B;

        public MyQueue() {
            A=new Stack<>();
            B=new Stack<>();
        }

        public void push(int x) {
            A.push(x);
        }

        public int pop() {
            while (!A.empty()){
                B.push(A.pop());
            }
            int x=B.pop();
            while (!B.empty()){
                A.push(B.pop());
            }
            return x;
        }

        public int peek() {
            while (!A.empty()){
                B.push(A.pop());
            }
            int x=B.peek();
            while (!B.empty()){
                A.push(B.pop());
            }
            return x;
        }

        public boolean empty() {
            return A.empty();
        }
    }
}
