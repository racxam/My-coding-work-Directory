#include <iostream>
using namespace std;

void func(int a){
    cout<<"I am first func"<<a<<endl;
}
template<class T>

void func(T a){
    cout<<"I am Templetaised first func"<<a<<endl;
}
int main()
{
    func('a');
    return 0;
}