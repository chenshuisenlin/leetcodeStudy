package com.design_pattern.structural_pattern.bridg_pattern;

public class ClientTest {
    /*
    JDBC中使用
     */
    public static void main(String[] args) {
        Color color=new Yellow();
        Bag bag=new Wallet();
        bag.setColor(color);
        System.out.println(bag.getName());

    }
}
