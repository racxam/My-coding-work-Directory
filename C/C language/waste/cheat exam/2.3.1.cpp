#include<iostream>
using namespace std;
class Rec
{
   string name;
   int age;
   public:
       Rec() {};
       Rec(string n,int a): name(n),age(a) {}
       void showData()
       {
           cout<<name<<"==="<<age<<endl;
       }
       Rec eldest(Rec obj)
       {
           return (obj.age>age)? obj: *this;
       }
};
int main()
{  
   Rec ob[3]={Rec("Sumit",21),Rec("Kishan",50),Rec("Rishi",30)};
   Rec res;
   for(int i=0;i<2;i++)
       res = ob[i].eldest(ob[i+1]);
   res.showData();
   return 0;  
}
