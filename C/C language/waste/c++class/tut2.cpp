#include<iostream>
using namespace std;

namespace one{
    
    namespace two{// here we have the nested namespace 
}

}

int main(){


    cout<<one::two::var;//here how we use the nested namespace
    
}