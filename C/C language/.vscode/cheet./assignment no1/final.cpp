#include<iostream>
using namespace std;
class matrix{
    public:
    int a[2][2];
    void get(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                cin>>a[i][j];
            }
        }

    }
    void disp(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                cout<<a[i][j];
                cout<<"\t";

            }
            cout<<endl;
        }


    }
  matrix operator+(matrix y){
      matrix temp;
      for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                temp.a[i][j]=a[i][j]+y.a[i][j];
            }
        }
        return (temp);
  }



};
int main(){
    matrix obj,obj1,res;
    obj.get();
    obj.disp();
    obj1.get();
    obj1.disp();
    res= obj+obj1;
    res.disp();

    return 0;
}