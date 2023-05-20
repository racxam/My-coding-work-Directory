
//------BINARY NO CHECKER AND DOING IT'S ONE'S COMPLIMENT


#include<iostream>
using namespace std;

class binary{
public:
int i,j;
string s;
void read();
void chkBin();
void dispBin();
void oneCompBin();

};
void binary::read(){
    cout<<"Enter a binary no."<<endl;
    cin>>s;
   }
void binary ::chkBin(){
    for(int i=0;i<s.length();i++){
        if(s.at(i)!='0' && s.at(i)!='1'){
            cout<<"This is incorrect binary number"<<endl;
            exit(0);
        }
       
       }}
void binary::dispBin(){
    for(int i=0;i<s.length();i++){
        cout<<s.at(i);
    }

}
void binary::oneCompBin(){
    for(int i=0;i<s.length();i++){
        if(s.at(i)=='0'){
            s.at(i)='1';
        }
        else if(s.at(i)=='1'){
            s.at(i)='0';
        }
    }
}




int main(){

    binary A;
    A.read();
     A.chkBin();
     A.dispBin();
     cout<<endl;
     A.oneCompBin();
     A.dispBin();

    return 0;

}