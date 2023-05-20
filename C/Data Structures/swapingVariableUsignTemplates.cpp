#include<iostream>
using namespace std;
template<class T1,class T2>
void swap(T1* a, T2 *b ){
    T1 temp;
    temp=*a;
    *a=*b;
    *b=temp;
    }
int main()
{    float a,b;
    cout<<"Enter the value of A and B"<<endl;
    cin>>a;
    cin>>b;
    cout<<"Before swaping"<<endl;
    cout<<"THe value of a is:"<<a<<endl;
    cout<<"THe value of b is:"<<b<<endl;
    swap(&a,&b);
    cout<<"After swaping"<<endl;
    cout<<"THe value of a is:"<<a<<endl;
    cout<<"THe value of b is:"<<b<<endl;
 return 0;
}