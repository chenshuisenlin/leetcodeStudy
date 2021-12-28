package com.design_pattern.structural_pattern.Proxy_pattern.dynamic_proxy.JDK;

public class Cicada implements BaseService{
    @Override
    public void mainService() {
        System.out.println("禅开始鸣叫（会被螳螂听到）");
    }
}
