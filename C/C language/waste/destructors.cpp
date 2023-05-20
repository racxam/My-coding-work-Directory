#include <iostream>
using namespace std;
class Hello{
public:
  //Constructor
  Hello(int a)// parametrized 
  {
    cout<<"Constructor is called"<<endl;
  }
  //Destructor
  ~Hello( )//need not be parametrized
  {
    cout<<"Destructor is called"<<endl;
   }
   //Member function
   void display(){
     cout<<"Hello World!"<<endl;
   }
};
int main(){
   //Object created
   Hello obj(1),obj1(2);
   //Member function called
   obj.display();
   obj1.display();
   return 0;
}