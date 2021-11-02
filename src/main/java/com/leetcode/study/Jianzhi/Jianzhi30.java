package com.leetcode.study.Jianzhi;

import java.util.LinkedList;

public class Jianzhi30 {
}

class MinStack {
    LinkedList<Integer> A;
    LinkedList<Integer> minnum;
    /** initialize your data structure here. */
    public MinStack() {
        A=new LinkedList<>();
        minnum=new LinkedList<>();
        //minnum=0;
    }

    public void push(int x) {
        if(A.isEmpty()){
            minnum.addLast(x);
        }else{
            int last=minnum.getLast();
            //注意多个相同最小值，防止一次弹出最小值之后最小栈为空
            if(x<=last){
                minnum.addLast(x);
            }
        }
        A.addLast(x);
    }

    public void pop() {
        int re=A.removeLast();
        if(minnum.getLast()==re){
            minnum.removeLast();
        }
    }

    public int top() {
        return A.getLast();
    }

    public int min() {
        return minnum.getLast();
    }
    /**
     * Stack<Integer> A, B;
     *     public MinStack() {
     *         A = new Stack<>();
     *         B = new Stack<>();
     *     }
     *     public void push(int x) {
     *         A.add(x);
     *         if(B.empty() || B.peek() >= x)
     *             B.add(x);
     *     }
     *     public void pop() {
     *         if(A.pop().equals(B.peek()))
     *             B.pop();
     *     }
     *     public int top() {
     *         return A.peek();
     *     }
     *     public int min() {
     *         return B.peek();
     *     }
     *
     */
}
