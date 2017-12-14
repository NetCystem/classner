package com.company.no4listsxndir;

//4
public class TriangleList extends MetalList     {
    int length;

    public TriangleList(int thickness, int density, int length) {
        super(thickness, density);
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(Math.pow(length,2),2);
    }

    @Override
    public double qash() {
        return area()*thickness*density;
    }

    @Override
    public String info() {
        return "info for Triangle List" + thickness + density + area()  + qash();
    }
}
