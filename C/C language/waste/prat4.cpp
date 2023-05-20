// WAP to create database of the following items: Name of the student (String), Roll number of the student (int), Height of the student (cm), Weight of the student (kg/gms)
// 1) Create a Constructor to initialize values
// 2) Create display () function to display the details
// 3) Illustrate the use of copy constructor
// 4) Also implement the concept of destructor.           

#include<iostream>
using namespace std;
class clg{
    public:
    string name;
    int roll;
    int height;
    int weigh;

   clg(string n, int r, int h, int w){
       name= n;
       roll=r;
       height=h;
       weigh=w;
       
   }
   void disp(){
       cout<<"The name is:"<<name<<endl;
       cout<<"The Roll no. is:"<<roll<<endl;
       cout<<"The height is :"<<height<<endl;
       cout<<"The weight is:"<<weigh<<endl;
   }
  ~clg(){
      cout<<"The destructor is called:"<<endl;
  }
};


int main(){
    string name1;
    int roll,height,weigh;
cout<<"enter the name:"<<endl;
       cin>>name1;
       cout<<"enter the roll:"<<endl;
       cin>>roll;
       cout<<"enter the height"<<endl;
       cin>>height;
       cout<<"enter the weigh"<<endl;
       cin>>weigh;
clg c1(name1,roll,height,weigh);
clg c2=c1;
c2.disp();

return 0;
}