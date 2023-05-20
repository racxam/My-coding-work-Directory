#include<iostream>
using namespace std;
int main(){
    cout<<"--THIS IS ONLY VALID TILL 0 TO 255"<<endl;
    cout<<"Enter the Decimal no you wants to convert into Binary\n";
    int n;
    cin>>n;
    int count=1;

    int arr[8];
    for(int i =0 ;i<8;i++){
        arr[i]=0;
    }

    int i=0;
   while(n>0){
      arr[i]=n%2;
      n=n/2;

     i++;
   }
for(int j=i-1;j>=0 ;j--){
cout<<arr[j]<<" ";
}
 
    return 0;
}