#include<iostream>
using namespace std;
#define PI 3.14

void area(double r){
   cout<<"the area of circle is "<<(PI*r*r)<<endl;

   
}
void area(int l,int b){
   cout<<"The area of the rectangle is :"<<l*b<<endl;
}
void area(int a){
   cout<<"The area of the square is :"<<a*a<<endl;
}


int main(){
 area(4.5);
 area(4,5);
 area(5);
   return 0;
}