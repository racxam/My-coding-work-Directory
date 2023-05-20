#include<iostream>
using namespace std;
class abc{
    private:
    int num1,num2;
    public:
    void getdata(int a,int b){
        num1=a;
        num2=b;
    }
    
    
    friend void sum(abc);

    };

void sum(abc obj){
    
    cout<<"the required summation is="<<obj.num1+obj.num2;
};
int main(){
    abc abc;
    int c,d;
    cin>>c>>d;
    abc.getdata(c,d);
    sum(abc);
    return 0;
}