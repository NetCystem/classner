package com.company.dasaranxndir;
import java.util.*;
public class Director {
    List<TheClass> classList;


    public Director(List<TheClass> classList) {
        this.classList = classList;
    }

    public List<TheClass> getClassList() {
        return classList;
    }

    public void setClassList(List<TheClass> classList) {
        this.classList = classList;
    }


    public void removeAvarageClass(){
        classList.removeIf(s-> s.getAvaregaeCount()>5);
    }

    public void addNewClass(TheClass theClass){
        classList.add(theClass);
    }

    public void changeClassHeadTeacher(TheClass theClass, HeadTeacher headTeacher){
        theClass.setHeadTeacher(headTeacher);
    }


    public void showAll(){
        classList.forEach(s->{System.out.println();
        System.out.println("Class Number: " + s.getClassNumber() + " Classroom Number: " + s.getClassRoomNumber() +
                    " Apperntice Count: " + s.getClassApprenticeCount() + " Headteacher Name: " + s.getHeadTeacher().getHTname() +
                    " Headteacher Surname: " + s.getHeadTeacher().getHTsurname() + " Headteacher Gender: "
                    + s.getHeadTeacher().getHTgender());
            System.out.println();
        s.getAppernticeList().forEach(apperntice -> {
                System.out.println("Aperntice Name: " + apperntice.getName() + " Aperntice Surname: " + apperntice.getSurname()
                    + " Aperntice Gender: " + apperntice.getGender() + " Aperntice Mog: " + apperntice.getMog()
                    + " Aperntice Study Status: " + apperntice.getStudyStatus());
            });
        });


    }



}
