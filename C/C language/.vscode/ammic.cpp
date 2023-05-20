#include<iostream>
using namespace std;
 
class Base
{
public:
    virtual void show() = 0;
    void disp(){
        cout<<"i am a here";

    }};
 
int main(void)
{

    Base *bp;
    bp->disp();
    return 0;
}