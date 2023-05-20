// Design , Develop and implement a program in c for the following stack applications
// Evalation of suffix/ postfix with digit operands and operators like +-*/%
// Solving tower of hanoi problem with n disks
#include<iostream>
using namespace std;
void TOH(int n, char source, char helper, char destination){
    if(n==0){
        return;
    }
    TOH(n-1,'A','C','B');
    cout<<"Moved Disk "<<n<<" from "<< source<<" to "<<destination<<endl ;
    cout<<"Moved Disk "<<n<<" from A to C "<<endl;

        TOH(n-1,'B','C','A');
    
     }
int main(){
    TOH(3,'A','B','C');
    return 0;
}