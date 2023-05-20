#include<iostream>
using namespace std;
#define n 10
class stack{
    int top;
    int *arr;
    public:
    stack(){

        top=-1;
        arr= new int[n];
    }
    void push(int x){
        if(top==n-1){
            cout<<"Stack is full \n";
        }


    top++;
    arr[top]=x;
    }

    void pop(){
        if(top==-1){
             cout<<"There is no value to pop\n";

        }
        top--;

    }
    int Top(){
        if(top==-1){
             cout<<"There is no element in stack\n";


        }
        return arr[top];


    }
  int empty(){
      return top==-1;
  }


};
int main()
{
stack st;
st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.push(5);

// cout<<st.Top()<<endl;
st.pop();
st.pop();
st.pop();
st.pop();
st.pop();
cout<<st.Top()<<endl;
cout<<st.empty()<<endl;


 return 0;
}