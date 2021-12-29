package com.design_pattern.structural_pattern.decorator_pattern.exp1;

public class IPhone extends Phone {
    Phone phone;

    public IPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void function(){
        phone.function();
    }
    public void newfunc(){
        System.out.println("上网");
    }
}
