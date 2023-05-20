//-------FUNCTION OVERLOADING----------



#include<iostream>
using namespace std;
int add(int a, int b){
    cout<<"using function with two arguments\n";
    return a+b;

}
int add(int a, int b,int c){
    cout<<"using function with three arguments\n";
    return a+b+c;

}



int main(){
int a,b,c;
cin>>a>>b>>c;

cout<<"the 3 way addn of a+B+c is:"<<add(a,b,c)<<endl;
cout<<"the 2 way addn of a+B is:"<<add(a,b)<<endl;













    return 0;
}