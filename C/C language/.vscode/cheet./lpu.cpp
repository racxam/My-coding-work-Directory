#include<iostream>
using namespace std;
class base{
    public:
    int x,y;
    public:
    base(int i=0,int j=0):x(i),y(j){}

};
class der:public base{
    public:

    void print(){
        cout<<x<<y;
    }
};

int main(){
der q;
q.print();

}