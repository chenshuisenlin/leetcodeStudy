package com.design_pattern.creating_pattern.factory.AbstractFactory;

public interface IProductFactory {
    IPhoneProduct phoneProduct();
    iRouterProduct routerProduct();
}
