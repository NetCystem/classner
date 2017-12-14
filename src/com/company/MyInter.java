package com.company;

public interface MyInter {
    int number=7;

    int absMethod();

    default void write(){
        System.out.println("Constant = " + number);
    }

    static void statMethod(){
        System.out.println("Constant Pow = " + Math.pow(number,2));
    }

}
