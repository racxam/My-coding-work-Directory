#include<iostream>
using namespace std;
class shop{
    int itemId[100];
    int price[100];
    
    public:
    int counter;
    void setPrice();
    void dispPrice();

    };
void shop::setPrice(){
    cout<<"Enter the id of the item no "<<counter<<endl;
    cin>>itemId[counter];
    cout<<"Enter the price of item"<<endl;
    cin>>price[counter];
    counter++;


}
void shop::dispPrice(){
    for(int i=0;i<counter;i++){
    cout<<"The price of the item no. "<<i<<"with itemID "<<itemId[i]<<"is:"<<price[i]<<endl; 
}}



int main(){

shop dukan;
dukan.counter=0;
dukan.setPrice();
dukan.setPrice();
dukan.setPrice();
dukan.setPrice();
dukan.dispPrice();



 
    return 0;
}