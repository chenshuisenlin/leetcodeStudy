package com.design_pattern.structural_pattern.composite_pattern;

import java.util.ArrayList;
//树枝构件：袋子
public class Bags implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<Articles>();
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }
    public Bags(String name) {
        this.name = name;
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
