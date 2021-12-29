package com.design_pattern.structural_pattern.adapter_pattern.objectadapter;

import com.design_pattern.structural_pattern.adapter_pattern.classadapter.Adaptee;
import com.design_pattern.structural_pattern.adapter_pattern.classadapter.Target;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void request() {
        adaptee.specificResquest();
    }
}
