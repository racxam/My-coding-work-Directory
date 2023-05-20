#include<iostream>
using namespace std;
// int checkP(int n){
//     int num,i;
// for( i=2;i<=(n/2);i++){
//     if(n/i==0){
//         num=1;
//         cout<<"yes";
//         break;
//     }
//     else{
//         num=0;
//     }

// }

//     return num;
// }
int main(){
    cout<<"Enter the no you wants to check is prime or not\n";
    int n,num=90;
    cin>>n;
    int d=n/2;
    // num = checkP(n);
    // cout<<num<<endl;
    for( int i=2;i<=d;i++){
    if(n/i==0){
        num=1;
        cout<<"yes";
        break;
       }
     else{
        num=0;
        cout<<"no";
     }

}





   if(num==0){
       cout<<"Yes it is prime\n";
   }
   else if(num==1){
       cout<<"It is not prime\n";
   }
   cout<<"Thank you\n";
    return 0;
}