package com.JUC.base;

/**
 * 继承Thread，重写run方法继承Thread，重写run方法
 */
public class MyThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        MyThread01 myThread02 = new MyThread01();
        myThread01.start();
        myThread02.start();
    }
}
