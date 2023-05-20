#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node* next;
};
  
void traversal(struct Node* ptr){
    if(ptr==NULL){
        printf("List is empty");
    }
    while (ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
    
}
struct Node* insert(struct Node * head,int data){

    struct Node* ptr= (struct Node*)malloc(sizeof(struct Node));
    ptr->next=NULL;
    struct Node* temp= head;
    if(head==NULL){
        head= ptr;
        head->data=data;

    }
    else{
        while (temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=ptr;
        
        
        ptr->data=data;
    }
    return head;
}

int main(){
     struct Node * head=NULL;


    // memory allocation in heap
    // head= (struct Node*) malloc(sizeof(struct Node));
    

    // // data insert
    // head->data=1;
    // first->data=2;
    // second->data=3;
    // third->data=4;

    // //link
    // head->next=first;
    // first->next=second;
    // second->next=third;
    // third->next=NULL;
     head=insert(head,1);
     head=insert(head,2);
     head=insert(head,3);
     head=insert(head,4);
     head=insert(head,5);
    traversal(head);




    return 0;
}