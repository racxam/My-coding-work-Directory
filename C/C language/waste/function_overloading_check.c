//-------FUNCTION OVERLOADING----------

// CHECK IN C ..HERE IT'S NOT WORKING


#include<stdio.h>


int add(int a, int b){
    return a+b;

}
int add(int a, int b,int c){
    return a+b+c;

}



int main(){
int a=1,b=2,c=2;

printf("the 2 way addn of a+B is:%d",add(a,b));
printf("the 3 way addn of a+B+c is:%d ",add(a,b,c));














    return 0;
}