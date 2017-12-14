package com.company;

public class Experienced extends Shooter {
    private double exProb=0.05*shootYear;

    public Experienced(String name, int age, int shootYear, double mathRandom) {
        super(name, age, shootYear, mathRandom);
    }

    @Override

    public boolean shoot() {
        if(exProb>=mathRandom){
            return true;
        }else {
            return super.shoot();
        }
    }
}
