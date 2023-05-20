//   THIS IS JUST COMMENT
#include<stdio.h>
#include<stdlib.h>
struct Stack{
    int size;
    int top;
    int* arr;
};
typedef struct Stack s;
typedef struct Stack* sp;
int isEmpty(sp r){
if(r->top==-1){
return 1;

}
return 0;
}

int isFull(sp r){
if(r->top==r->size-1){
return 1;
}
return 0;
}
void push(sp r, int data){
    if(isFull(r)){
        printf("we can't push Stack overflow\n");
    }
    else{
       r->top++;
       r->arr[r->top]=data;
    }
}
void display(sp one){
    if(isEmpty(one)){
        printf("The stack is empty\n");
    }

else{

    int i=0;
    while (i!=one->top+1)
    {
        printf("%d ",one->arr[i]);
        i++;
    }
}
    
    
    
}
void pop(sp one){
    if(isEmpty(one)){
        printf("Can't pop Stack underflow\n");
    }
    else{
        one->top--;
    }
}
void stackTop(sp one){
    if(isEmpty(one)){
        printf("Stack is empty\n");
    }
    else{
        printf("The Stack top element is %d ",one->arr[one->top]);
    }
}
void stackBottom(sp one){
    if(isEmpty(one)){
        printf("Stack is empty\n");
    }
    else{
        printf("The Stack bottom element is %d ",one->arr[0]);
    }
}
void peek(sp one ,int pos){
    if (isEmpty(one))
    {
        printf("Stack is empty\n");
    }
    else{
        if(pos>0 && pos<=(one->top)+1){
        printf("The Element at position %d is %d",pos, one->arr[(pos)-1]);
        }
        else{
            printf("No element present at this position\n");
        }

    }
    
}
int main()
{
    sp one=(sp)malloc(sizeof(s));
    one->size=80;
    one->top=-1;
    one->arr=(int*)malloc(one->size*sizeof(int));
    push(one,1);
    push(one,2);
    push(one,3);
    push(one,4);
    push(one,5);
    pop(one);


    display(one); 
    printf("\n");
    stackBottom(one);
    printf("\n");
    stackTop(one);
    printf("\n");
    peek(one,1);

    






 return 0;
}