package com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.Cglib;

import com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.JDK.Cicada;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PrayingMantis implements MethodInterceptor {
    private Cicada cicada;
    public Cicada getInstance(Cicada cicada){
        this.cicada=cicada;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.cicada.getClass());
        enhancer.setCallback(this);
        return (Cicada) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object object=methodProxy.invokeSuper(o,objects);
        secondaryMain();
        return object;
    }
    private void secondaryMain(){
        System.out.println("螳螂捕蝉");
    }

    public static void main(String[] args) {
        PrayingMantis prayingMantis = new PrayingMantis();
        Cicada instance = prayingMantis.getInstance(new Cicada());
        instance.mainService();
    }
}
