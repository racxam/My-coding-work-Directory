#include <iostream>
using namespace std;
class load
{
public:
    int m=2;

friend void operator!(load );
   
  
};
 void operator!(load z)
    {
        z.m = !z.m;
        cout<<z.m;
    }
int main()
{   load obj;
     !(obj);


    
    return 0;
}