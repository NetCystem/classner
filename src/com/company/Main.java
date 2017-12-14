package com.company;

import com.company.bankaccountxndir.BankAccount;
import com.company.bankaccountxndir.BankManager;
import com.company.bankaccountxndir.Card;
import com.company.dasaranxndir.Apperntice;
import com.company.dasaranxndir.Director;
import com.company.dasaranxndir.HeadTeacher;
import com.company.dasaranxndir.TheClass;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //724

        ///Doing by seter, geter(when constructor is default(emty)).
//        Student stud=new Student();
//
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//
//        int [] studentsC=new int[n];
//        String [] studentsN=new  String[n];
//        String [] studentsS=new  String[n];
//
//        int index=0;
//
//        for (int i = 0; i <studentsN.length ; i++) {
//            studentsN[i]=scanner.next();
//        }
//
//        for (int i = 0;       § i <studentsS.length ; i++) {
//            studentsS[i]=scanner.next();
//        }
//
//        for (int i = 0; i <studentsC.length ; i++) {
//            studentsC[i]=scanner.nextInt();
//        }
//
//        int max=studentsC[0];
//
//        for (int i = 0; i <studentsC.length ; i++) {
//            if (studentsC[i]>max){
//                max=studentsC[i];
//                stud.setName(studentsN[i]);
//                stud.setSurname(studentsS[i]);
//            }
//        }
//
//
//        System.out.println(stud.getName());
//        System.out.println(stud.getSurname());


        ////doing by constructor
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//
//
//        String [] studentsN=new  String[n];
//        String [] studentsS=new  String[n];
//        int [] countofB=new int[n];
//
//        int index=0;
//        int max=0;
//
//        for (int i = 0; i <studentsN.length ; i++) {
//            studentsN[i]=scanner.next();
//        }
//
//        for (int i = 0; i <studentsS.length ; i++) {
//            studentsS[i]=scanner.next();
//        }
//
//        for (int i = 0; i <countofB.length ; i++) {
//            countofB[i]=scanner.nextInt();
//        }
//
//
//        Student[] stud= new Student[n];//sarquma obiektneri zangvac
//        for (int i = 0; i < stud.length; i++) {
//            stud[i] = new Student(studentsN[i], studentsS[i], countofB[i]);
//        }
//
//
//
//        for (int i = 0; i < stud.length; i++) {
//            if (stud[i].getCount() > max) {
//                max = stud[i].getCount();
//                index = i;
//            }
//        }
//        stud[index].print();


        //725
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//
//        int [] studNumb=new int[n];
//        String [] studName=new String[n];
//        String [] studSurname=new String[n];
//
//        for (int i = 0; i <studName.length ; i++) {
//            studName[i]=scanner.next();
//
//        }
//        for (int i = 0; i <studSurname.length ; i++) {
//            studSurname[i]=scanner.next();
//
//        }
//        for (int i = 0; i <studNumb.length ; i++) {
//            studNumb[i]=scanner.nextInt();
//        }
//
//        Student [] stud=new Student[n];
//        for (int i = 0; i <stud.length ; i++) {
//            stud[i]=new Student(studName[i], studSurname[i], studNumb[i]);
//
//        }
//
//        int mijin=0;

        ///tveri gumar@ stanal@ 1 tarberak
//        for (int i = 0; i <studNumb.length ; i++) {
//            mijin+=studNumb[i];
//        }


        ///tveri gumar@ stanal@ 2 tarberak
//        for (int i = 0; i <stud.length ; i++) {
//            mijin+=stud[i].getNumb();
//
//        }
//
//
//        for (int i = 0; i <stud.length ; i++) {
//            if (stud[i].getNumb()>mijin/stud.length){
//                stud[i].print();
//
//            }
//
//        }


        //Полиморфизм - Высокий уровень (ռուսական խնդրագիրք)

        //1

