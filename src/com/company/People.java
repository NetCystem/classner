package com.company;

public class People {
    public String name;
    public int age;

    public People(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String greeting(People people){
        return " Hello " + people.name;
    }

    public String about(){
        return "My name is " + name + " i'm " + age + " , " + "i'm " + getClass().getSimpleName();
    }
}




