package com.design_pattern.creating_pattern.factory.AbstractFactory;

public class XiaoMiFactory implements  IProductFactory{
    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public iRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
