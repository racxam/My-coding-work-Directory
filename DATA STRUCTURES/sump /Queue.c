//Queue is a data structure in C and it is used to use an idea of Queue that is FIFO(first in first out)
//We will learn the enqueue and dequeue , isempty isfull, peek(position),top, bottom like funcitons here
#include<stdio.h>
#include<stdlib.h>
struct queue
{
    int *arr;
    int size;
    int f;
    int b;
};
typedef struct queue q;
typedef struct queue* qp;
int isemp(qp one){
    if(one->b==-1){
        return 1;
    }
    return 0;
}
int isfull(qp one){
    if(one->b==one->size-1){
        return 1;
    }
    return 0;
}
void enqueue(qp one,int data){
    if(isfull(one)){
        printf("Queue Overflow\n");
    }
    else
    {
        one->b++;
        one->arr[one->b]=data;
    }
    
}
void dequeue(qp one){
    if(isemp(one)){
        printf("Queue is empty\n");
    }
    else{
        one->f++;
    }
}
void display(qp one){
    if(isemp(one)){
        printf("queue is empty\n");
    }
    else
    {
        int j=1;
       for (int i = one->f+1; i <=one->b; i++)
       {
        printf("The elements at %d is: %d \n",j,one->arr[i]);
        j++;
       }
       
    }
    
}
void queueFirst(qp one){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else
    {
        printf("The queue first element is %d \n",one->arr[one->f+1]);

    }
}
void queueLast(qp one){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else
    {
        printf("The queue last element is %d \n",one->arr[one->b]);

    }
}
void queuePeek(qp one,int pos){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else
    {
        if(pos>one->f && pos<=(one->b)+1){

        printf("The queue element at %d no. is %d \n",pos,one->arr[pos-1]);
        }
        else{
            printf("Invalid positon\n");
        }

    }
}

int main(){
    qp one= (qp)malloc(sizeof(q));
    one->size=20;
    one->arr=(int*)malloc(one->size*(sizeof(int)));
    one->f=-1;
    one->b=-1;
    enqueue(one,1);
    enqueue(one,2);
    enqueue(one,33);
    enqueue(one,4);
    enqueue(one,5);
    dequeue(one);
  


    display(one);
    printf("\n");
    queueLast(one);
    printf("\n");
    queueFirst(one);
    printf("\n");
    queuePeek(one,3);


    return 0;
}