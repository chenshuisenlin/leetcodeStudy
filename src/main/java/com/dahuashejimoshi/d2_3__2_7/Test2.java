package com.dahuashejimoshi.d2_3__2_7;

public class Test2 {
    public static void main(String[] args) {
        CashContext cc=null;
        /*cc=new CashContext(new CashNormal());
        double res =cc.GetResult(200d);
        System.out.println(res);
        cc=new CashContext(new CashRebate(0.8d));
        System.out.println(cc.GetResult(123d));*/
        cc=new CashContext("正常");
        System.out.println(cc.GetResult(11d));
    }
}
