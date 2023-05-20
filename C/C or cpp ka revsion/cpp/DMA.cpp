/* DMA in cpp
memory arrangment in c/c++ is :
1. text segment (code)
2. static/global var 
  i). initlised var
  ii=). uninitlised var (BSS segment)
3). stack
4). heap

c uses:
malloc ,calloc, realloc and free 
if mem is not allocated then they return null pointer other vise void pointer (generic pointer)
 
 c++ uses :
 new and delete oprator simply

 if memory is not avaiable at run time then program will throw bad alloc expection
 unless we use "nothow " in new opertor then it will return a null pointer

delete opertor is programmer responsiblity to use when the program no longer need the allocated memory otherwise the memory leak will happen

*/


#include<iostream>
using namespace std;
int main(){
    int *p= new(nothrow) int(45);
    p=NULL;
    if(!p){
       cout<<"No mem avaiable" ;
       delete p;
       
    }
    else{
    cout<<p<<endl<<*p<<endl;

    }
    
    
    return 0;
}
