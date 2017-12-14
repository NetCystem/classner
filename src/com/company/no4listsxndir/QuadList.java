package com.company.no4listsxndir;


//4
public class QuadList extends MetalList {
    int lenght;


    public QuadList(int thickness, int density, int lenght) {
        super(thickness, density);
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return (int)Math.pow(lenght,2);
    }

    @Override
    public double qash() {
        return (int)area()*thickness*density;
    }


    @Override
    public String info() {
        return "info for Qadrat List " + " " + thickness + " " + density + " " + area() + " " + qash();
    }
}