//        Scanner scanner=new Scanner(System.in);
//
//        String name=scanner.next();
//        String name2=scanner.next();
//        String name3=scanner.next();
//        String name4=scanner.next();
//        String name5=scanner.next();
//
//        int age=scanner.nextInt();
//        int age2=scanner.nextInt();
//        int age3=scanner.nextInt();
//        int age4=scanner.nextInt();
//        int age5=scanner.nextInt();
//
//
//        People formalist=new Formalist(name,age);
//        People formalist2=new Formalist(name2,age2);
//        People noFormalist=new NoFormalist(name3,age3);
//        People noFormalist2=new NoFormalist(name4,age4);
//        People realist=new Realist(name5,age5);
//
//        System.out.println(formalist.about());
//        System.out.println(formalist2.about());
//        System.out.println(noFormalist.about());
//        System.out.println(noFormalist2.about());
//        System.out.println(realist.about());
//
//
//        System.out.println(formalist.name + ": " + formalist.greeting(formalist2));
//        System.out.println(formalist2.name + ": " + formalist2.greeting(formalist));
//        System.out.println(formalist.name + ": " + formalist.greeting(noFormalist));
//        System.out.println(noFormalist.name + ": " + noFormalist.greeting(formalist));
//        System.out.println(formalist.name + ": " + formalist.greeting(noFormalist2));
//        System.out.println(noFormalist2.name + ": " + noFormalist2.greeting(formalist));
//        System.out.println(formalist.name + ": " + formalist.greeting(realist));
//        System.out.println(realist.name + ": " + realist.greeting(formalist));
//        System.out.println(formalist2.name + ": " + formalist2.greeting(noFormalist));
//        System.out.println(noFormalist.name + ": " + noFormalist.greeting(formalist2));
//        System.out.println(formalist2.name + ": " + formalist2.greeting(noFormalist2));
//        System.out.println(noFormalist2.name + ": " + noFormalist2.greeting(formalist2));
//        System.out.println(formalist2.name + ": " + formalist2.greeting(realist));
//        System.out.println(realist.name + ": " + realist.greeting(formalist2));
//        System.out.println(noFormalist.name + ": " + noFormalist.greeting(noFormalist2));
//        System.out.println(noFormalist2.name + ": " + noFormalist2.greeting(noFormalist));
//        System.out.println(noFormalist.name + ": " + noFormalist.greeting(realist));
//        System.out.println(realist.name + ": " + realist.greeting(noFormalist));
//        System.out.println(noFormalist2.name + ": " + noFormalist2.greeting(realist));
//        System.out.println(realist.name + ": " + realist.greeting(noFormalist2));

        //2

//        double n=Math.random();
//
//        //erb vor bolori nshnaket@ nunn e
//        Newbie newbie=new Newbie("Bob",25,3,n);
//        Experienced experienced=new Experienced("Bond", 30,5,n);
//        Veteran veteran=new Veteran("Stalone", 45,15,n);
//        Experienced experienced2=new Experienced("James", 33,8,n);
//        Newbie newbie2=new Newbie("Jim",23,2,n);
//        Experienced experienced3=new Experienced("John", 33,8,n);
//        Veteran veteran2=new Veteran("Smith", 45,15,n);


        //erb vor amen mek@ uni tarber nshananaket
//        Newbie newbie=new Newbie("Bob",25,3,Math.random());
//        Experienced experienced=new Experienced("Bond", 30,5,Math.random());
//        Veteran veteran=new Veteran("Stalone", 45,15,Math.random());
//        Experienced experienced2=new Experienced("James", 33,8,Math.random());
//        Newbie newbie2=new Newbie("Jim",23,2,Math.random());
//        Experienced experienced3=new Experienced("John", 33,8,Math.random());
//        Veteran veteran2=new Veteran("Smith", 45,15,Math.random());


//        Shooter [] shooters={newbie,experienced,veteran,experienced2,newbie2,experienced3,veteran2};
//
//        for (int i = 0; i <shooters.length ; i++) {
//            if (!shooters[i].shoot()){
//                System.out.println("Can't hit the mark " + " Shooter's Name " + shooters[i].name + " Shooter's Age " + shooters[i].age +
//                        " Shooter's experience " + shooters[i].shootYear + " Shotting Score for " + shooters[i].name + " = " + shooters[i].mathRandom);
//
//            }else {
//                System.out.println("Bang!! You Hit the Mark " + shooters[i].name + " " + shooters[i].age + " " + shooters[i].shootYear + "" +
//                        " Shotting Score for " + shooters[i].name + " = "+ shooters[i].mathRandom);
//                break;
//
//            }
//
//
//        }

        //3
