#include<iostream>
#define pie 3.14
using namespace std;

class cicle{
    public:
int peri;
int ar;
int rad=8;


void area(){
    // rad=8;
   cout<<"area of the cicle is :"<<(pie*rad*rad)<<endl;

}
void perimeter();


};
void cicle::perimeter(){
    // rad=8;
    cout<<"perimeter of the cicle is:"<<(2*pie*rad)<<endl;
}



int main(){

    cicle sumit;
    sumit.area();
    sumit.perimeter();
    return 0;
}