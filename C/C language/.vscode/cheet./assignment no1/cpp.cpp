#include<iostream>
using namespace std;

class Matrix
{       
public:
        int r,c;
        int a[2][2];
    
    public:
        Matrix(){
            r=2;
            c=2;

        }
        void GetPostion();
        void display();
        void operator +(Matrix x);

void operator*(Matrix y){

        int matr[2][2];
        for(int i = 0; i < 2; ++i)
        for(int j = 0; j < 2; ++j)
            for(int k = 0; k < c2; ++k)
            {
                matr[i][j] += a[i][k] * b[k][j];
            }
        cout<<"\n Multiplicaton of Matrix : \n\n";
        for(int i=0; i<2; i++)
        {
                cout<<" ";
                for(int j=0; j<2; j++)
                {
                        cout<<matr[i][j]<<"\t";
                }
                cout<<"\n";

void GetPostion()
{
        cout<<"\n Enter Matrix Element(2 x 2) : \n";
        for(int i=0; i<2; i++)
        {
                for(int j=0; j<2; j++)
                {
                        cout<<" ";
                        cin>>a[i][j];
                }
        }
}
 }           
void display()
{
        for(int i=0; i<2; i++)
        {
                cout<<" ";
                for(int j=0; j<2; j++)
                {
                        cout<<a[i][j]<<"\t";
                }
                cout<<"\n";
        }
}
void operator +(Matrix x)
{
        int mat[3][3];
        for(int i=0; i<2; i++)
        {
                for(int j=0; j<2; j++)
                {
                        mat[i][j]=a[i][j]+x.a[i][j];
                }
        }
        cout<<"\n Addition of Matrix : \n\n";
        for(int i=0; i<2; i++)
        {
                cout<<" ";
                for(int j=0; j<2; j++)
                {
                        cout<<mat[i][j]<<"\t";
                }
                cout<<"\n";
        }
 
};

    
int main()
{
        Matrix m,n; 
        m.GetPostion();       
        n.GetPostion();      
        cout<<"\n First Matrix : \n\n";
        m.display();   
        cout<<"\n Second Matrix : \n\n";
        n.display(); 
        m+n;  
        cout<<"for multiplication\n";
        m*n;

        return 0;
}