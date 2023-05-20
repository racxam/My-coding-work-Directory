#include<iostream>
#include<cmath>
using namespace std;
class simple{
    public:
int n;
double a;
double b;
double result;
    public:
    void getdata(){
        cout<<"What you wants to do with simple calculator"<<endl;
        cout<<"if add press 1"<<endl;
        cout<<"if substract press 2"<<endl;
        cout<<"if multiply press 3"<<endl;
        cout<<"if divide press 4"<<endl;
        cin>>n;
        switch(n){
            case 1:
                cout<<"Enter a"<<endl;
                cin>>a;
                cout<<"Enter b"<<endl;
                cin>>b;
                result=a+b;
                break;
          case 2:
                cout<<"Enter a"<<endl;
                cin>>a;
                cout<<"Enter b"<<endl;
                cin>>b;
                result=a-b;
                break;

          case 3:
                cout<<"Enter a"<<endl;
                cin>>a;
                cout<<"Enter b"<<endl;
                cin>>b;
                result=a*b;
                break;

                      
        case 4:
                cout<<"Enter a"<<endl;
                cin>>a;
                cout<<"Enter b"<<endl;
                cin>>b;
                result=a/b;
                break;
                
                
                }
        
        }

};
class scientific{
    public:

int n1;
double s;
double result1;
void getvalue(){
    cout<<"What you wants to do with Scientific calculator"<<endl;
        cout<<"if you want exponential values press 5"<<endl;
        cout<<"if wants underroot values press 6"<<endl;
        cout<<"if wants to square press 7"<<endl;
        cout<<"if wants to cube press 8"<<endl;
        cin>>n1;
        switch(n1){
            case 5:
                cout<<"Enter power of e"<<endl;
                cin>>s;
                result1=pow(2.71, s);
                
                break;
          case 6:
                cout<<"Enter the value inside underroot"<<endl;
                cin>>s;
               result1=pow(s,0.5);
                break;

          case 7:
                cout<<"Enter the vaule you want square of"<<endl;
                cin>>s;
                result1=pow(s,2);
                

                break;

                      
        case 8:
                cout<<"Enter the vaule you want cube of"<<endl;
                cin>>s;
                 result1=pow(s,3);
               
                break;
                
                
                }


}







};
class hybridcalculator :public simple, public scientific{
    public:
    
    void display(){
            switch(n){
                case 1:
                   cout<<"Addition result is "<<result<<endl;
                   break;

                case 2:
                   cout<<"Substration result is "<<result<<endl;
                    break;
                case 3:
                   cout<<"Multiplication result is "<<result<<endl;
                    break;
                case 4:
                   cout<<"Division result is "<<result<<endl;
                    break;
         

            }
            switch(n1){
                       case 5:
                   cout<<"Exponential result is "<<result1<<endl;
                    break;
                case 6:
                   cout<<"Square Root result is "<<result1<<endl;
                    break;
                case 7:
                   cout<<"Square result is "<<result1<<endl;
                    break;
                case 8:
                   cout<<"Cube result is "<<result1<<endl;
                    break;
            }
}
};
int main(){
    int val;
    cout<<"=====HERE WE ARE USING SIMPLE AND SCIENTIFIC CALCULATOR======="<<endl;
    cout<<"What you wants to use Simple OR Scientific Calculator"<<endl;
    cout<<"if simple press 0"<<endl;
    cout<<"if scientific press 7"<<endl;
    cin>>val;
   switch(val){
        case 0:{    
            cout<<"=====You are using simple calculator======"<<endl;
            hybridcalculator obj;
            obj.getdata();
            obj.display();
            break;}

          
        
        case 7:{
            cout<<"=====You are using scientific calculator======"<<endl;
            hybridcalculator obj1;
            obj1.getvalue();
            obj1.display();
             break;}
         
    }
    
   
   
   
   
   
    return 0;
    }