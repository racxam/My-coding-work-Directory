#include<iostream>
using namespace std;
class fun{
float a;
float b;
float c;
float d;

public:
inline int multi(float x,float y){
    c=x*y;
    return 0;
}

inline int  divison(float u,float v){
    d=u/v;
    return 0;
}

inline void printfunc(){
    cout<<"the multliplication of the two float no's is :"<<c<<endl;
    cout<<"the division of the two float no's is :"<<d<<endl;
}




};





int main(){
    fun a;
    float m,n;
    cout<<"Enter the first float no."<<endl;
    cin>>m;
    cout<<"Enter the second float no."<<endl;
    cin>>n;
    a.multi(m,n);
    a.divison(m,n);
    a.printfunc();


    return 0;
}