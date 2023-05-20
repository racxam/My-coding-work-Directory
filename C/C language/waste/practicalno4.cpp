#include<iostream>
using namespace std;

    class rect{
        int lenth;
        int width;
        int area1;
public:

        rect(){
        lenth =5;
        width =3;

        cout<<"the length is"<<lenth<<endl;
        cout<<"the width is"<<width;
            }
       rect(int x, int y){
          lenth = x;
          width = y;
        cout<<"the length is"<<lenth<<endl;
        cout<<"the width is"<<width<<endl;
       }
        void area(){

      
            area1=lenth*width;
        }
        void display(){
            cout<<"\nThe area of the rectangle is :"<<area1<<endl;;
        }
        ~rect(){
            cout<<"The destructor is called"<<endl;
        }

};
int main(){

rect a1;
a1.area();
a1.display();
 
cout<<endl<<endl;

cout<<"Enter the lenth of the rectangle"<<endl;
int len;
cin>>len;
cout<<"Enter the width of the rectangle"<<endl;
int wid;
cin>>wid;
rect a2(len, wid);

a2.area();
a2.display();


    return 0;
}