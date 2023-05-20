// Q1:Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of the Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating the object of the Student class.
 #include<iostream>
 #include<cstring>
 using namespace std;
 class Student{
     string str;
     string str3="Unknown";

     public:
     Student(){
         str=str3;

     }
     Student(string st){
         str=st;
         
     }
     void disp(){
        //  strcpy(str2,str);
         cout<<"The name of the student is: "<<str;
     }
 };
 int main(){
// Student obj("sumit");
Student obj;
obj.disp();



     return 0;
 }