//        Scanner scanner=new Scanner(System.in);
//
//
//
//        System.out.println("Enter Minimum Mark");
//        int minMark=scanner.nextInt();
//
//
//
//        System.out.println("Enter Ordinary Students Attendance Count");
//
//        OrdinaryStud ordinaryStud1=new OrdinaryStud("Aa1","Bb1","Cc1", scanner.nextInt(), minMark);
//        OrdinaryStud ordinaryStud2=new OrdinaryStud("Aa2","Bb2","Cc2", scanner.nextInt(), minMark);
//        OrdinaryStud ordinaryStud3=new OrdinaryStud("Aa3","Bb3","Cc3", scanner.nextInt(), minMark);
//        OrdinaryStud ordinaryStud4=new OrdinaryStud("Aa4","Bb4","Cc4", scanner.nextInt(), minMark);
//        OrdinaryStud ordinaryStud5=new OrdinaryStud("Aa5","Bb5","Cc5", scanner.nextInt(), minMark);
//
//        System.out.println("Enter Smart Students Attendance Count");
//        SmartStud smartStud1=new SmartStud("Dd1","Ee1","Ff1",scanner.nextInt(),minMark);
//        SmartStud smartStud2=new SmartStud("Dd2","Ee2","Ff2",scanner.nextInt(),minMark);
//        SmartStud smartStud3=new SmartStud("Dd3","Ee3","Ff3",scanner.nextInt(),minMark);
//        SmartStud smartStud4=new SmartStud("Dd4","Ee4","Ff4",scanner.nextInt(),minMark);
//
//        System.out.println("Enter Genius Students Attendance Count");
//        GeniusStud geniusStud=new GeniusStud("Gg","Hh","Ii",scanner.nextInt(),minMark);
//
//        Stud [] studs={ordinaryStud1,ordinaryStud2,ordinaryStud3,ordinaryStud4,ordinaryStud5,smartStud1,smartStud2,smartStud3,smartStud4,geniusStud};
//
//        for (int i = 0; i <studs.length ; i++) {
//            if (studs[i].takeExam()){
//                studs[i].done();
//            }else {
//                studs[i].notDone();
//            }
//
//        }


        //abstract

//        AbsClass absClass=new AbsClass(45, "Tatev") {
//            @Override
//            public String qiaftar() {
//                return "This abstarct method from abstract class";
//            }
//        };
//
//
//
//        System.out.println(absClass.qiaftar());
//        System.out.println(absClass.qiaftar1());
//        System.out.println(absClass.qiaftar2());

//        Packages packages=new Packages(15,16,17,18);
//        Main main=new Main();
//
//        System.out.println(packages.age);
//        System.out.println(packages.age2);
//        System.out.println(packages.getAge());
//        System.out.println(packages.age4);
//
//        System.out.println(main.lexi());


        //interface

//        MyClass myClass=new MyClass();
//
//        System.out.println(myClass.doub());
//        System.out.println(myClass.absMethod());
//        myClass.write();
//
//
//
//        MyInter myInter=new MyInter() {
//            @Override
//            public int absMethod() {
//                return Math.abs(number-15);
//            }
//
//            @Override
//            public void write() {
//                System.out.println("Constant = " + number*3);
//            }
//
//
//        };
//
//        System.out.println(myInter.absMethod());
//        myInter.write();
//        MyInter.statMethod();//static methodner@ classi anunova kanchvum


///from abstracts package

        ///§1

        //firstmethod
