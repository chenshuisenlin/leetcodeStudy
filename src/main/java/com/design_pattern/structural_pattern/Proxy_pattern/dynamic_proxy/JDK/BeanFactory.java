package com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class BeanFactory {
    public static BaseService newInstanc(Class classFile){
        BaseService trueCicada= new Cicada();
        InvocationHandler prayingMantis = new PrayingMantis(trueCicada);
        Class classArray[]={BaseService.class};
        BaseService baseService=(BaseService) Proxy.newProxyInstance(classFile.getClassLoader(),classArray,prayingMantis);

        Cardinal cardinal = new Cardinal(baseService);
        BaseService secondBaseService=(BaseService) Proxy.newProxyInstance(classFile.getClassLoader(),classArray,cardinal);

        return secondBaseService;
    }

    public static void main(String[] args) {
        BaseService baseService=newInstanc(Cicada.class);
        baseService.mainService();
    }
}
