#include<iostream>
using namespace std;
int main(){
    cout<<"Here is the array such that arr[i]=i\n";
    cout<<"Enter the no of terms in array\n";
    int n;
    cin>>n;
    int arr[n];

    for(int i=0;i<n;i++){
        arr[i]=i+1;
        cout<<arr[i]<<endl;
    }
    return 0;
}