#include<iostream>
using namespace std;
class employee{
    public:
string name;
int salary;
int age;




};
class read:public employee{
    public:
    void readData(){
    cout<<"Enter your name"<<endl;
    getline(cin,name);
    cout<<"Enter your salary"<<endl;
    cin>>salary;
    cout<<"Enter your age"<<endl;
    cin>>age;}

};
class print: public read{
    public:
    void printData(){
    cout<<"Name is: "<<name<<endl;
    cout<<"Salary is: "<<salary<<endl;
    cout<<"Age is: "<<age<<endl;
}

};

int main(){
    print obj;
    obj.readData();
    obj.printData();

   
}