package com.company.abstracts;


//1
//public class Real extends Human {
//    public Real(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public String greeting(Human human) {
//
//        if (human.age<=age || human.age-age<=5)
//            return name + ": "+"Привет, " + human.name + "!";
//        else
//            return name + ": "+"Здравствуй, " + human.name + "!";
//
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
public abstract class Real extends Human{
    public Real(String name, int age) {
        super(name, age);
    }

    public String realClassName(){
        return getClass().getSimpleName();
    }


}
