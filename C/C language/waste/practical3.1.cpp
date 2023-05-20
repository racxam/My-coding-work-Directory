#include<iostream>
using namespace std;
#define MAX(x,y,z) ( x>y && x>z? x: (y>z?y:z) )

#define MIN(x,y,z) (x<y && x<z?x:(y<z?y:z))
int main(){

int x,y,z;
cout<<"Enter the 3 no's"<<endl;
cin>>x>>y>>z;
cout<<"The maximum of 3 no's is:"<<MAX(x,y,z)<<endl;
cout<<"The minimum of 3 no's is:"<<MIN(x,y,z)<<endl;
return 0;
}