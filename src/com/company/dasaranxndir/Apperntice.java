package com.company.dasaranxndir;

public class Apperntice {
   private String name;
   private String surname;
   private String gender;
   private int mog;
   private String studyStatus;

    public Apperntice(String name, String surname, String gender, int mog) {
        if ((name !=null && !name.isEmpty()) && (surname !=null && !surname.isEmpty()) &&
                (gender.equals("Male") || gender.equals("Female")) && (mog>=0 && mog<=30)){
            this.name = name;
            this.surname = surname;
            this.gender = gender;
            this.mog = mog;
        }else {
            System.out.println("Invalid Data");
        }

        if (this.mog >=0 && this.mog<=10) {
            this.studyStatus = "dowager";
        }else {
            if (this.mog >=10 && this.mog<=20){
                this.studyStatus = "averageStudent";
            }else {
                if (this.mog >=20 && this.mog<=30){
                    this.studyStatus = "highAchiever";
                }
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMog() {
        return mog;
    }

    public void setMog(int mog) {
        this.mog = mog;
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }


//        public enum Enums{
//        HIGHACHIEVER,
//        DOWAGER,
//        AVERAGESTUDENT;

//        Enums() {
//        }
//    }
}

