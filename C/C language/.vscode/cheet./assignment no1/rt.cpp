#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Degree{
    public:
    void getDegree(){
        
        cout<<"I got a degree"<<endl;
    }
};
class Undergraduate:public Degree{
    public:
    void getDegree(){
        cout<<"I am an Undergraduate"<<endl;
    }
    
};
class Postgraduate:public Degree{
    public:
    void getDegree(){
        cout<<"I am an Postgraduate"<<endl;
    }
    
};

int main() {
    
Degree obj;
    obj.getDegree();
Undergraduate obj1;
    obj1.getDegree();
Postgraduate obj2;
    obj2.getDegree();
    return 0;
}

