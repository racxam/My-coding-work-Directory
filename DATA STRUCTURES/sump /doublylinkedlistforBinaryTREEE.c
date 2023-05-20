//doubly linked list representation of the binary tree
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

int main(){
    //node creation
 btp n0= (btp)malloc(sizeof(bt));
 btp n1= (btp)malloc(sizeof(bt));
 btp n2= (btp)malloc(sizeof(bt));
 btp n3= (btp)malloc(sizeof(bt));
 btp n4= (btp)malloc(sizeof(bt));
 btp n5= (btp)malloc(sizeof(bt));
 btp n6= (btp)malloc(sizeof(bt));

//node data filling
n0->data=2;
n1->data=3;
n2->data=4;
n3->data=5;
n4->data=6;
n5->data=7;
n6->data=8;
//linking the nodes 
n0->left=n1;
n0->right=n2;

n1->left=n3;
n1->right=n4;

n2->left=n5;
n2->right=n6;


    return 0;
}