package com.design_pattern.creating_pattern.Builder;

public class ItemDirector {
    private ItemBuilder itemBuilder;
    public  ItemDirector (ItemBuilder itemBuilder){
        this.itemBuilder=itemBuilder;
    }
    public Item normalConstruct(){
        itemBuilder.buildNormal();
        return itemBuilder.getResult();
    }
    public Item cardConstruct(){
        itemBuilder.buildCard();
        return itemBuilder.getResult();
    }
    public Item videoConstruct(){
        itemBuilder.buildVideo();
        return itemBuilder.getResult();
    }
}
