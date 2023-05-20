#include <iostream>

using namespace std;
class Matrix{
    public:
    int rows,columns,i,j;
    int arr[2][2];

    public:
    Matrix(int r,int c){
        rows=r;
        columns=c;
    }
    
    void getElements(){
        
        
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
            cout<<i<<" "<<j;
            cin>>arr[i][j];   
           } }}
    Matrix operator+(Matrix o2){
        Matrix temp(2,2);

        for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
          temp.arr[i][j] = arr[i][j]+o2.arr[i][j];
           return temp;
          
           } }
    }
    void DispAdd(){
        
         for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){

            cout<<arr[i][j];
            cout<<endl;
           } }
    }

    
    
};

int main() {
    Matrix obj(2,2),addobj(2,2);
    obj.getElements();
    Matrix obj1(2,2);
    obj1.getElements();
    
    addobj= obj+ obj1;
    addobj.DispAdd();


    


  
    return 0;
}

