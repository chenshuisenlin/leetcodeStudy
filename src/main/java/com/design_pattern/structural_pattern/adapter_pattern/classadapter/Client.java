package com.design_pattern.structural_pattern.adapter_pattern.classadapter;

public class Client {
    /*
    Spring中的AOP中AdvisorAdapter类，它有三个实现：MethodBeforAdviceAdapter、AfterReturnningAdviceAdapter、ThrowsAdviceAdapter。
     */
    public static void main(String[] args) {
        System.out.println("类适配器模式测试");
        Target target=new ClassAdapter();
        target.request();
    }
}
