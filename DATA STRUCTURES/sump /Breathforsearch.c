//Queue array implimentatation
#include<stdio.h>
#include<stdlib.h>
struct queue
{
  int* arr;
  int size;
  int f;
  int b;

};
typedef struct queue q;
typedef struct queue* qp;
int isEmpty(qp bptr){
    if(bptr->b==bptr->f){
        return 1;
    }
    else{
        return 0;
    }
}

int isFull(qp fptr){
    if(fptr->f==(fptr->size)-1){
        return 1;
    }
    else{
        return 0;
    }
}
void enqueue(qp ptr,int data){
    if(isFull(ptr)){
        printf("Queue is full\n");
        return;
    }
    else{
        ptr->b++;
        ptr->arr[ptr->b]=data;

    }
}
int dequeue(qp ptr){
    int send=0;
    if(isEmpty(ptr)){
        printf("Queue is Empty now\n");
        return 0;

    }
    else{
        ptr->f++;
        send= ptr->arr[ptr->f];
        return send;

    }
}
void queueTop(qp ptr){
    if(isEmpty(ptr)){
        printf("Queue is empty\n");
    }
    else{
        
        printf("The top element of the queue is %d ",ptr->arr[(ptr->f+1)]);
    }
}
void queueBtm(qp ptr){
    if(isEmpty(ptr)){
        printf("Queue is empty\n");
    }
    else{
        
        printf("The bottom element of the queue is %d ",ptr->arr[(ptr->b)]);
    }
}
void traverse(qp ptr){
    if(isEmpty(ptr)){
       
        printf("=The queue is empty\n");
    }
    else{
        int i=(ptr->f)+1;
        while (i<=ptr->b)
        {
            printf("%d ",ptr->arr[i]);
            i++;
        }
        
    }
}
int main()
{
    qp one=(qp)malloc(sizeof(q));
    one->size=20;
    one->arr=(int*)malloc(sizeof(int)*one->size);
    one->f=-1;
    one->b=-1;
    // enqueue(one,0);
    // enqueue(one,1);
    // enqueue(one,2);
    // enqueue(one,3);
    // enqueue(one,4);
    // enqueue(one,5);
    // enqueue(one,6);
    // dequeue(one);
    // traverse(one);
   

//BFS
int node;
int i=0;
int visited[7]={0,0,0,0,0,0,0};
int a[7][7]={
        {0,1,1,1,0,0,0},//0
        {1,0,1,0,0,0,0},//1
        {1,1,0,1,1,0,0},//2
        {1,0,1,0,1,0,0},//3
        {0,0,1,1,0,1,1},//4
        {0,0,0,0,1,0,0}, //5
        {0,0,0,0,1,0,0}//6
};
printf("%d",i);
visited[i]=1;
enqueue(one,i);//for exploration
while (!isEmpty(one))
{
    int node=dequeue(one);
    for (int j = 0; j < 7; j++)
    {
        if(a[node][j]==1 && visited[j]==0 ){
            printf("%d",j);
            visited[j]=1;
            enqueue(one,j);

        }
    }
    
    
}
 




 return 0;
}
