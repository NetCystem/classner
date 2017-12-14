package com.company.dasaranxndir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeadTeacher {
    private String HTname;
    private String HTsurname;
    private String HTgender;


    public HeadTeacher(String HTname, String HTsurname, String HTgender) {
        if ((HTname !=null && !HTname.isEmpty()) && (HTsurname !=null && !HTsurname.isEmpty()) &&
                (HTgender.equals("Male") || HTgender.equals("Female"))){
            this.HTname = HTname;
            this.HTsurname = HTsurname;
            this.HTgender = HTgender;
        }else {
            System.out.println("Invalid Data");
        }
    }

    public String getHTname() {
        return HTname;
    }

    public void setHTname(String HTname) {
        this.HTname = HTname;
    }

    public String getHTsurname() {
        return HTsurname;
    }

    public void setHTsurname(String HTsurname) {
        this.HTsurname = HTsurname;
    }

    public String getHTgender() {
        return HTgender;
    }

    public void setHTgender(String HTgender) {
        this.HTgender = HTgender;
    }


    public void addNewAppr(TheClass clas, Apperntice  apperntice){
        clas.appernticeList.add(apperntice);
        clas.setClassApprenticeCount(clas.getClassApprenticeCount() + 1);
    }

    public void removeAllStudsWhenStat(TheClass clas){
        clas.appernticeList.removeIf(s-> s.getStudyStatus().equals("dowager"));
    }


    public void changeStudyStatus(Apperntice apperntice, String newStatus){
        Scanner sc = new Scanner(System.in);

        if (newStatus.equals("dowager") || newStatus.equals("averageStudent") || newStatus.equals("highAchiever")){
            apperntice.setStudyStatus(newStatus);
        }else
            apperntice.setStudyStatus("Enter the valid study status");

        if (newStatus.equals("dowager")){
            System.out.println("Enter the Valid mog for dowager: 0 - 10");
            int d=sc.nextInt();
            if (d>0 && d<10){
                apperntice.setMog(d);
            }else {
                System.out.println("You've entered wrong mog for dowager");
            }
        }

        if (newStatus.equals("averageStudent")){
            System.out.println("Enter the Valid mog for dowager: 10 - 20");
            int d=sc.nextInt();
            if (d>10 && d<20){
                apperntice.setMog(d);
            }else {
                System.out.println("You've entered wrong mog for averageStudent");
            }
        }

        if (newStatus.equals("highAchiever")){
            System.out.println("Enter the Valid mog for dowager: 20 - 30");
            int d=sc.nextInt();
            if (d>20 && d<=30){
                apperntice.setMog(d);
            }else {
                System.out.println("You've entered wrong mog for highAchiever");
            }
        }



    }

    public void setNewMog(Apperntice apperntice, int newMog){
        if (newMog<=30){
            apperntice.setMog(newMog);
        } else {
            System.out.println("Enter the valid mog");

        }

        if (newMog>0 && newMog<=10){
            apperntice.setStudyStatus("dowager");
        }
        if (newMog>10 && newMog<=20){
            apperntice.setStudyStatus("averageStudent");
        }
        if (newMog>20 && newMog<=30){
            apperntice.setStudyStatus("highAchiever");
        }
    }
}


