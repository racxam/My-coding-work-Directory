#include<iostream>
using namespace std;
int main(){
int row=0 , column=0;
    
cout<<"ENTER THE NO. OF ROWS OF MATRIX"<<endl;
cin>>row;

cout<<"ENTER THE NO. OF COLUMNS OF MATRIX"<<endl;
cin>>column;
cout<<"Enter Elements of matrix"<<endl;

int arr[row][column];

for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
    cout<<"Enter for index no.\t"<<i<<j<<endl;
    cin>>arr[i][j];}}
int base,size;
cout<<"Enter the base address"<<endl;
cin>>base;

cout<<"Enter the size of element that you are inputting in an array"<<endl;
cin>>size;
int m,n;

cout<<"enter the first no. of index you want adddress of "<<endl;
cin>>m;

cout<<"enter the 2nd of index you want adddress of "<<endl;
cin>>n;

int rank= (m+1)*(n+1);
cout<<"accroding to the base address the address of arr--"<<m<<n<<" is "<<(base+(size*(rank-1)))<<endl;;
return 0;
}