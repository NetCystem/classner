package com.company.no4listsxndir;


//4
public class RectangList extends MetalList {
    int lenght;
    int weight;


    public RectangList(int thickness, int density, int lenght, int weight) {
        super(thickness, density);
        this.lenght = lenght;
        this.weight = weight;
    }

    @Override
    public double area() {
        return lenght*weight;
    }

    @Override
    public double qash() {
        return area()*thickness*density;
    }

    @Override
    public String info() {
        return "info for Straight List" + thickness + density + area()  + qash();
    }
}
