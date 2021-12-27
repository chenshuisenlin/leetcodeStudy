package com.design_pattern.creating_pattern.factory.FactoryMethod;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory af= new ConcreteFactory2();
        Product p1=af.newProduct();

    }
}
