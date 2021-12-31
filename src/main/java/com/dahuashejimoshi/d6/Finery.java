package com.dahuashejimoshi.d6;

public class Finery extends Person {
    protected Person person;

    public void Decorate(Person person){
        this.person=person;
    }
    @Override
    public void show(){
        if(person!=null){
            person.show();
        }
    }
}
