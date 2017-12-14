package com.company.abstracts;

//1
//public class Noformal extends Human {
//    public Noformal(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public String greeting(Human human) {
//        return name + ": "+"Привет, " + human.name + "!";
//
//    }
//
//    @Override
//    public void about() {
//        System.out.println("My name is " + name + " I'm " + age + " & I'm " + getClass().getSimpleName());
//
//    }
//}

//Second Method

public abstract class Noformal extends Human{
    public Noformal(String name, int age) {
        super(name, age);
    }

    public String noformalClassName(){
        return getClass().getSimpleName();
    }
}
