#include<iostream>
using namespace std;
void fibo(int n){
    int a=0,b=1,num=0;
    
    
    for(int i=0;i<(n);i++){
        if(i<=1){
            cout<<i<<" ";
        }
        else if(i>1){
            num= a+b;
            cout<<" "<<num<<" ";
            a=b;
            b=num;
            
        }
    
        
    }

}

int main(){
    int n;
    cout<<"Enter the no for fibonaacci series";
    cin>>n;
    fibo(n);


    return 0;
}