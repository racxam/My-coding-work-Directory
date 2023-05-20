// 2:Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
// 1 - without any parameter - no amount will be added to the Piggie Bank
// 2 - having a parameter which is the amount that will be added to the Piggie Bank
// Create an object of the 'AddAmount' class and display the final amount in the Piggie Bank.
#include<iostream>
using namespace std;
class AddAmount{
    public:
    int amount=50;
    AddAmount(){
    cout<<"No amount is added to this piggy bank"<<endl;

    }
    AddAmount(int add){
        cout<<"Here we will add the amount to the piggy bank"<<endl;
        amount=amount+add;

    }
    void disp(){
        cout<<"The final amount in the piggy bank is:"<<amount<<"$"<<endl;
    }


};
int main(){
    // AddAmount obj;// without parameter
     AddAmount obj(50);// with parameter

    obj.disp();
    return 0;
}