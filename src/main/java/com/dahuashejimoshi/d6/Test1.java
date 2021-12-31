package com.dahuashejimoshi.d6;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("张三");
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        tShirts.Decorate(person);
        bigTrouser.Decorate(tShirts);
        bigTrouser.show();
    }
}
