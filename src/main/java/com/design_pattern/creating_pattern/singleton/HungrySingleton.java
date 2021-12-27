package com.design_pattern.creating_pattern.singleton;

public class HungrySingleton {
    private static  HungrySingleton instance=new HungrySingleton();//
    private HungrySingleton(){} //private避免类在外部被实例化

    public static HungrySingleton getInstance(){
        return instance;
    }
}
