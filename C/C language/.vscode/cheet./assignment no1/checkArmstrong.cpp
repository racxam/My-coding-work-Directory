// ---THIS PROGRAM IS FOR CHECKIGN ARMSTRONG NO---
#include<iostream>
#include<cmath>
using namespace std;
int main(){
    cout<<"Enter the no you have doubt if it is armstronge no or not"<<endl;
    int n,add=0;
    cin>>n;
int orginalN=n;
    while (n>0)

    {
        int ld=n%10;
        add= add+pow(ld,3);
        n=n/10;

    }

if(add==orginalN){
    cout<<"This is Armstrong no\n";

}
else{
    cout<<"No dude!! It's not Armstronge no.\n";
}
cout<<"---THANKING YOU---"<<endl;
    return 0;
}
