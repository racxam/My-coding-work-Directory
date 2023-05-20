//EXAMPLE OF MULTIPLE INHERITANCE

#include<iostream>
using namespace std;
class Vechicle_names{
    public:
    string name1;
    string name2;
    string name3;
    void readName(){
        cout<<"enter the first vechine name:"<<endl;
        getline(cin,name1);
        cout<<"enter the second vechine name:"<<endl;
        getline (cin,name2);
        cout<<"enter the third vechine name:"<<endl;
        getline (cin,name3);
    }
};
class Vechicle_speed{
    public:
    int s1;
    int s2,s3;
    void GetSpeed(){
        cout<<"Enter the speed of first vechile"<<endl;
        cin>>s1;
        cout<<"Enter the speed of second vechile"<<endl;
        cin>>s2;
        cout<<"Enter the speed of third vechile"<<endl;
        cin>>s3;
    }
};

class showSpeed: public Vechicle_names,public Vechicle_speed{
    public:
    void show(){
    cout<<"Speed of "<<name1<<" is: "<<s1<<endl;
    cout<<"Speed of "<<name2<<" is: "<<s2<<endl;
    cout<<"Speed of "<<name3<<" is: "<<s3<<endl;}
};
int main(){
showSpeed obj;
obj.readName;
obj.GetSpeed();

    return 0;
}