#include<iostream>
using namespace std;
int main(){
    cout<<"Enter the no of elements of array"<<endl;
    int n;
    cin>>n;

    int arr[n];
    cout<<"Enter the elementes of array"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"The previous array is:\n"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<"\n\nAfter Reversing Arrary is:\n"<<endl;
    for(int i=n-1;i>=0;i--){
        cout<<arr[i]<<" ";
    }
    
    return 0;
}