#include <iostream>
   #include <fstream>
   using namespace std;
   int main ()
   {
          char ch;
streambuf * p;
ofstream pbuf ("test.txt");
pbuf= os.rdbuf();
       do {
ch = cin.get();
p ->sputc(ch);
       } while (ch != '.');
       os.close();
       return 0;
 }