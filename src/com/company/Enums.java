package com.company;

public enum  Enums {
//     SUM(100),
//     SUB(200),
//     DIV(300),
//     MUL(300);
//
//     private int k;
//
//    Enums(int k) {
//        this.k=k;
//    }
//
//    int getK(){
//        return k;
//    }

     SUM,
     SUB,
     DIV,
     MUL;

     double calculate(double a, double b){
         switch (this){
             case DIV:
                 return a/b;
             case MUL:
                 return a*b;
             case SUB:
                 return a-b;
             case SUM:
                 return a+b;
         }
         return 0;
     }


}
