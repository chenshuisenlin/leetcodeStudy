package com.design_pattern.creating_pattern.Builder;

import lombok.Data;

@Data
public class CopyItem {
    private String name;
    private Long stock;
    private CopyItem(ItemBuilder builder){
        this.name=builder.name;
        this.stock=builder.stock;
    }
    public static class ItemBuilder{
        private static final Long DEFAULT_STOCK =0L;
        private String name;
        private Long stock =DEFAULT_STOCK;
        public CopyItem build(){
            return new CopyItem(this);
        }
        public ItemBuilder setName(String name){
            if(name==null||name.equals("")){
                throw new IllegalArgumentException("……");
            }
            this.name=name;
            return this;
        }
        public ItemBuilder setStock(Long stock){
            if(stock>999999999L){
                throw new IllegalArgumentException("库存数量错误");
            }
            this.stock=stock;
            return this;
        }
    }
/*
我们在内部创建了一个ItemBuilder，来处理我们的校验逻辑。当然我们使用普通的get，set方式其实也是可以实现的。

看到这里可能有人会问这个与我们使用get或者set方法又有什么区别呢？

解释：主要是为了解决我们的赋值处于一种无效状态

无效状态指的是对象属性之间存在依赖关系，合法校验等，如果使用set方式会导致这种关系和校验得不到验证，所有可能会存在无效的状态，即A、B两个属性必须同时设置，缺一不可，然后set方法可能导致遗漏等
 */
    public static void main(String[] args) {
        //测试
        CopyItem copyItem=new CopyItem.ItemBuilder().setName("copy1").build();
        System.out.println(copyItem);
        CopyItem copyItem1=new CopyItem.ItemBuilder().setStock(9999999999999999L).build();
        System.out.println(copyItem1);
    }
}
