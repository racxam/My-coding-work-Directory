// WAP to read the class object of student info such as name, 
// age and roll no from the keyboard and to store them on a specified
//  file using read() and write() functions. Again the same file is opened 
//  for reading and displaying the contents of the file on the screen.
#include<iostream>
#include<fstream>
using namespace std;

class student{
    public:
string name;
int age, rn;
void get(){
    cout<<"Enter the name";
    getline(cin,name);
    cout<<"Enter the age";
    cin>>age;
}
void put(){
    cout<<"The Student name is: "<<name<<endl;
    cout<<"The Age is: "<<age;
}
};
 int main(){
     student obj;
     ofstream get;
     get.open("chintu.txt",ios::out);
     if(!get){
         cout<<"Opps!! There is an error in creating file"<<endl;
        return 0;
     }
     cout<<"file created successfully"<<endl;
     obj.get();
     get.write((char*)&obj,sizeof(obj));
     get.close();
      ifstream red;
      red.open("chintu.txt",ios::in);
      if(!red){
           cout<<"Opps there is an error in file opening"<<endl;
           return 0;
      }
      red.read((char*)&obj,sizeof(obj));
      obj.put();
      red.close();


    

     return 0;
 }
