#include<iostream>
using namespace std;

    class A{
        public:
        int x;
    public:
A(){
    cout<<"Enter the value of x"<<endl;
    cin>>x;
    }
    };
class B : public A
{int y;
public:
void add(int y1){
    int y=y1;
    int addition= x+y1;
    cout<<"the addition is"<<addition<<endl;

}

};
class C:public A{
int y;
public:
void multi(int y1){
    int y= y1;
    cout<<"the multiplication is "<<x*y1<<endl;
}
};
   
int main(){

   B b;
//    b.getData();
   b.add(6);
   C c;
//    c.getData();
   c.multi(12); 




}