package com.design_pattern.creating_pattern.singleton;

import com.design_pattern.creating_pattern.prototype.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*LazySingleton instance = LazySingleton.getInstance();
        instance.setName("张三");
        instance.tellName();
        LazySingleton instance1 = LazySingleton.getInstance();
        instance1.tellName();*/
        LazySingleton instance = LazySingleton.getInstance();
        instance.setName("张三");
        instance.tellName();
     

    }
}
