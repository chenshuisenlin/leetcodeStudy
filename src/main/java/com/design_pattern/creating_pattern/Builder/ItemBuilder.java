package com.design_pattern.creating_pattern.Builder;

public abstract class ItemBuilder {
    protected Item item=new Item();
    public abstract void buildNormal();
    public abstract void buildCard();
    public abstract void buildVideo();
    public Item getResult(){
        return item;
    }
}
