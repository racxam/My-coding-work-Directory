// define a function outside and inside of the class
#include<iostream>
using namespace std;
class multi{
    public:
    int a ; 
    int b;
    public:
    void getdata();//outside of the class


    void disp()// inside of the class
    {
        cout<<"The multiplicaion of "<<a<<" and "<<b<<" is "<< a*b<<endl;
    }
};
  void multi:: getdata(){
        cout<<"enter first no."<<endl;
        cin>>a;
        cout<<"enter second no."<<endl;
        cin>>b;
    }
int main(){
    multi obj;
    obj.getdata();
    obj.disp();

 
    return 0;
}