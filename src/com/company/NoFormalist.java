package com.company;

public class NoFormalist extends People {
    public NoFormalist(String name, int age) {
        super(name, age);
    }

    @Override
    public String greeting(People people) {
        return "Hi " + people.name;
    }

    @Override
    public String about() {
        return super.about();
    }
}
