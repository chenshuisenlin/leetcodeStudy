package com.design_pattern.structural_pattern.bridg_pattern;

abstract class Bag {
    protected Color color;
    public void setColor(Color color){
        this.color=color;
    }
    public abstract String getName();
}
