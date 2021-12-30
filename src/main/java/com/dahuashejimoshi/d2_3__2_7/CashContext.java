package com.dahuashejimoshi.d2_3__2_7;

public class CashContext {
    private CashSuper cs;

    public CashContext(String type) {
        switch (type){
            case "正常":
                cs=new CashNormal();
                break;
            case "满减":
                cs=new CashReturn(300d,100d);
                break;
            case "打8折":
                cs=new CashRebate(0.8d);
                break;
        }
    }
    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
