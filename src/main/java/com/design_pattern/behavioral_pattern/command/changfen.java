package com.design_pattern.behavioral_pattern.command;

public class changfen implements Breakfast {
    private ChangFenChef receiver;

     changfen() {
         receiver=new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
