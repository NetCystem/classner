package com.company;

public class Stud {
    public String name;
    public String surname;
    public String fName;
    public int count;
    public int minMark;
    public double  mathRandom;


    public Stud(String name, String surname, String fName, int count, int minMark) {
        this.name = name;
        this.surname = surname;
        this.fName = fName;
        this.count = count;
        this.minMark = minMark;
    }

    public boolean takeExam (){
        return false;
    }

    public  void done(){
        System.out.println(" ");
    }

    public void notDone(){
        System.out.println(" ");
    }
}
