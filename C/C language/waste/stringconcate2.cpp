#include<iostream>
using namespace std;
class con{
    public:
    string str;

    void GetStr()
    {
        cout<<"Enter the string one"<<endl;
        getline(cin,str);
        
    }
 con operator + (con str1){
    con temp;

    temp.str =str+str1.str;

    return (temp);
 }
 void disp(){
     cout<<"The concatinated string is "<<str<<endl;
 }

};
int main(){
con s1,s2,s3;
s1.GetStr();
s2.GetStr();
s3=s1+s2;
s3.disp();
    
    
    
return 0;
}