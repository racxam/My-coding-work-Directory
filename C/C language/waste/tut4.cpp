#include<iostream>
#define pie 3.14
using namespace std;
class circle{
    public:
    int peri;
    int ar;
    int radius;
void perimeter();


void area(){
    radius=7;
  ar=pie*radius*radius;
  cout<<"the area of the circle is :"<<ar<<endl;

};
};
void circle::perimeter(){
    radius=7;
    peri=2*pie*radius;
    cout<<"the perimeter of the circle is :"<<peri<<endl;}
int main(){
    circle sumit;
    sumit.perimeter();
    sumit.area();
}