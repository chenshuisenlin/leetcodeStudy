package com.design_pattern.creating_pattern.factory.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        IProductFactory xiaomifa=new XiaoMiFactory();
        IPhoneProduct xiaomi11= xiaomifa.phoneProduct();
        xiaomi11.call();
    }
}
