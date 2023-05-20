#include<iostream>
using namespace std;
class complex{
    public:
    int real,imag;
    void getData(){
        cout<<"Enter the real value"<<endl;
        cin>>real;
        cout<<"Enter the imaginary value"<<endl;
        cin>>imag;
    }
    complex operator-(complex obj){
        complex temp;
        temp.real=real-obj.real;
        temp.imag=imag-obj.imag;
        return(temp);
    }
    void display(){
        cout<<real<<"+i"<<"("<<imag<<")"<<endl;
    }
};

int main(){
complex c1,c2,c3;
c1.getData();
c2.getData();
c3=c1-c2;
cout<<"Result of substraction is: "<<endl;
c3.display();
return 0;
}