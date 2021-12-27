package com.design_pattern.creating_pattern.prototype;

public class Prototype implements Cloneable {
    public Prototype(){

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

}
