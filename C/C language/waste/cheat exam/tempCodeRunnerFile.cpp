#include<iostream>
using namespace std;


int main(){
    int x1,v1,x2,v2;
    double x;
    int r=89;
    cin>>x1>>v1>>x2>>v2;
    if(x1<x2&&v1<v2){
        cout<<"NO";
    }

    
    
    x=(x2-x1)/(v1-v2);

int X =int(x);
    

    
   
 if(  x>0 && (x-X)<=0){

     cout<<"YES";

 }
 else{
     cout<<"NO";
 }

    return 0;
}
