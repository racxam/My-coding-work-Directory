#include<iostream>
using namespace std;
class cool{
    public:
    int one;
    
    private:
    
    float two;
    char three;


    public:
    void func(){
    two=7.5;
    three= 's';
    one=33;
    cout<<"float is :"<<two<<endl<<"char is:"<<three<<endl<<"int is:"<<one<<endl;
    };
};
int main(){
    cool boy;
    boy.one=45;
    
    boy.func();
}