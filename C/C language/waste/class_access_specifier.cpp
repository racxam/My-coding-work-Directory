//class is better than structure in real world scenrio.
// class can have data members(variables) and as well it can contain member function(fuctions)
// but structures can only have variable
// classes have security .. but structurs don't have
// in class members are private by default 
// in structurs variable are public by default
//structures stores in stack
//classes stores in heap
//structures are value type
// classes are reference type
// structures doesn't support inheritance 
// classes support inheritance
// member variable in class can't be initlized at starting
// member variables can be initlized in the class
#include<iostream>
using namespace std;
class Employee{
    private:
    int a,b,c;
    public:
    int d,e;
    void setData(int a, int b, int c);//declaration
    void getData(){
     cout<<"the value of a is "<<a<<endl;
     cout<<"the value of a is "<<b<<endl;
    cout<<"the value of a is "<<c<<endl;
    cout<<"the value of a is "<<d<<endl;
    cout<<"the value of a is "<<e<<endl;
    }


};

void Employee::setData(int a1, int b1, int c1){
    a=a1;
    b=b1;
    c=c1;
}




int main(){
Employee harry;
// harry.a=234;
harry.d=34;

harry.e=43;

harry.setData(1,2,3);
harry.getData();



    return 0;
}