package com.company;

public class Newbie extends Shooter {
    private double newProb=0.01*shootYear;

    public Newbie(String name, int age, int shootYear, double mathRandom) {
        super(name, age, shootYear, mathRandom);
    }

    @Override
    public boolean shoot() {
        if(newProb>=mathRandom){
            return true;
        }else {
            return super.shoot();
        }
    }
}
