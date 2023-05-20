#include<iostream>
using namespace std;
class B;
class A{
    private:
        int numA;

        friend class B;
    public:
           A():numA(12){

           }
};
class B{
    int numB;
    public:
        B()numB(1){

        }
    int add()
{
    A objA;
    return objA.numA+numB;

}
};
int main(){
    B objectB;
    cout << "Sum: " << objectB.add();
    return 0;
}