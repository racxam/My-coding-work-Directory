//This program is to reverse any given no;
#include<iostream>
using namespace std;
int main(){
    int n,rev=0;

    cout<<"Enter any no you want to reverse\n";
    cin>>n;
    while (n>0)
    { 
        int ld=n%10;
        rev= ld+rev*10;
        n= n/10;




    }
    cout<<"\n The reverse no is: "<<rev<<endl;
    
    
    return 0;
}