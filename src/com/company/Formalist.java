package com.company;

public class Formalist extends People {
    public Formalist(String name, int age) {
        super(name, age);
    }

    @Override
    public String greeting(People people) {
        return super.greeting(people);
    }

    @Override
    public String about() {
        return super.about();
    }
}
