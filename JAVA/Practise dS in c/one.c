#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node* next;
};
void traversal(struct Node* ptr){
    while (ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
    
}
int main(){
    struct Node * head;
    struct Node * first;
    struct Node * second;
    struct Node * third;

    // memory allocation in heap
    head= (struct Node*) malloc(sizeof(struct Node));
    first= (struct Node*) malloc(sizeof(struct Node));
    second= (struct Node*) malloc(sizeof(struct Node));
    third= (struct Node*) malloc(sizeof(struct Node));

    // data insert
    head->data=1;
    first->data=2;
    second->data=3;
    third->data=4;

    //link
    head->next=first;
    first->next=second;
    second->next=third;
    third->next=NULL;

    traversal(head);




    return 0;
}