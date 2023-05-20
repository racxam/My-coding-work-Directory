#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;

};
typedef struct node ll;
typedef struct node* llp;
llp insert(llp head, int data){
    llp newnode= (llp)malloc(sizeof(ll));
    newnode->data=data;
    newnode->next=NULL;
    if(head==NULL){
       newnode=head;
    }
    else{
        newnode->next=head;
        newnode=head;

    }
    return newnode;
}
void display(llp ptr)
{
    llp temp=ptr;
    while (temp!=NULL)
    {

        printf("%d ",temp->data);
        temp=temp->next;
    }
    
}

int main(){
    llp head= (llp)malloc(sizeof(ll));
    head=NULL;
    head=insert(head,2);
    head=insert(head,3);
    head=insert(head,4);
    head=insert(head,5);
    display(head);

    

    return 0;
}