#include<iostream>
using namespace std;
void prod(int a, int b){
    if(b==0){
        throw  "b will o ";}
        else{
          cout<<"product" <<a*b<<endl;
        }
    }

int main(){
try{
    prod(9,2);}
    catch(const char*s){
        cout<<s;
    }
}
