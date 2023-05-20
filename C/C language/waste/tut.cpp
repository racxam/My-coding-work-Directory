#include <iostream>

using namespace std;
class Box
{ public:
 int a=10;
 int b;
 Box( int b)//parametrized constructor
 {
   cout<<b<<endl;
 }
};

int main()
{ Box x(10),y(12);
  
  
  return 0;
}
