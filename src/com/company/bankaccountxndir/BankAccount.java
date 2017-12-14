package com.company.bankaccountxndir;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {

    private String bName;
    private String bSurname;
    private int bAge;
    private String bGender;
    private String bBirthdayDate;
    private Card card;

    public BankAccount(String name, String surname, int age, String gender, String birthdayDate, Card card) {

        if (!name.isEmpty() && !surname.isEmpty() && age>=18 && (gender.equals("Male") || gender.equals("Female"))){
            this.bName = name;
            this.bSurname = surname;
            this.bAge = age;
            this.bGender = gender;
            this.bBirthdayDate = birthdayDate;
            this.card = card;
        }else {
            System.out.println("The data is incorrect");
        }

    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbSurname() {
        return bSurname;
    }

    public void setbSurname(String bSurname) {
        this.bSurname = bSurname;
    }

    public int getbAge() {
        return bAge;
    }

    public void setbAge(int bAge) {
        this.bAge = bAge;
    }

    public String getbGender() {
        return bGender;
    }

    public void setbGender(String bGender) {
        this.bGender = bGender;
    }

    public String getbBirthdayDate() {
        return bBirthdayDate;
    }

    public void setbBirthdayDate(String bBirthdayDate) {
        this.bBirthdayDate = bBirthdayDate;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

