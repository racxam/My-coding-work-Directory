#include<iostream>
using namespace std;
class abc{
    public:
    static int x;
    void inc(){
        cout<<x<<endl;
        x++;
    };
    
};
int abc::x=0;
int main(){
 abc z[5];
 for(int i=0;i<5;i++)
      z[i].inc();

    return 0;

}
