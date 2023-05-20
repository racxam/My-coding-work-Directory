/* static funciton can be called without creating an object
static data members belongs to the class not to the indiviual object
static funciton can only use the static mem variables and can be overloaded
we can initlise the pvt static DM outside of the class but not the non static one
we can't initlise the static variable using constructor
they don't have this pointer
static funciton can't be virtual
static func can't be const volatile ,or const volatile
const data members are static by default

*/

#include<iostream>
using namespace std;
  
class GfG
{
   public:
     static int i;
      
     GfG()
     {
        // Do nothing
     };
};
  
int main()
{
  GfG obj1;
  GfG obj2;
  obj1.i =2;
  obj2.i = 3;
    
  // prints value of i
  cout << obj1.i<<" "<<obj2.i;   
}