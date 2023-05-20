#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
typedef struct node q;
typedef struct node* qp;
 qp f=NULL;
 qp b=NULL;
int isFull(){
qp new= (qp)malloc(sizeof(q));
if(new==NULL){
    return 1;
}
return 0;
    
}

int isEmp(){

if(f==NULL){
    return 1;
}
return 0;
    
}

//pushing
void push(int data){
if (isFull())
{
    printf("queue Overflow\n");
}
else
{
    qp new= (qp)malloc(sizeof(q));
    new->data=data;
    new->next=NULL;
    
    if(f==NULL){

    f=new;
    b=new;
    }
    else{
        b->next=new;
       
        b=new;

    }
}


}
void dequeue(){
    if(isEmp()){
        printf("The queue is empty\n");
    }
    else{
        qp temp= f;
        f=f->next;
        free(temp);
    }
}
void traverse(qp ptr){
    // if(isEmp()){
    //     printf("This queue is empty\n");
    // }
    // else{
        while (ptr!=NULL)
        {
            printf("%d ",ptr->data);
              ptr=ptr->next;
        }

    // }
}
int main()
{
    push(1);
    push(11);
    push(12);
    push(13);
    push(14);
    dequeue();
    traverse(f);
   

    return 0;
}