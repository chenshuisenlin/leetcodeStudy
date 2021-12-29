package com.design_pattern.structural_pattern.adapter_pattern.exp;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
