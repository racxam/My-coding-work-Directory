#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    int s,t,a,b,m,n;
    int c=0,c1=0;

     cin>>s;

     cin>>t;

     cin>>a;


     cin>>b;

     cin>>m;

     cin>>n;
    int arr[m];
    int arr2[n];
    for(int i=0;i<m;i++){


        cin>>arr[i];
    }

for(int j=0;j<n;j++){


        cin>>arr2[j];
    }



    for(int i=0;i<m;i++){
 
      if((a+arr[i])>=s&&(a+arr[i])<=t){
         c++;
        }
    }
     for(int j=0;j<n;j++){

    if((b+arr2[j])>=s&&(b+arr2[j])<=t){
         c1++;
        }
    }
    cout<<c<<endl;
    cout<<c1<<endl;
    
    return 0;
}