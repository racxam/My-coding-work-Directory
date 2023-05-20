#include<iostream>
using namespace std;
class abc{
    public:
    int a,b,c;
    abc(){
        a=35;
        cout<<a<<endl;
    }
    abc(int x){
       
        b=x;
        cout<<b<<endl;;
    }
    abc(int x , int y){
       c=x*y;
       cout<<c; 
    }

};
int main(){
    abc u,v(10),z(11,11);
    return 0;
}