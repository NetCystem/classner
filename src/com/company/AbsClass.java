package com.company;

abstract class AbsClass {
    public int age;
    public  String name;

    public AbsClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract String qiaftar();//abstract metod

    public String qiaftar1(){
        return "This is not abstarct method in abstract class with " + age + " " + name;
    }

    public  static String qiaftar2(){
        return "this is static method from abstract class ";
    }

}
