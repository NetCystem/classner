package com.company;

public class Packages {
    public int age;
    protected  int age2;
    private int age3;
    int age4;

    public Packages(int age, int age2, int age3, int age4) {
        this.age = age;
        this.age2 = age2;
        this.age3 = age3;
        this.age4 = age4;
    }

    public int getAge(){
        return age3;
    }


}