//        Scanner scanner=new Scanner(System.in);
//
//        String [] names={"Александр", "Андрей", "Анастасия", "Ирина", "Наталья", "Павел", "Роман", "Светлана", "Сергей", "Татьяна"};
//        int [] ages=new int[5];
//
//        for (int i = 0; i < ages.length; i++) {
//            int n=scanner.nextInt();
//            if (n>=20 && n<=40){
//                ages[i]=n;
//            }else {
//                i=i-1;
//                System.out.println("Enter the valid age betwen 20 & 40 included");
//            }
//        }
//
//        Random r=new Random();
//
//        //vonc random nuin ogtagorcvac element@ el cvercni?
//        Human formal=new Formal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]);
//        Human noFormal=new Noformal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]);
//        Human noFormal2=new Noformal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]);
//        Human real=new Real(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]);
//        Human real2=new Real(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]);
//
//        formal.about();
//        noFormal.about();
//        real.about();
//        noFormal2.about();
//        real2.about();
//
//
//        System.out.println(formal.greeting(noFormal));
//        System.out.println(noFormal.greeting(formal));
//        System.out.println(formal.greeting(noFormal2));
//        System.out.println(noFormal2.greeting(formal));
//        System.out.println(formal.greeting(real));
//        System.out.println(real.greeting(formal));
//        System.out.println(formal.greeting(real2));
//        System.out.println(real2.greeting(formal));
//
//        System.out.println(noFormal.greeting(noFormal2));
//        System.out.println(noFormal2.greeting(noFormal));
//        System.out.println(noFormal.greeting(real));
//        System.out.println(real.greeting(noFormal));
//        System.out.println(noFormal.greeting(real2));
//        System.out.println(real2.greeting(noFormal));
//
//        System.out.println(noFormal2.greeting(real));
//        System.out.println(real.greeting(noFormal2));
//        System.out.println(noFormal2.greeting(real2));
//        System.out.println(real2.greeting(noFormal2));
//
//        System.out.println(real.greeting(real2));
//        System.out.println(real2.greeting(real));


        //second method
//        Scanner scanner=new Scanner(System.in);
//
//        String [] names={"Александр", "Андрей", "Анастасия", "Ирина", "Наталья", "Павел", "Роман", "Светлана", "Сергей", "Татьяна"};
//        int [] ages=new int[5];
//
//        for (int i = 0; i < ages.length; i++) {
//            int n=scanner.nextInt();
//            if (n>=20 && n<=40){
//                ages[i]=n;
//            }else {
//                i=i-1;
//                System.out.println("Enter the valid age betwen 20 & 40 included");
//            }
//        }
//
//        Random r=new Random();
//
//
//
//        Formal formal=new Formal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]) {
//            @Override
//            public String greeting(Human human) {
//            return name + ": "+"Здравствуй, " + human.name + "!";
//            }
//
//            @Override
//            public void about() {
//                System.out.println("My name is " + name + " I'm " + age + " & I'm " + formalClassName());//classi anun@ vonc stanam?
//
//            }
//        };
//
//        Formal formal2=new Formal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]) {
//            @Override
//            public String greeting(Human human) {
//                return name + ": "+"Здравствуй, " + human.name + "!";
//            }
//
//            @Override
//            public void about() {
//                System.out.println("My name is " + name + " I'm " + age + " & I'm " + formalClassName());
//
//            }
//        };
//
//        Noformal noformal=new Noformal(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]) {
//            @Override
//            public String greeting(Human human) {
//                return name + ": "+"Привет, " + human.name + "!";
//            }
//
//            @Override
//            public void about() {
//                System.out.println("My name is " + name + " I'm " + age + " & I'm " + noformalClassName());
//
//            }
//        };
//
//        Real real=new Real(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]) {
//            @Override
//            public String greeting(Human human) {
//                if (human.age<=age || human.age-age<=5)
//                    return name + ": "+"Привет, " + human.name + "!";
//                else
//                    return name + ": "+"Здравствуй, " + human.name + "!";
//            }
//
//            @Override
//            public void about() {
//                System.out.println("My name is " + name + " I'm " + age + " & I'm " + realClassName());
//
//            }
//        };
//
//        Real real1=new Real(names[r.nextInt(names.length)],ages[r.nextInt(ages.length)]) {
//            @Override
//            public String greeting(Human human) {
//                if (human.age<=age || human.age-age<=5)
//            return name + ": "+"Привет, " + human.name + "!";
//            else
//            return name + ": "+"Здравствуй, " + human.name + "!";
//            }
//
//            @Override
//            public void about() {
//                System.out.println("My name is " + name + " I'm " + age + " & I'm  " + realClassName() );
//
//            }
//        };
//
//
//
//        formal.about();
//        formal2.about();
//        noformal.about();
//        real.about();
//        real1.about();
//
//        System.out.println(formal.greeting(formal2));
//        System.out.println(formal2.greeting(formal));
//        System.out.println(formal.greeting(noformal));
//        System.out.println(noformal.greeting(formal));
//        System.out.println(formal.greeting(real));
//        System.out.println(real.greeting(formal));
//        System.out.println(formal.greeting(real1));
//        System.out.println(real1.greeting(formal));
//
//        System.out.println(formal2.greeting(noformal));
//        System.out.println(noformal.greeting(formal2));
//        System.out.println(formal2.greeting(real));
//        System.out.println(real.greeting(formal2));
//        System.out.println(formal2.greeting(real1));
//        System.out.println(real1.greeting(formal2));
//
//
//        System.out.println(noformal.greeting(real));
//        System.out.println(real1.greeting(formal2));
//        System.out.println(noformal.greeting(real1));
//        System.out.println(real1.greeting(formal2));
//
//        System.out.println(real.greeting(real1));
//        System.out.println(real1.greeting(real));

        //Enums

