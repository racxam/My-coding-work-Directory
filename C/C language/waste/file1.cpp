
#include<iostream>
using namespace std;

class education

{

char name[10];

public :
 disp()

{

cout<<”Its education system”;

}

class school:public education

{

public: void dsip()

{

cout<<”Its school education system”;

}

};

void main()

{

school s;

s.disp();

}

}