#include <iostream>

using namespace std;

class Data

{

private:

 int length = 5, breadth = 6;//private DM



public:

 friend class Rectangle;//frnd class

};

class Rectangle

{

public:

 void area(Data d1)

 {

  cout << "Area of the rectange is=" << d1.length * d1.breadth << endl;

 }

 void perimeter(Data d1)

 {

  cout << "Area of the rectange is=" << 2 * (d1.length + d1.breadth) << endl;

 }

};

int main()

{

 Data obj1;//object of class 1 

 Rectangle obj2;//obj of frnd class

  

 obj2.area(obj1);//frnd class with objct of class 1

 obj2.perimeter(obj1);

 return (0);

}

