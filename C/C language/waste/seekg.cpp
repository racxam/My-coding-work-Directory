
#include <iostream>#include <fstream>using namespace std;
int main () {​​fstream obj;obj.open ("test.txt");
obj<<"Hello World";
obj<<"how are you";
int pos;
pos = obj.tellp();            //writings tells uptill which position data is writtencout<<pos;obj.close();}​​
#include <iostream>
#include <fstream>
using namespace std;
int main () {​​fstream obj;
obj.open ("test.txt", ios::in);
char ch;int pos;
while(!obj.eof()){​​obj>>ch;pos = obj.tellg(); //reading , reads all datacout<<pos<<"."<<ch<<"\n";}​​obj.close();}​​
