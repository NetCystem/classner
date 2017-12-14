package com.company;

public class Veteran extends  Shooter {
    private double vProb=0.9-0.01*age;

    public Veteran(String name, int age, int shootYear, double mathRandom) {
        super(name, age, shootYear, mathRandom);
    }

    @Override
    public boolean shoot() {
        if(vProb>=mathRandom){
            return true;
        }else {
            return super.shoot();
        }
    }
}
