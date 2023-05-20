#include<iostream>
using namespace std;
// inline int product(int a, int b){
    // return a*b;// dont use inline keyword while using the static variable
     
// }
float moneyRecive(int money , float factor=1.04){// factor =1.04 is default arguments
    return money*factor;
}

// we should not use the inline keyword in loops, recursion, switch case , static variables
// to make the function inline we just request the compiler ..it may accpect or not ...because of the optimizationo of the program

int main(){
    // int a,b;
    // cout<<"enter the value of the a and b\n";
    // cin>>a>>b;
    int money=100000;
    // cout<<"the product of a and b is :"<<product(a,b)<<endl;
    cout<<"for"<<money<<"you will recieve after one month is:"<<moneyRecive(money)<<endl;
    cout<<"for VIP "<<"money <<you will recieve after one month is:"<<moneyRecive(money,1.10);
    return 0;
    }
   