//        System.out.println(Enums.SUM.getK());
//        System.out.println(Enums.SUB.getK());
//        System.out.println(Enums.DIV.getK());
//        System.out.println(Enums.MUL.getK());

        //SARQEL KALKIULIATOR enum-ov

//        Scanner scanner=new Scanner(System.in);
//        System.out.println((int)Enums.SUM.calculate(scanner.nextInt(),scanner.nextInt()));


        //Boxing & Unboxing


//        BoxingUnboxing boxingUnboxing = new BoxingUnboxing();
//        boxingUnboxing.Bx(8);


        ///Lambda expressions

//        LiaSetMethod liaSetMethod=new LiaSetMethod();
//        liaSetMethod.setInter((a, b) -> 0);



        //4

//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Parameters For Quadtrat Lists");
//
//        QuadList[] quadList=new QuadList[7];
//        for (int i = 0; i < quadList.length; i++) {
//            quadList[i]=new QuadList(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//        }
//
//        System.out.println("Parameters For Straight Lists");
//        RectangList [] straightList=new RectangList[5];
//        for (int i = 0; i < straightList.length; i++) {
//            straightList[i]=new RectangList(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//        }
//
//        System.out.println("Parameters For Triangle Lists");
//        TriangleList [] triangleList=new TriangleList [3];
//        for (int i = 0; i <triangleList.length ; i++) {
//            triangleList[i] = new TriangleList(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//        }


        ////Generics
        //Создать объект типа Gen дла целых чисел

        //Gen<Integer> iOb = new Gen<Integer>(88);

        ////Получить значение переменной iOb. Обратите внимание на то, что для этого не требуется никакого приведения типов.
        //int v = iOb.getob();//

        ////int v = iOb.getob().intValue();//После Java 5 такой вид кода не требуется, так как возврашаемый методом getob() тим Integer автоматический распаковывается в тип int
        //// и присваевается переменной v типа int, и unboxing с вызом intValue() не требуется)
        //System.out.println("Значение " + v);
        //System.out.println();

        ////показать тип данных храняшихся в переменной iOb
        //iOb.showTipe();

        ////Создать объект типа Gen дла символьных строк
        //Gen<String> strOb = new Gen<String>("Тесет Обобшений");

        //показать тип данных храняшихся в переменной strOb
        //strOb.showTipe();

        ////Получить значение переменной strOb.И в этом случае приведение типов не требуеться
        //String str = strOb.getob();
        //System.out.println("Значение " + str );



        ///Productneri xndir xndir

