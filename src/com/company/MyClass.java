package com.company;

public class MyClass implements MyInter {

     public  int doub(){
         return number*2;
    }

    @Override
    public int absMethod() {
        return Math.abs(number-10);
    }

    @Override
    public void write() {
        System.out.println("Constant = " + number*2);
    }
}
