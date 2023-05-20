//Stack using linked list.c
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
typedef struct node ls;
typedef struct node* lsp;
int isFull(){
lsp new=(lsp)malloc(sizeof(ls));
if(new==NULL){
    return 1;
}
else{
    return 0;
}
}
int isEmp(lsp ptr){
    if(ptr==NULL){
        return 1;
    }
    else{
        return 0;
    }
}

lsp push(lsp top,int data){
    if(isFull()){
        printf("The Heap is full\n");
        return NULL;
    }
    else{
        
     lsp new= (lsp)malloc(sizeof(ls));
     new->data=data;
     new->next=top;
     top=new;
     return top;
    }
}

lsp pop(lsp top){
if(isEmp(top)){
    printf("Stack is emp\n");
    return NULL;
}
else{
    lsp temp=top;
    top=top->next;
    free(temp);

    return top;
}
}
void traverse(lsp top){
    if(isEmp(top)){
        printf("Empty\n");
    }
    else{

    while (top!=NULL)
    {
        printf("%d ", top->data);
        top=top->next;
    }
    }
    
}
void S_top(lsp top){
    if(isEmp(top)){
        printf("Stack is empty\n");
    }
    else{
        printf(" The STack top element is %d",top->data);
    }
}
void S_btm(lsp top){
    if(isEmp(top)){
        printf("Stack is empty\n");
    }
    else{
        while (top->next!=NULL)
        {
            top=top->next;
        }
        
        printf(" The STack Bottom element is %d",top->data);
    }
}
void peek(lsp top,int pos){
if(isEmp(top)){
    printf("This stack is empty\n");
}
else{
   
    int i=0;
    while (i<(pos-1))
    {
        top=top->next;
        i++;
    }
    if(top!=NULL&& pos>=1){

    printf("The element at postion %d is: %d ",pos, top->data);
    }
    else{
        printf("Invalid postion\n");
    }
}
}
int main(){
    lsp top=NULL;
    top=push(top,7);
    top=push(top,2);
    top=push(top,3);
    top=push(top,1);
    top=push(top,14);
    top=pop(top);
    traverse(top);
    printf("\n");
    S_top(top);
    printf("\n");
    S_btm(top);
    printf("\n");
    peek(top,-1);


    return 0;
}