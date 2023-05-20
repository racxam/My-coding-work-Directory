#include<iostream>
using namespace std;



int main(){
    int row , column;
    
cout<<"ENTER THE NO. OF ROWS OF MATRIX"<<endl;
cin>>row;
cout<<"ENTER THE NO. OF COLUMNS OF MATRIX"<<endl;
cin>>column;
cout<<"Enter Elements of matrix"<<endl;
int arr[row][column];
for(int i=0;i<row;i++){
    for(int j=0;i<column;j++){
    cout<<"Enter for index no.\t"<<i << j<<endl;
    cin>>arr[i][j];


    }
}
int base;
cout<<"Enter the base address"<<endl;
cin>>base;
cout<<arr"\t"<<arr+1<<endl






    return 0;
}