#include<iostream>
using namespace std;
int maxint(int arr[], int n){
    int arru=arr[0],che;
    for(int i=1;i<n;i++){
        if(arru <arr[i]){

            arru=arr[i];
            che=i;
            
        }

    }


    return che ;
}



int main(){
cout<<"Enter how many numbers you wants to print in an array"<<endl;
int n;
cin>>n;
int arr[n];
cout<<"Enter the elements of the array one by one"<<endl;
for(int i=0;i<n;i++){
    cout<<"Enter for"<<"["<<i<<"]"<<"\t";
    cin>>arr[i];
}
for(int i=0;i<n;i++){
    cout<<"You entered for"<<"["<<i<<"]"<<"\t";
    cout<<arr[i]<<endl;
}

int z=maxint(arr,n);
cout<<"The largest no. is: "<<arr[z]<<" of index "<<"["<<z<<"]"<<endl;



    return 0;
}