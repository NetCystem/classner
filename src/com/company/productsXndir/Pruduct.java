package com.company.productsXndir;

public class Pruduct {
    String name;
    int price;
    int expDay;
    int expMonth;
    boolean expired;
    //2 dzev//String expireDate;
    //2 dzev//boolean expired=true;

    public Pruduct(String name, int price, int expDay, int expMonth) {
        if (name != null) {
            this.name = name;

        } else {
            System.out.println("The name is Null");
        }

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("The price is negative");
        }

            this.expDay = expDay;
            this.expMonth = expMonth;

            if (this.expDay > 1 && this.expDay < 31 && this.expMonth == 10) {
                this.expired = false;
            } else {
                this.expired = true;
            }



    }


    public boolean isExpired(){
        return this.expired;

    }

    String exp(){
        if (expired){
            return "The Expiration date of product is over";
        }else {
            return this.expDay + "/" + this.expMonth;
        }
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getExpDay() {
        return expDay;
    }


    public int getExpMonth() {
        return expMonth;
    }


            //2 dzev//
//        this.expireDate = expireDate;
//         if(!isexpireDate(expireDate)){
//             expired=false;
//         }


            //2 dzev//
//    boolean isexpireDate(String expireDate){
//        String[] strings=expireDate.split("/");
//        return Integer.parseInt(strings[0])>1 && Integer.parseInt(strings[0])<31 && Integer.parseInt(strings[1])==10;
//    }


    }






