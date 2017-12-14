package com.company.dasaranxndir;

import java.util.List;

public class TheClass {
    private int classNumber;
    private int classApprenticeCount;
    private int classRoomNumber;
    private HeadTeacher headTeacher;
    //Apperntice [] apperntices;
    List<Apperntice> appernticeList;
    private  int count;


//    public Class(int classNumber, int classApprenticeCount, int classRoomNumber, HeadTeacher headTeacher, Apperntice[] apperntices) {
//        if ((classNumber >=1 && classNumber<=12) && (classApprenticeCount > 0 && classApprenticeCount <=30)
//                && classRoomNumber > 0 && apperntices.length>4)
//
//        this.classNumber = classNumber;
//        this.classApprenticeCount = classApprenticeCount;
//        this.classRoomNumber = classRoomNumber;
//        this.headTeacher = headTeacher;
//    }


    public TheClass(int classNumber, int classApprenticeCount, int classRoomNumber, HeadTeacher headTeacher, List<Apperntice> appernticeList) {
        if ((classNumber >= 1 && classNumber <= 12) && (classApprenticeCount > 0 && classApprenticeCount <= 30)
                && classRoomNumber > 0 && appernticeList.size()>4) {
            this.classNumber = classNumber;
            this.classApprenticeCount = classApprenticeCount;
            this.classRoomNumber = classRoomNumber;
            this.headTeacher = headTeacher;
            this.appernticeList = appernticeList;
        }else {
            System.out.println("Invalid Data");
        }

    }


    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassApprenticeCount() {
        return classApprenticeCount;
    }

    public void setClassApprenticeCount(int classApprenticeCount) {
        this.classApprenticeCount = classApprenticeCount;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public HeadTeacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(HeadTeacher headTeacher) {
        this.headTeacher = headTeacher;
    }

    public List<Apperntice> getAppernticeList() {
        return appernticeList;
    }

    public void setAppernticeList(List<Apperntice> appernticeList) {
        this.appernticeList = appernticeList;
    }


    public int getAvaregaeCount(){
        appernticeList.forEach(s-> {
            if(s.getStudyStatus().equals("averageStudent")){
                count++;
            }
        });
        return count;
    }
}


