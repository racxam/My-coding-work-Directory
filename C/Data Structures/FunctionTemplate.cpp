#include<iostream>
using namespace std;
template<class T1, class T2>

float Av(T1 a,T2 b){
    float ave;
    ave= (a+b)/2.0;
    return ave;

}
int main()
{
    float v=Av(4.5,2.5);
    cout<<v<<endl;
    printf("Average is: %f", v);

   
 return 0;
}