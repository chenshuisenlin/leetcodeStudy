package com.design_pattern.creating_pattern.factory.FactoryMethod;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("工厂1生产->产品1……");
        return new ConcreteProduct1();
    }
}
