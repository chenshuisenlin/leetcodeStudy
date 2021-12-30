package com.dahuashejimoshi.d2_3__2_7;

public class CashRebate extends CashSuper {
    private double moneyRebate=1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
