#include<iostream>
using namespace std;
class cl2;
class cl1{
int x=12;
public:
void show1(){
    cout<<"The value of the cl1's variable x is:"<<x<<endl;}
friend void swap(cl1 *x, cl2*y);
};
class cl2{

int y=90;
public:
void show2(){
cout<<"The value of the cl1's variable y is:"<<y<<endl;
}
friend void swap(cl1 *x, cl2*y);
};
void swap(cl1 *x, cl2*y){
    int temp;
    temp = x->x;
    x->x = y->y;
    y->y = temp;
}
int main(){
cl1 a;
a.show1();
cl2 b;
b.show2();
swap(&a, &b);
cout<<endl<<"after swap"<<endl;
a.show1();
b.show2();



    return 0;
}