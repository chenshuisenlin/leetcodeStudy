package com.design_pattern.structural_pattern.flyweight_pattern.example1;

import lombok.Data;

@Data
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}
