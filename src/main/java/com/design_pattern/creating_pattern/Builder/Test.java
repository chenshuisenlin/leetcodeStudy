package com.design_pattern.creating_pattern.Builder;

public class Test {
    public static void main(String[] args) {
        ItemBuilder builder=new ItemConcreteBuilder();
        ItemDirector director=new ItemDirector(builder);
        Item item = director.normalConstruct();
        System.out.println(item);

        //剔除导演类
        ItemBuilder builder1=new ItemConcreteBuilder();
        builder1.buildVideo();
        Item result = builder1.getResult();
        System.out.println(result);
    }
}
