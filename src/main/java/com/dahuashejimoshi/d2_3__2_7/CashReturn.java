package com.dahuashejimoshi.d2_3__2_7;

public class CashReturn extends CashSuper {
    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double res=money;
        if(money>=moneyCondition){
            res=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return res;
    }
}
