package com.company;

public class Realist extends People {
    public Realist(String name, int age) {
        super(name, age);
    }

    @Override
    public String greeting(People people) {
        if (people.age<=age || people.age-age<=5){
            return "Hi " + people.name;
        }else {
            return "Hello " + people.name;
        }
    }

    @Override
    public String about() {
        return super.about();
    }
}
