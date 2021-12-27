package com.design_pattern.creating_pattern.factory.FactoryMethod;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("工厂2生产->产品2……");
        return new ConcreteProduct2();
    }
}
