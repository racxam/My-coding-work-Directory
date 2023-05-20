#include <iostream>
using namespace std;
#define n 5
class stack
{
    int *arr;
    int top;

public:
    stack()
    {
        arr = new int[n];
        top = -1;
    }
    void push(int x)
    {
        if (top >= (n - 1)){
            cout<<"How to push Voila!!--StackOverflow Occured\n";
        }
        else{

            top++;
            arr[top]=x;
        }
    }
    void pop()
    {
        if (top == -1)
        {
            cout << "There is no element to pop!\n";
        }
        top--;
    }
    int Top()
    {
        if (top == -1)
        {
            cout << "list is empty how can i show!!\n";
        }
        return arr[top];
    }
  bool empty(){
      if(top==-1){
          return true;
      }
      else{
          return false;
      }
  }
bool full(){
    if(top==n-1){
        return true;

    }
    else{
        return false;
    }
}



};
int main()
{
    stack st;
    
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    cout<<st.full();

    

    return 0;
}