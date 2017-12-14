package com.company.abstracts;

//1
public abstract class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String greeting(Human human);

    public abstract void about();

}
