// Create a class student having student uid and
//  getnumber(),putnumber() as member functions to get the values
//  and display it. Derive a class test having marks 
// in different subjects and getmarks() and putmarks() 
// as member functions to get and display the values. 
// Derive another class sports from student class having
//  sports score and getscore(), putscore()
//  as member functions to get and display the values. 
// Derive a class result from test
// and sports class and define a function display() to calculate total marks. 
// Implement it with the object of result class. If it gives any error,
//  resolve it by adding the required functionality.
#include<iostream>
using namespace std;
class Student{
    int uid,num;
    public:
    void getnumber(){
        cout<<"enter the number "<<endl;
        cin>>num;
    }
    void putnumber(){
        cout<<"The entered number is:"<<num<<endl;
    
    }
};
class Test:public Student{
int Cmark,DEmark,Mmark;
public:
void getmarks(){
    cout<<"Enter the marks in CPP"<<endl;
    cin>>Cmark;
    cout<<"Enter the marks in DE"<<endl;
    cin>>DEmark;
    cout<<"Enter the marks in Maths "<<endl;
    cin>>Mmark;
}
void putmarks(){
    cout<<"the marks in CPP"<<Cmark<<endl;

    cout<<"the marks in DE"<<DEmark<<endl;

    cout<<"the marks in Maths "<<Mmark<<endl;

}

};
class Sports:public Student{
int sportScore;
void getScore(){
    cout<<"Enter the sport score"<<endl;
    cin>>sportScore;
}
void putScore(){
    cout<<"The sport Score is:"<<sportScore<<endl;
}
};


int main(){
    return 0;
}