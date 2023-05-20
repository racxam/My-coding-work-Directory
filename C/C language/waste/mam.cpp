#include<iostream>
using namespace std;
class abc{
public:
int ram=90;
void inc(){

 cout<<ram<<endl;
    
}};



int main(){
    abc x;
    cout<<"the required value is:"<<x.ram<<endl;
    
    x.inc();
    x.inc();
     x.inc();
    }