package com.design_pattern.structural_pattern.adapter_pattern.objectadapter;

import com.design_pattern.structural_pattern.adapter_pattern.classadapter.Adaptee;
import com.design_pattern.structural_pattern.adapter_pattern.classadapter.Target;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试");
        Adaptee adaptee = new Adaptee();
        Target target=new ObjectAdapter(adaptee);
        target.request();
    }
}
