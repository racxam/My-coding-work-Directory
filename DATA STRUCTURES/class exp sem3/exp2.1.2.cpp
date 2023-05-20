#include<iostream>
#include<stdalign.h>
using namespace std;
struct Node
{
 int top;
 int size;
 char *arr;
    
};
typedef struct Node s;
typedef struct Node* sp;

int isEmp(sp ptr){
    if(ptr->top==-1){
        return 1;
    }
    return 0;
}
int isFull(sp ptr){
    if(ptr->top==ptr->size-1){
        return 1;
    }
    return 0;
}
void push(sp ptr,int val){
    if(isFull(ptr)){
        cout<<"Stack is full"<<endl;
    }
    else{
        ptr->top++;
        ptr->arr[ptr->top]=val;
 }
}
char pop(sp ptr){
    if(isEmp(ptr)){
        cout<<"Stack underflow"<<endl;
        return '\0';
    }
    else{
        char c= ptr->arr[ptr->top];
        ptr->top--;
        return c;

    }
}
void display(sp one){
    if(!isEmp(one)){
      int i=0;
      while (i<=(one->top))
      {
        printf("%c \n",one->arr[i]);
        i++;
      }
      
    }
}

void evalPost(char * postfix,sp one){
one=(sp)malloc(sizeof(s));
one->size=10;
one->top=-1;
one->arr=(char*)malloc(sizeof(char)*one->size);
int i=0;
int isOperator(char ch){
    if(ch=='+'|| ch=='-'||ch=='*'|| ch=='/'){
        return 1;
    }
    return 0;
}
while (postfix[i]!='\0')
{
    int a;
    int b;
    int r;
    if(isOperator(postfix[i])){
        i++;
            a=(int)(pop(one));
            b=(int)(pop(one));
            r=(int)(a+postfix+b);
            push(r);
            
            }
    else{
        push(postfix[i]);
        
    }


}

}

int main(){
    // char * postfix="xyz+/"
    // evalPost(postfix);




    return 0;
}