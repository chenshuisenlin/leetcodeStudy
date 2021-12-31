package com.design_pattern.behavioral_pattern.command;

public class Waiter {
    private Breakfast changfen,huntun,hefen;

    public void setChangfen(Breakfast changfen) {
        this.changfen = changfen;
    }

    public void setHuntun(Breakfast huntun) {
        this.huntun = huntun;
    }

    public void setHefen(Breakfast hefen) {
        this.hefen = hefen;
    }
    public void chooseChangFen(){
        changfen.cooking();
    }
    public void chooseHunTun(){
        huntun.cooking();
    }
    public void chooseHeFen(){
        hefen.cooking();
    }
}
