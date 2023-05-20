#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* left;
    struct node* right;
};
typedef struct node bt;
typedef struct node* btp;
btp createNode(int key){
btp new= (btp)malloc(sizeof(bt));
new->data= key;
new->left=NULL;
new->right=NULL;
return new;

}
void PreO(btp r){
    if(r!=NULL){

    printf("%d ",r->data);
    PreO(r->left);
    PreO(r->right);
    }
}
void PostO(btp r){
    if(r!=NULL){
        PostO(r->left);
        PostO(r->right);
        printf("%d ",r->data);
    }
}
void InO(btp r){
    if(r!=NULL){
        InO(r->left);
        printf("%d ",r->data);
        InO(r->right);
    }
}
int main(){
    //node creation
    btp n0= createNode(2);
    btp n1= createNode(3);
    btp n2= createNode(4);
    btp n3= createNode(5);
    btp n4= createNode(6);
    btp n5= createNode(7);
    btp n6= createNode(8);



//linking the nodes 
n0->left=n1;
n0->right=n2;

n1->left=n3;
n1->right=n4;

n2->left=n5;
n2->right=n6;

//preOrder
PreO(n0);
printf("\n");
PostO(n0);
printf("\n");
InO(n0);

    return 0;
}