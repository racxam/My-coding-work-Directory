#include<iostream>
using namespace std;
class use{
    string name,no;

    public:
    void getData(){
        cout<<"Enter your name:"<<endl;
        getline(cin,name);
        cout<<"Enter your mobile no."<<endl;
        cin>>no;
    }
    void putData(){
        cout<<"\nyour name:"<<name<<endl;

        cout<<"Enter your mobile no."<<no<<endl;
    }
};
int main(){
 use obj,*obj1;
 obj1=&obj;
 obj1->getData();
 obj1->putData();



    return 0;
}