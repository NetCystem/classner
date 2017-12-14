package com.company.productsXndir;

import java.util.*;

public class Manager {

    List<Pruduct> ProdList;

    public Manager(List<Pruduct> prodList) {
        this.ProdList = prodList;
    }



    void addProduct(Pruduct product){
        ProdList.add(product);
    }

    void removeProduct(){
        Iterator<Pruduct> p = ProdList.iterator();

        while (p.hasNext()){
            if (p.next().isExpired()){
                p.remove();
            }
        }
    }

    void sortByName(){
        Collections.sort(ProdList, new Comparator<Pruduct>() {
            @Override
            public int compare(Pruduct o1, Pruduct o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    void sortByPrice(){
        Collections.sort(ProdList, new Comparator<Pruduct>() {
            @Override
            public int compare(Pruduct o1, Pruduct o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
    }

    void ShowList() {
        ProdList.forEach(s -> {
            System.out.println(s.getName() + " " + s.getPrice() + " " + s.exp());
        });

    }


}