//        Pruduct pruduct1 = new Pruduct("dd", 10, 12,10);
//        Pruduct pruduct2 = new Pruduct("aa", 20, 5, 10);
//        Pruduct pruduct3 = new Pruduct("cc", 30, 4, 9);
//        Pruduct pruduct4 = new Pruduct("bb", 40, 15,10);

//
//        List<Pruduct> list=new ArrayList<>();
//        list.add(pruduct1);
//        list.add(pruduct2);
//        list.add(pruduct3);
//
//        Manager manager=new Manager(list);
//
//        manager.addProduct(pruduct4);
//        manager.ShowList();
//        System.out.println();
//        manager.removeProduct();
//        manager.ShowList();
//        System.out.println();
//        manager.sortByName();
//        manager.ShowList();
//        System.out.println();
//        manager.sortByPrice();
//        manager.ShowList();



        //Pruduct pruduct=new Pruduct("a", 8, "1103110");

//        String name[] = new String[n];
//        for (int i = 0; i <name.length ; i++) {
//            name[i]=scanner.next();
//        }
//
//        int price[] = new int[n];
//        for (int i = 0; i <price.length ; i++) {
//            price[i]=scanner.nextInt();
//        }
//
//        String expireDate[] = new String[n];
//        for (int i = 0; i <expireDate.length ; i++) {
//            expireDate[i]=scanner.next();
//        }
//
//
//        Pruduct [] pruducts = new Pruduct[n];
//        for (int i = 0; i <pruducts.length ; i++) {
//            pruducts[i]= new Pruduct(name[i],price[i],expireDate[i]);
 //       }



        //banking xndir

