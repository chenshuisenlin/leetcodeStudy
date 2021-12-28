package com.design_pattern.creating_pattern.Builder;

public class ItemConcreteBuilder extends ItemBuilder {
    @Override
    public void buildNormal() {
        item.setItemName("普通商品");
        item.setType(1);
    }

    @Override
    public void buildCard() {
        item.setItemName("卡券商品");
        item.setType(2);
        item.setCode("1111");
    }

    @Override
    public void buildVideo() {
        item.setItemName("视频商品");
        item.setType(3);
        item.setUrl("www.dsadadsa.com");
    }
}
