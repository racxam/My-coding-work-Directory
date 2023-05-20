// structures in c are user defined data types in c
// we can combine differnt data types together
#include<stdio.h>
int main(){
    struct str
    {
        int a;
        int v;
        char str;
    }e1,e2;
    e1.a=3;
    e1.str='t';
    // printf("%d %c",e1.a,e1.str);
    
    struct newstr
    {
        int b;
        int c;
        char vaah;
    };
    struct newstr v1={1,3,'c'};
    printf("%d \n%d \n%c \n",v1.b,v1.c,v1.vaah);


    
    return 0;

}