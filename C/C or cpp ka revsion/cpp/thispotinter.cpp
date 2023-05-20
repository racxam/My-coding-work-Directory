/* This pointer
objects of a class normally uses a inviual per copy of data members and uses the sigle copy of  mem funciton throught the program.
so to match the right funciton call compiler uses the this pointer 
it is r value not l value
1.
this pointer is used when we have same name of data member and local var in funcition
2.this pointer is used to invoke chain funciton calls by returning reference we can all many function in same line by just using dot .
3.this pointer is not used by static mem funciton as static mem function is called without obj.
4.this pointer is used to send the referce of the calling object obviously to chain the function.

*/
#include<iostream>
using namespace std;
class sum{
    public:
    int a;
    int b;
    public:
    sum(int a,int b){
        this->a=a;
        this->b=b;

    }
    sum& setA(int x){  //style of passing reference of the object using this pointer
        a=x;
        return *this;}
    sum& setB(int y){
        b=y;
        return *this;}
    void print(){
        cout<<"The value of a is : "<<a<<"and the value of b is: "<<b<<endl;
    }
};
int main(){
    sum o(3,4);
    o.print();
    o.setA(44).setB(33);    //chain funciton calling
    o.print();
    
    return 0;

}

// In cpp overriding if wants to override a fuction in derived class to avoid silly mistakes like having same name of the function and using different parameters onc can use the '' override '' keyword to avoid confusion and silly mistakes
//
