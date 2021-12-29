package com.design_pattern.structural_pattern.bridg_pattern;

public class HandBag extends Bag{
    @Override
    public String getName() {
        return color.getColor()+"HandBag";
    }
}
