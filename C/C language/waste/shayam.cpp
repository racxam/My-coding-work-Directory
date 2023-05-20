#include <iostream>

#include <fstream>

#include <string>

using namespace std;

int main ()

{
 
ifstream file;
file.open("input.txt");

string str;

while (getline(file, str)) {

cout << str << "\n";

}

}