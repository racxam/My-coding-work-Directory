//Write a program in c or c++ fo the implementations of different operations
//  of enqueue and deque on queue of characters with it's algorithms!
#include<stdio.h>
#include<stdlib.h>
struct queue
{
    char *arr;
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
   
    else if(one->f>=one->b){
        printf("Queue underflow\n");
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
        printf("The elements at %d is: %c  \n",j,one->arr[i]);
        j++;
       }
       
    }
    
}
void queuePeek(qp one){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else if(one->f>=one->b){
        printf("Queue has underflown so no peek element\n");
    }
    else
    {
        printf("The queue Peek element is %c \n",one->arr[one->f+1]);

    }
}
void queueLast(qp one){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else if(one->f>=one->b){
        printf("Queue has underflown so no last element\n");
    }
    else
    {
        printf("The queue last element is %c \n",one->arr[one->b]);

    }
}
void queuePos(qp one,int pos){
    if(isemp(one)){
        printf("The queue is empty\n");
    }
    else
    {
        if(pos>one->f && pos<=(one->b)+1){

        printf("The queue element at %d no. is %c \n",pos,one->arr[pos-1]);
        }
        else{
            printf("Invalid positon\n");
        }

    }
}

int main(){
    qp one= (qp)malloc(sizeof(q));
    one->size=5;
    one->arr=(char*)malloc(one->size*(sizeof(char)));
    one->f=-1;
    one->b=-1;


    enqueue(one,'s');
    enqueue(one,'u');
    enqueue(one,'m');
    enqueue(one,'i');
    enqueue(one,'t');




    dequeue(one);
    dequeue(one);
    dequeue(one);

    dequeue(one);
    dequeue(one);
    dequeue(one);



    
  


    display(one);
    printf("\n");
    queueLast(one);
    printf("\n");
    queuePeek(one);
    printf("\n");
    queuePos(one,3);


    return 0;
}