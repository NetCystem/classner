package com.company;


//Простой обобшенный класс.Здесь Т обозначает параметр типа,который будет заменен ральным типом при создании объекта типа Gen
public class Gen <T> {

    //Объявить объект(объект здесь и переменная, и объект) типа T
    T ob;

    //передать конструктору ссылку на объект(переменную) типа T
    public Gen(T ob) {
        this.ob = ob;
    }

    //Возвратить объект(объект здесь как переменная) ob
    T getob(){
        return ob;
    }

    //Показать тип T
    void showTipe(){
        System.out.println("Типом Т является " + ob.getClass().getSimpleName());
    }
}