#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int d;
    long lo;
    char ch;
    float fl;
    double dou;
    
  cin>>d>>lo>>ch>>fl>>dou;
  cout<<d<<endl;
  cout<<lo<<endl;
  cout<<ch<<endl;
  cout<<fixed<<setprecision(3)<<fl<<endl;
  cout<<fixed<<setprecision(9)<<dou<<endl;
    return 0;
}