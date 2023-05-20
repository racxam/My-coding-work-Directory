#include <iostream>

using namespace std;

int main()

{
    try {
        char r[56] ;
        cout<<"enter string"<<endl;
        cin>>r;

        throw r;
        cout<<"hi";
        
    }
    catch(string e){
        cout<<"Here's string: "<<e;
    }

        
}