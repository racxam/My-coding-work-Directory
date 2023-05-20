#include<iostream>
using namespace std;
class temp{
    static int x;
    public:
    static void set(int xx){
        x=xx;
    }
    void disp(){
        cout<<x;
    }
};
int temp::x=0;
int main(){
temp::set(22);
temp::disp();


    
    return 0;
}