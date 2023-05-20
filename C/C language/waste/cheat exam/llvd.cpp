#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
       if(arr[i]>40){
         if(arr[i]%5!=0){
             int r=arr[i]/10;
             int l=arr[i]%10;
             if(l>5){
                int r1=(r+1)*10;
                if(r1-arr[i]<3){
                    arr[i]=r1;
                }
                
             }
             else{
               int r2=((2*r)+1)*5;
               if(r2-arr[i]<3){
                    arr[i]=r2;
             }
             
             
         }
         
           
       }
       for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }

    
    
    
    return 0;
}}}