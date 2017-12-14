package com.company.no4listsxndir;

public abstract class MetalList {
    int thickness;
    int density;


    public MetalList(int thickness, int density) {
        this.thickness = thickness;
        this.density = density;
    }

    public abstract double area();

    public abstract double qash();

    public abstract String info();


}
