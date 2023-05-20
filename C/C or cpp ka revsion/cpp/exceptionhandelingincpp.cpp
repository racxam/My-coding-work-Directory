#include<iostream>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    try{
        if(b==0){
            throw b;
        }
        else{
            cout<<"The diving vlaue is: "<<a/b;
        }
    }
    catch(int c)
    {
        cout<<"We can't divide bcz the 0  is invovled here";
    }
    return 0;
}