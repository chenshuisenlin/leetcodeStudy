package com.design_pattern.creating_pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Test {
    /*
    浅克隆测试案例
     */
    public static void main(String[] args) {
        Address address = new Address("中国", "广东", "佛山");
        Customer customer = new Customer("张三", address);
        Customer clone = customer.clone();
        clone.setName("李四");
        System.out.println(customer.toString());
        System.out.println(clone.toString());
        customer.address.setCity("中山");
        System.out.println(customer.toString());
        System.out.println(clone.toString());
    }

}
@Data
@AllArgsConstructor
class Address{
    private String country;
    private String province;
    private String city;

}
@Data
@AllArgsConstructor
class Customer implements Cloneable{
    private String name;
    public Address address;

    @Override
    public Customer clone(){
        Customer customer=null;
        try {
            customer = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
