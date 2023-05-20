#include<iostream>
using namespace std;

class complex;

class Calculator{
    public:
    int add(int a, int b){
        return (a+b);
    }
    int sumRealComplex(complex , complex );
       
    

};

class complex{
    int a,b;
    friend int Calculator::sumRealComplex(complex o1, complex o2);
    public:
    void setNumber(int a1, int a2)
    {
        a=a1;
        b=a2;

    }
    void printNumber(){
        cout<<"Your number is "<<a<<"+"<<b<<"i"<<endl;
    }

};

int Calculator::sumRealComplex(complex o1,complex o2){
    return (o1.a+o2.a);
}


int main(){










    return 0;
}