package com.design_pattern.creating_pattern.factory.AbstractFactory;

public class XiaomiPhone implements IPhoneProduct {
    @Override
    public void call() {
        System.out.println("小米手机在发热……");
    }
}
