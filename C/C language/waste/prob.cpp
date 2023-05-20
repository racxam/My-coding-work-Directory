#include <iostream>
#include <string>
using namespace std;
class A{
	mutable int a;
public:
	A(){
		cout<<"Default constructor called\n";
	}
	A(const A& a){
		cout<<"Copy Constructor called\n";
	}
};
int main()
{
	A obj;
	A a1 = obj;
	A a2(obj);
}