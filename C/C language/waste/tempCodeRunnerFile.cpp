// Consider a publishing company that markets both book and audio
//  cassette version to its works.

// Create a class Publication that stores the title (a string) and 
// price(type float) of a publication. Derive the following two classes 
// from the above Publication class: Book which adds a page count (int) and 
// Tape which adds a playing time in minutes(float). Each class should have
//  get_data() function to get its data from the user at the keyboard.

// Write the main() function to test the Book and Tape classes by creating
//  instances of them asking the user to fill in data with get_data() and 
// then displaying it using put_data().
#include<iostream>
using namespace std;
class publication{
protected:
    string tittle;
    float price;
};
class book:public publication{
    public:
    int count;
    void getdata()
    {
        cout<<"Enter the tittle of the book"<<endl;
        getline (cin, tittle);
        cout<<"Enter the price of the book"<<endl;
        cin>>price;
        cout<<"Enter the pages of the book"<<endl;
        cin>>count;
    }
    void disp(){
        cout<<"The tittle of the book is: "<<tittle<<endl;
        cout<<"The price of the book is: "<<price<<endl;
        cout<<"No of pages in the book is:  "<<count<<endl;
    }



};
class tape: public publication{
    public:
    int min;
     void getdata()
    {
        cout<<"Enter the tittle of the book"<<endl;
        getline (cin, tittle);
        cout<<"Enter the price of the book"<<endl;
        cin>>price;
        cout<<"Enter the pages of the book"<<endl;
        cin>>min;
    }
void disp(){
        cout<<"The tittle of the audio book is: "<<tittle<<endl;
        cout<<"The price of the audio book is: "<<price<<endl;
        cout<<"No of minutes in the audio book is:  "<<min<<endl;
    }

};
int main(){
    book o;
    tape o1;
    o.getdata();
    o.disp();
    o1.getdata();
    o1.disp();
;    return 0;
}