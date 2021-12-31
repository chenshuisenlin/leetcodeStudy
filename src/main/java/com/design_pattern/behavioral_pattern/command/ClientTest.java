package com.design_pattern.behavioral_pattern.command;

public class ClientTest {
    public static void main(String[] args) {
        Breakfast breakfast=new changfen();
        Waiter waiter = new Waiter();
        waiter.setChangfen(breakfast);
        waiter.chooseChangFen();
    }
}
