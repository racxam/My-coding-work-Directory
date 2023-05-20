#include <iostream>
#include<string>

using namespace std;
class box{
    int cap;
    public:
    box(){};
    box(double cap){
        this->cap=cap;
    }
};

int main()
{
    box b1(10);
    box b2= box(14);
    if(b1==b2){
        cout<<"equal";
    }
    else{
        cout<<"not";
    }

    

    return 0;
}
