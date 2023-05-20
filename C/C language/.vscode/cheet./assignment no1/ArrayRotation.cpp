#include<iostream>
using namespace std;
int main(){
    cout<<"Enter the no of elements of array\n";
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Array before reversing by one unit"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    int brr[n];
    for(int i=0;i<n;i++){
        brr[i]=arr[i];
    }
    cout<<"\nArray after reversing by one unit"<<endl;
    for(int i=0;i<n;i++){
        if(n>=(i+2)){

        brr[i]=arr[(n)-(i+2)];
        }
        else{
        brr[i]=arr[(i+2)-(n)];

        }
    }

    for(int i=0;i<n;i++){
        cout<<brr[i]<<" ";
    }
  
    

    return 0;
}