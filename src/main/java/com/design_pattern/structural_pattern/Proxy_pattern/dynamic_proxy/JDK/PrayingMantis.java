package com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PrayingMantis implements InvocationHandler {
    private BaseService baseService;
    public PrayingMantis(BaseService baseService){
        this.baseService=baseService;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(baseService,args);
        secondaryMain();
        return null;
    }
    private void secondaryMain(){
        System.out.println("螳螂捕蝉");
    }
}
