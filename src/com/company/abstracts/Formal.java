package com.company.abstracts;

//1
//public class Formal extends Human {
//
//    public Formal(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public String greeting(Human human) {
//        return name + ": "+"Здравствуй, " + human.name + "!";
//    }
//
//    @Override
//    public void about() {
//        System.out.println("My name is " + name + " I'm " + age + " & I'm " + getClass().getSimpleName());
//
//    }
//}

public abstract class Formal extends Human{
    public Formal(String name, int age) {
        super(name, age);
    }

    public String formalClassName(){
         return getClass().getSimpleName();
    }
}
