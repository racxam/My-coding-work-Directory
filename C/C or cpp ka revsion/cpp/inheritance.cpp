#include<iostream>
using namespace std;
class vechile
{
    public:
    int fuelP,tankC;
    void getdata(int fp,int tc){
        fuelP=fp;
        tankC=tc; }
    virtual void putdata(){
        cout<<"The price of petrol will be:"<<fuelP*tankC<<endl;
    }
    

};
class Bus:public vechile{
public:
string busN="KArawati devi";
void Busname(){
    cout<<"Busname is :"<<busN<<endl;}
void putdata(){
        cout<<"The price of BUS petrol will be:"<<fuelP*tankC<<endl;
    }


};
class Truck:public vechile{
public:
string TruckN="lundkumar";
void Truckname(){
    cout<<"Truck name is: "<<TruckN<<endl;

}

};

int main(){
    // Bus b;
    // b.Busname();
    // b.getdata(84,35);
    // b.putdata();

    // Truck t;
    // t.Truckname();
    // t.getdata(84,100);
    // t.putdata();
    //  Bus b,*bp;
    //  bp=&b;
    //  bp->Busname();
    //  bp->getdata(84,10);
    //  bp->putdata();
     vechile b,*bp;
     bp=&b;
    //  bp->Busname();
     bp->getdata(84,10);
     bp->putdata();

  

    return 0;
}