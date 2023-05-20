#include<iostream>
using namespace std;


class Area{
    public:
    int length,breadth;
    int Area;
    
    void SetDim(int len, int wid){
        
       
        length=len;
    
        breadth=wid;
        
        
    }
     int getArea(int len, int wid){
         Area=length*breadth;
       cout<<"The Area of Rectangle of width"<<breadth<<"and length "<<length<<"is: "<<Area;
        
        
    }
};

int main() {
    int len,wid;
    
     cout<<"Enter the length of Rectangle"<<endl;
        cin>>len;
    cout<<"Enter the Breadth of Rectangle"<<endl;
        cin>>wid;
      Area obj;
    obj.SetDim(len,wid);
    obj.getArea();
    
    


    return 0;
}


a