package com.design_pattern.structural_pattern.bridg_pattern;

public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor()+"Wallet";
    }
}
