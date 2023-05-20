#include<iostream>
using namespace std;

class base{
    public:
    int a,b;
    void getdata(){
        cout<<"Enter the no. you want addition of:"<<endl;
        cin>>a>>b;
    }

};
class derive: public base{
public:

void add(){
    cout<<"the addition is :"<<a+b;
}



 };

int main(){
derive x;
x.getdata();
x.add();




    return 0;
}