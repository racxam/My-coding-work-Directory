#include<iostream>
using namespace std;
class abc{
    public:
    static int a;
   static void inc(){
       a++;
   }
};
int abc::a=0;
int main(){
    abc z;
    cout<<"the value of the a="<<z.a<<endl;
    z.inc();
    cout<<"the value of a after calling ="<<z.a<<endl;
    return 0;
}