package com.design_pattern.structural_pattern.decorator_pattern;

public class OriginalType implements BumbleBee {
    private String type="大黄蜂原型状态";
    public void setType(String type){
        this.type=type;
    }
    @Override
    public void transformance() {
        System.out.println(type);
    }
}
