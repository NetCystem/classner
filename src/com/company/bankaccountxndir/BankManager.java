package com.company.bankaccountxndir;
import java.text.SimpleDateFormat;
import java.util.*;

public class BankManager {
    List<BankAccount> BankAccountList;

    public BankManager(List<BankAccount> bankAccountList) {
        BankAccountList = bankAccountList;
    }

//Collections sort-@ anonymous "new Comparator<BankAccount>()" class-i tarberakov

//    public void sortByname(){
//        Collections.sort(BankAccountList, new Comparator<BankAccount>() {
//            @Override
//            public int compare(BankAccount o1, BankAccount o2) {
//                return o1.getbName().compareTo(o2.getbName());
//            }
//        });
//
//    }
//
//    public void sortByAge(){
//        Collections.sort(BankAccountList, new Comparator<BankAccount>() {
//            @Override
//            public int compare(BankAccount o1, BankAccount o2) {
//                return o1.getbAge() - o2.getbAge();
//            }
//        });
//     }



    //Nuin Collections sort-@ liambda expression tarberakov

//    public void sortByname(){
//        Collections.sort(BankAccountList, (o1, o2) -> o1.getbName().compareTo(o2.getbName()));
//
//    }
//
//
//    public void sortByAge(){
//        Collections.sort(BankAccountList, (o1, o2) -> o1.getbAge() - o2.getbAge());
//    }

    public void sortByname(){
        BankAccountList.sort((o1, o2) -> o1.getbName().compareTo(o2.getbName()));
    }

    public void sortByAge(){
        BankAccountList.sort((o1, o2) -> o1.getbAge() - o2.getbAge());
    }

    public void addNewBankAccount(BankAccount bankAccount){
        BankAccountList.add(bankAccount);
    }

    //kisata
    public void maxBallanceShow(){
        int maxBallance = 5000;
        BankAccountList.forEach(s->{
            if (s.getCard().getCardBallance()>=maxBallance)
            System.out.println("Name:" + s.getbName() + " Surname:" + s.getbSurname() + " Ballance:" + s.getCard().getCardBallance());
        });
    }

    public void showBlockedAccounts(){
        BankAccountList.forEach(s->{
            if (s.getCard().isCardBlocked()){
                System.out.println("Name:" + s.getbName() + " Surname:" + s.getbSurname() + " ID:" + s.getCard().getId() + " Ballance:" + s.getCard().getCardBallance());
            }
        });
    }

    public void addBirthdayBallance(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date = simpleDateFormat.format(new Date());
         BankAccountList.forEach(s->{
             if (s.getbBirthdayDate().substring(0,5).equals(date.substring(0,5))){
                 s.getCard().setCardBallance(s.getCard().getCardBallance() + 1000);
             }
         });
    }

//    public  void removeBankAccount(String ID){
//        BankAccountList.forEach(s->{
//            if (s.getCard().getId().equals(ID)){
//                BankAccountList.remove(s);
//            }
//        });
//
//    }


    //removing Account By id 1st version
    //remove Banck Acount by Card ID im method paramater
//    public void removeByID(String ID) {
//        Iterator<BankAccount> iterator = bankAccountList.iterator();
//        while (iterator.hasNext()) {
//            BankAccount bankAccount = iterator.next();
//            if (bankAccount.getCard().getID().equals(ID))
//                iterator.remove();
//        }
//    }


    //removing Account By id 2nd version
//    public  void removeBankAccount(String ID){
//        Iterator<BankAccount> iterator = BankAccountList.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().getCard().getId().equals(ID)){
//                iterator.remove();
//            }
//        }
//    }

    //removing Account By id 3-rd version
    public  void removeBankAccount(String ID){
        BankAccountList.removeIf(bankAccount -> bankAccount.getCard().getId().equals(ID));
    }

    public void showAll(){
        BankAccountList.forEach(s -> {
            System.out.println("Name:" + s.getbName() + " Surname:" + s.getbSurname() + " Age:" + s.getbAge() + " Gender:" + s.getbGender()
                    + " Birthday:" + s.getbBirthdayDate() + " ID:" + s.getCard().getId() + " Ballance:" + s.getCard().getCardBallance());
        });
        }
    }


