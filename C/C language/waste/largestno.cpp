#include<iostream>
using namespace std;
 void swaper(int *a ,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b= temp;
}


void sorting(int arr[], int n)  
{  
    int i, j;  
    for (i = 0; i < n-1; i++)     { 
      
 
    for (j = 0; j < n-i-1; j++)  {
        if (arr[j] > arr[j+1])  {
            swaper(&arr[j], &arr[j+1]); } }}
}  
/*void printArray(int arr[], int size)  
{  
    int i;  
    for (i = 0; i < size; i++)  
        cout << arr[i] << " ";  
        cout << endl; 
}  
     */






int main(){
    int n,k;
    cout<<"--HERE WE WILL FIND THE Kth NO . LARGEST ELEMENT FROM ARRAY\n";
    cout<<"Enter the size of the array\n";
    cin>>n;
    int arr[n];
    cout<<"Now enter the array\n";
    cout<<"plz press enter after each element while giving input\n";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        cout<<arr[i];
    }
    
     sorting(arr, n);  
    
    
    cout<<"Enter the kth largest no. you want output of :\n";
    cin>>k;
    cout<<"the"<<k<<"th largest no. is "<<arr[n-k]<<endl;



    return 0;
}