#include<iostream>
#include<iomanip>
using namespace std;
int main(){
double f=3.14156;
cout<<fixed<<setprecision(3)<<f<<endl;
cout<<setw(3)<<"hi"<<endl;
cout<<"hello\n";
cout<<setfill('@')<<setw(5)<<"hi"<<endl;




    return 0;
}