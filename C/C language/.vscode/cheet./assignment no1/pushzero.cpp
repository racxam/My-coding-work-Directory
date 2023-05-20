#include<iostream>
using namespace std;
void push(int arr[],int n){
    int a=0;
    
    int brr[n];

    for(int i=0;i<n;i++){
        if(arr[i]!=0){
          brr[a]=arr[i];
          a++;


        }

        
    }
    for(int i=0;i<(n-(a-1));i++){
        brr[a]=0;
        a++;
        
    }
    
 
 for(int i=0;i<n;i++){
       cout<<brr[i]<<" ";
    }

}
int main(){
    cout<<"This is a program to pushing all zeros to end\n";
    cout<<"Enter the no of elements in array\n";
    int n;
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];

    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }
    cout<<endl<<endl;
    push(arr,n);
    
   
    
    

    return 0;
}