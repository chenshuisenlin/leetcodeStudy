package com.design_pattern.creating_pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

public class Test2 {
    /*
    通过序列化实现深克隆
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address2 address2 = new Address2("中国", "广东", "佛山");
        Customer2 customer2 = new Customer2("王五", address2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(customer2);//序列化
        ByteArrayInputStream bi = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Customer2 clone = (Customer2)oi.readObject();
        clone.setName("李四");
        System.out.println(customer2.toString());
        System.out.println(clone.toString());
        customer2.address.setCity("中山");
        System.out.println(customer2.toString());
        System.out.println(clone.toString());
    }
}
@Data
@AllArgsConstructor
class Address2 implements Serializable{

    private static final long serialVersionUID = -7111606398489218059L;
    private String country;
    private String province;
    private String city;
}
@AllArgsConstructor
@Data
class Customer2 implements Serializable{
    private static final long serialVersionUID = 8926221298920753392L;
    private String name;
    public Address2 address;
}
