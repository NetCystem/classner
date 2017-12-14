package com.company;

public class SmartStud extends Stud {
    public SmartStud(String name, String surname, String fName, int count, int minMark) {
        super(name, surname, fName, count, minMark);
    }

    @Override
    public boolean takeExam() {

        if (count==20){
            return true;
        }else{
            if (count>20/2){
                if (0.7*count>=minMark){
                    return true;
                }
            }
        }

        return super.takeExam();
    }

    @Override
    public void done() {
        System.out.println("Student Name: " + name + " Student Surname: " + surname + " Student Father Name: " + fName + " Count of Lessons Meeting: " + count + " Exam Has Passed!");

    }

    @Override
    public void notDone() {
        System.out.println("Student Name: " + name + " Student Surname: " + surname + " Student Father Name: " + fName + " Count of Lessons Meeting: " + count + " Exam Not Has Passed!");
    }
}


