#include<iostream>
using namespace std;
#define MAX_SIZE 50;
class guest{
public:
char name[50];
int seatNo;
};

class home{
public:
static int front,back;
static guest allGuest[MAX_SIZE];

static int alloatment(){
    if(back==(MAX_SIZE-1)){
     cout<<"Hall is full of guests!"<<endl;
        return 0;
    }
}

back++;

cout<<"Hey! Guest enter your name:\n";
cin>>allGuest[back].name;
allGuest[back].seatNo.= back +1;
retrun 1;}

static void listOfguest(){
    while (++front <=rear)
        cout<<"\nGuest"<<allGuest[front].name<<"is seated on A"<<allGuest[front].seatno.<<endl;}
    back =front-1;


};
int home::front=-1;
int home::back=-1;
Guset home::allGuest[50]=
{};
int main(){


    home::alloatment();
    home::alloatment();
    home::alloatment();
    home::alloatment();

    home::listOfguest();
    return 0;
}