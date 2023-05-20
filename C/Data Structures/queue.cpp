#include <iostream>
using namespace std;
#define n 10
class queue
{
    int front, back;
    int *arr;

public:
    queue()
    {
        arr = new int[n];
        front = -1;
        back = -1;
    }

    void push(int x)

    {
        if (back == (n - 1))
        {
            cout << "Queue is full now!\n";
        }

        back++;
        arr[back] = x;
        if (front == -1)
        {
            front++;
        }
    }
    void pop()
    {
        if (front ==-1 || front > back)
        {
            cout << "I can't pop because list is empty\n";
        }

        front++;
    }

    int peek(){
        if (front == -1 || front > back)
        {
            cout << "I can't show because list is empty\n";
        }
        
       
        return arr[front];

      
        
        
    }
    bool empty(){
         if (front == -1 || front > back)
        {
            return true;
        }
        else{
           return false;
        }

    }
};
int main()
{
    queue q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);

    q.pop();
    q.pop();
    q.pop();
    q.pop();
    q.pop();
    cout<<q.empty();



    return 0;
}