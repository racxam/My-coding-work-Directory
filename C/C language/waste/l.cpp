// Create a class called employee with the following details as variables within it.
// 1. Name of the employee (string)
// 2. Age (int)
// 3. Designation (string)
// 4. Salary (double)
// Write a program to create array of objects for the same to access these. 
// Also, make use of member functions to accept values and print the name, age, 
// designation and salary.         

#include<iostream>
#include<string.h>
using namespace std;
class employee{
private:
string employee_name;
int age;
string designation;
double salary;
public:
void printData(){
    cout<<"Enter your Full Name\n";
    getline(cin,employee_name);
    cout<<"Enter your age in intergers"<<endl;
    cin>>age;
    cout<<"Enter your designation"<<endl;
    getline(cin,designation);
    cout<<"Enter your salary"<<endl<<endl;
    cin>>salary;
    
}


};
int main(){
    cout<<"How many employees want to submit their details"<<endl;
    int n;
    cin>>n;
    
employee arr[n];
for(int i=0 ;i<n;i++){
    cout<<"Employee no."<<(i+1)<<" plz enter your details"<<endl<<endl;
    arr[i].printData();

}




    return 0;
}