

//write a program  in java which implemetnst interface Student which has two method Dispalay_grade and Attendance for PG_students and UG_sudentds (PG_Students and UG_studetns are two different classes for Post Graduate and Under Graduate Students respectively)?

//WE WILL USE INTERFACE HERE
// interface in java is used to achieve 100% abstraciton , they can only be inherited using "implements keyword", we can't creat objects of interface class

// all the methods in interface are by default public static final and abstract and they don't have body , the body is written in the subclass who will inherit the interface

//interface is used to achieve multiple inheritance in java
//interface is having static constants and public static final abstract methods
//it represents the IS-A relationship
// it is used to achieve loose coupling

//When we already have abstract classes then why do we use interface the answer is that absctract class many cantain non final variables

//Concreate class - A concreate class is that class which can be initiated and create an object using the new keyword
// a concreate class is non abstract class , this is a class which is having implementation of his methods

//Final keyword have 3 uses_-it is non access modifier
// final variable- it is used to create constant variables( good practise is name of variable should be in UPPERCASE)
//final class-prevent inheritance
//final method-prevent method overwriting

//what is the difference between pubic class private class , public method and private method , pubilc variable and private variable ,public staitc method.

public class exp5 {
    interface Student {
        void displayGrades();

        void displayAttendance();
    }

    static class PG_Students implements Student {
        String name;
        double tmarks;
        int tattendance;
        PG_Students(String name, int totalmarks,int attendance){

            this.name = name;
            this.tmarks = totalmarks;
            this.tattendance=attendance;
        }

       public void displayGrades() {
            if (tmarks <= 33 && tmarks > 0) {
                System.out.println("Congratulations!! " + name + " you are having grade C");
            } else if (tmarks <= 60 && tmarks > 33) {
                System.out.println("Congratulations!! " + name + " you are having grade B");

            } else if (tmarks <= 100 && tmarks > 60) {
                System.out.println("Congratulations!! " + name + " you are having grade A");

            }

        }
        public void displayAttendance(){
            System.out.println("Hello!! "+name+" your total attendane is "+tattendance);
        }   


    }
    static class UG_Students implements Student {
        String name;
        double tmarks;
        int tattendance;
        UG_Students(String name, int totalmarks,int attendance){

            this.name = name;
            this.tmarks = totalmarks;
            this.tattendance=attendance;
        }

       public void displayGrades() {
            if (tmarks <= 33 && tmarks > 0) {
                System.out.println("Congratulations!! " + name + " you are having grade C");
            } else if (tmarks <= 60 && tmarks > 33) {
                System.out.println("Congratulations!! " + name + " you are having grade B");

            } else if (tmarks <= 100 && tmarks > 60) {
                System.out.println("Congratulations!! " + name + " you are having grade A");

            }

        }
        public void displayAttendance(){
            System.out.println("Hello!! "+name+" your total attendane is "+tattendance);
        }   


    }

    // class UG_studetns implements Student {

    // }

    public static void main(String[] args) {
        PG_Students us1=new PG_Students("Sumit", 74, 76);
        us1.displayAttendance();
        us1.displayGrades();
        System.out.println();
        UG_Students ps1=new UG_Students("Aman", 75, 85);
        ps1.displayAttendance();
        ps1.displayGrades();
        


    }
}