//        Card card1 = new Card("1234000012341234",2000);
//        Card card2 = new Card("1234000012341234",3000);
//        Card card3 = new Card("1234000012341233",4000);
//        Card card4 = new Card("1234000012341244",-5000);
//        Card card5 = new Card("1234000012341255",5000);
//
//        BankAccount bankAccount1 = new BankAccount("aa","bb",18,"Male", "13.02.1989", card1);
//        BankAccount bankAccount2 = new BankAccount("cc","dd",30,"Male", "13.02.1989", card2);
//        BankAccount bankAccount3 = new BankAccount("ee","ff",21,"Male", "13.02.1989", card3);
//        BankAccount bankAccount4 = new BankAccount("gg","hh",22,"Male", "02.11.2017", card4);
//        BankAccount bankAccount5 = new BankAccount("bb","jj",19,"Male", "13.02.1989", card5);
//
//        List<BankAccount> bankAccountList=new ArrayList<BankAccount>();
//
//        //Adding Bank Accounts to Bank Account List
//        bankAccountList.add(bankAccount1);
//        bankAccountList.add(bankAccount2);
//        bankAccountList.add(bankAccount3);
//        bankAccountList.add(bankAccount4);
//
//
//        BankManager bankManager = new BankManager(bankAccountList);
//
//        System.out.println("All Bank Accounts");
//        bankManager.showAll();
//        System.out.println();
//
//        //Adding new Bank Account to Bank Account List
//        bankManager.addNewBankAccount(bankAccount5);
//
//        System.out.println("All Bank Accounts after adding new one");
//        bankManager.showAll();
//        System.out.println();
//
//
//
//        bankManager.sortByname();
//
//        System.out.println("Bank Accounts Sorted By Name");
//        bankManager.showAll();
//        System.out.println();
//
//
//
//        bankManager.sortByAge();
//
//        System.out.println("Bank Accounts Sorted By Age");
//        bankManager.showAll();
//        System.out.println();
//
//        System.out.println("Bank Accounts with Maximum Balance");
//        bankManager.maxBallanceShow();
//        System.out.println();
//
//        System.out.println("Blocked Bank Accounts");
//        bankManager.showBlockedAccounts();
//        System.out.println();
//
//
//
//        bankManager.addBirthdayBallance();
//
//        System.out.println("Bank Account List After Adding Birthday Ballance");
//        bankManager.showAll();
//        System.out.println();
//
//
//        bankManager.removeBankAccount("1234000012341244");
//
//        System.out.println("Bank Account List After Removing Bank Account By ID");
//        bankManager.showAll();
//        System.out.println();


                                          ////Simple date format
        ////1st version
        ////Creating date object of Date class, which are contains current today data (Date class returns current day data
        //Date date = new Date();

        ////creating simpleDateFormat object of SimpleDateFormat class, which will turn any data to this dd/MM/yy format
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

        ////There simpleDateFormat object by help of his class's method format() already turns recieving data to this dd/MM/yy format
        //String today = simpleDateFormat.format(date);

        ////2nd short version
        //SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yy");
        //String today1=simpleDateFormat1.format(new Date());


        //dproc xndir

        Scanner scanner = new Scanner(System.in);
        List<TheClass> theClassList = new ArrayList<>();
        Director director = new Director(theClassList);



        Apperntice apperntice1 = new Apperntice("a","b", "Female", 13);
        Apperntice apperntice2 = new Apperntice("c","d", "Female", 13);
        Apperntice apperntice3 = new Apperntice("e","f", "Female", 13);
        Apperntice apperntice4 = new Apperntice("g","h", "Female", 13);
        Apperntice apperntice5 = new Apperntice("i","j", "Female", 13);
        Apperntice apperntice6 = new Apperntice("k","l", "Female", 9);
        Apperntice apperntice7 = new Apperntice("m","n", "Female", 9);
        Apperntice apperntice8 = new Apperntice("o","p", "Female", 13);

        Apperntice appernticeA1 = new Apperntice("AB1", "CD1", "Male", 15);
        Apperntice appernticeA2 = new Apperntice("EF1", "GH1", "Female", 9);
        Apperntice appernticeA3 = new Apperntice("HI1", "JK1", "Female", 25);
        Apperntice appernticeA4 = new Apperntice("LM1", "NO1", "Male", 24);
        Apperntice appernticeA5 = new Apperntice("PQ1", "RS1", "Male", 17);

        Apperntice appernticeB1 = new Apperntice("AB2", "CD2", "Male", 15);
        Apperntice appernticeB2 = new Apperntice("EF2", "GH2", "Male", 13);
        Apperntice appernticeB3 = new Apperntice("HI2", "JK2", "Female", 17);
        Apperntice appernticeB4 = new Apperntice("LM2", "NO2", "Male", 14);
        Apperntice appernticeB5 = new Apperntice("PQ2", "RS2", "Male", 19);

        List<Apperntice> appernticeList = new ArrayList<>();
        appernticeList.add(apperntice1);
        appernticeList.add(apperntice2);
        appernticeList.add(apperntice3);
        appernticeList.add(apperntice4);
        appernticeList.add(apperntice5);
        appernticeList.add(apperntice6);
        appernticeList.add(apperntice7);

        List<Apperntice> appernticeList1 = new ArrayList<>();
        appernticeList1.add(appernticeA1);
        appernticeList1.add(appernticeA2);
        appernticeList1.add(appernticeA3);
        appernticeList1.add(appernticeA4);
        appernticeList1.add(appernticeA5);

        List<Apperntice> appernticeList2 = new ArrayList<>();
        appernticeList2.add(appernticeB1);
        appernticeList2.add(appernticeB2);
        appernticeList2.add(appernticeB3);
        appernticeList2.add(appernticeB4);
        appernticeList2.add(appernticeB5);

        HeadTeacher headTeacher = new HeadTeacher("AA", "BB", "Female");
        HeadTeacher headTeacher1 = new HeadTeacher("BB", "CC", "Male");
        HeadTeacher headTeacher2 = new HeadTeacher("AA1", "BB1", "Male");

        TheClass theClass = new TheClass(1, appernticeList.size(), 1, headTeacher, appernticeList);
        TheClass theClass1 = new TheClass(2, appernticeList1.size(), 2, headTeacher1, appernticeList1);
        TheClass theClass2 = new TheClass(3, appernticeList2.size(), 3, headTeacher2, appernticeList2);

        theClassList.add(theClass);
        theClassList.add(theClass1);




        director.showAll();
        System.out.println();

        headTeacher.addNewAppr(theClass, apperntice8);
        director.showAll();
        System.out.println();

        headTeacher.removeAllStudsWhenStat(theClass);
        director.showAll();
        System.out.println();

        System.out.println("Enter the new Study status for current apperntice: dowager, averageStudent or highAchiever");
        System.out.println();
       headTeacher.changeStudyStatus(apperntice1, scanner.next());
       director.showAll();
       System.out.println();

       System.out.println("Enter the new mog for current apperntice");
       headTeacher.setNewMog(apperntice1, scanner.nextInt());
        director.showAll();
        System.out.println();

        System.out.println("class removed");
        director.removeAvarageClass();
        director.showAll();

        System.out.println("After Adding new class");
        director.addNewClass(theClass2);
        director.showAll();

        director.changeClassHeadTeacher(theClass2,headTeacher);
        director.showAll();









