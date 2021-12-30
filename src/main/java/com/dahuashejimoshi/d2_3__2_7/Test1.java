package com.dahuashejimoshi.d2_3__2_7;

public class Test1 {
    public static void main(String[] args) {
        CashSuper cs=CashFactory.createCashAccept("满减");
        double price=600d;
        double price2=500d;
        System.out.println("第一个价格为"+cs.acceptCash(price));
        System.out.println("第二个价格为"+cs.acceptCash(price2));
        cs=CashFactory.createCashAccept("正常");
        System.out.println("第一个价格为"+cs.acceptCash(price));
        System.out.println("第二个价格为"+cs.acceptCash(price2));
    }
}
