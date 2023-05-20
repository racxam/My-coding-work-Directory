#include <iostream>
#define MAX_SIZE 50
using namespace std;

class guest {
public:
char name[50];
int seatno;
};


class home {
public:

static int front, rear;
static guest allGuest[MAX_SIZE];


static int alloteSeat() {
if (rear == (MAX_SIZE - 1)) {
cout<< "Hall is full!";
return 0;
           }

rear++;
cout<< "Enter Guest Name: ";
cin>>allGuest[rear].name;
allGuest[rear].seatno = rear + 1;
return 1;
       }


static void listGuest() {
while(++front <= rear) {
cout<< "\nGuest " <<allGuest[front].name << " is seated on seat R.." <<allGuest[front].seatno<< ".";
           }
rear = front = -1;
       }

};


int home::front = -1;
int home::rear = -1;
guest home::allGuest[MAX_SIZE] = {};

int main()
{

   home::alloteSeat();
   home::alloteSeat();
   home::alloteSeat();
   home::alloteSeat();

   home::listGuest();
return 0;
}