//

//
//        Apperntice appernticeC1 = new Apperntice("AB3", "CD3", "Male", 15);
//        Apperntice appernticeC2 = new Apperntice("EF3", "GH3", "Female", 9);
//        Apperntice appernticeC3 = new Apperntice("HI3", "JK3", "female", 25);
//        Apperntice appernticeC4 = new Apperntice("LM3", "NO3", "Female", 24);
//        Apperntice appernticeC5 = new Apperntice("PQ3", "RS3", "Male", 17);
//
//        Apperntice appernticeD1 = new Apperntice("AB4", "CD4", "Female", 15);
//        Apperntice appernticeD2 = new Apperntice("EF4", "GH4", "Female", 9);
//        Apperntice appernticeD3 = new Apperntice("HI4", "JK4", "Male", 25);
//        Apperntice appernticeD4 = new Apperntice("LM4", "NO4", "Male", 24);
//        Apperntice appernticeD5 = new Apperntice("PQ4", "RS4", "Male", 17);
//
//        Apperntice appernticeE1 = new Apperntice("AB5", "CD5", "Female", 15);
//        Apperntice appernticeE2 = new Apperntice("EF5", "GH5", "Female", 9);
//        Apperntice appernticeE3 = new Apperntice("HI5", "JK5", "female", 25);
//        Apperntice appernticeE4 = new Apperntice("LM5", "NO5", "Female", 24);
//        Apperntice appernticeE5 = new Apperntice("PQ5", "RS5", "Male", 17);




//

//
//        List<Apperntice> appernticeList3 = new ArrayList<>();
//        appernticeList3.add(appernticeC1);
//        appernticeList3.add(appernticeC2);
//        appernticeList3.add(appernticeC3);
//        appernticeList3.add(appernticeC4);
//        appernticeList3.add(appernticeC5);
//
//
//        List<Apperntice> appernticeList4 = new ArrayList<>();
//        appernticeList4.add(appernticeD1);
//        appernticeList4.add(appernticeD2);
//        appernticeList4.add(appernticeD3);
//        appernticeList4.add(appernticeD4);
//        appernticeList4.add(appernticeD5);
//
//        List<Apperntice> appernticeList5 = new ArrayList<>();
//        appernticeList5.add(appernticeE1);
//        appernticeList5.add(appernticeE2);
//        appernticeList5.add(appernticeE3);
//        appernticeList5.add(appernticeE4);
//        appernticeList5.add(appernticeE5);




//        HeadTeacher headTeacher2 = new HeadTeacher("CC", "DD", "Male");
//        HeadTeacher headTeacher3 = new HeadTeacher("EE", "FF", "Female");
//        HeadTeacher headTeacher4 = new HeadTeacher("GG", "HH", "Male");
//        HeadTeacher headTeacher5 = new HeadTeacher("II", "JJ", "Female");



//        TheClass theClass2 = new TheClass(2, 28, 2, headTeacher2, appernticeList2);
//        TheClass theClass3 = new TheClass(3, 20, 3, headTeacher3, appernticeList3);
//        TheClass theClass4 = new TheClass(4, 24, 4, headTeacher4, appernticeList4);
//        TheClass theClass5 = new TheClass(5, 24, 5, headTeacher5, appernticeList5);
















    }
}
