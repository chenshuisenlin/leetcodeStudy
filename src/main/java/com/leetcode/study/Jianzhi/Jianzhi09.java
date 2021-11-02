package com.leetcode.study.Jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Jianzhi09 {

}

class CQueue {
    LinkedList<Integer> A, B;

    public CQueue() {
        A=new LinkedList<>();
        B=new LinkedList<>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()){
            return B.removeLast();
        }
        if(A.isEmpty()){
            return -1;
        }
        while (!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
