package com.design_pattern.structural_pattern.decorator_pattern;

public class CarType extends ChangeType {

    public CarType(BumbleBee bumbleBee) {
        super(bumbleBee);
    }
    @Override
    public void transformance(){
        setChangeType();
        super.transformance();
    }
    public void setChangeType(){
        ((OriginalType)super.bumbleBee).setType("车形态");
    }
}
