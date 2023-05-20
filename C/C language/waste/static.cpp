#include<iostream>
using namespace std;

class emp
{
    int id ;
   static int count;
    public:
    void get_id(){
        cout<<"enter your id:"<<endl;
        cin>>id;
        count++;}
    void disp();
        
    

    
};
void emp :: disp(){
    cout<<"your id is :"<<id<<"with count"<<count<<endl;
}
int emp::count;

int main(){
    emp sumit,kishan,anuj;
    sumit.get_id();
    sumit.disp();

    sumit.get_id();
    sumit.disp();

    kishan.get_id();
    kishan.disp();

    anuj.get_id();
    anuj.disp();



    return 0;
}