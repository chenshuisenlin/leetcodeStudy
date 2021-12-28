package com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Cardinal implements InvocationHandler {
    private Object proxyone;
    public Cardinal(Object proxyone){
        this.proxyone=proxyone;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxyone,args);
        secondaryMain();
        return null;
    }
    private void secondaryMain(){
        System.out.println("黄雀在后");
    }
}
