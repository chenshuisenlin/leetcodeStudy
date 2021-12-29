package com.design_pattern.structural_pattern.adapter_pattern.classadapter;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificResquest();
    }
}
