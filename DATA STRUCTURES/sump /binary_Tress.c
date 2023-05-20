//we will use linked respresentation here
//actually in linear DS we have two ways of traverse 1. front to back and 2. back to front
// in non linear DS like binary tree we have 3 ways to traverse the tree
// 1. pre order---> ROOT---LEFT ----RIGHT
// 2. post order----> LEFT ---- RIGHT --- ROOT
// 3. in order----> LEFT----ROOT---RIGHT


#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;

};
typedef struct Node bt;
typedef struct Node* btp;

btp add(int data)
{
    btp new=(btp)malloc(sizeof(bt));
    new->left=NULL;
    new->right=NULL;
    new->data=data;

    return new;
    
}
void preorder(btp p){
    if(p!=NULL){
        printf("element is : %d\n",p->data);
        preorder(p->left);//left
        preorder(p->right);//right

    }
   
}
void postorder(btp p){
    if(p!=NULL){
        postorder(p->left);//left
        postorder(p->right);//right
        printf("element is : %d\n",p->data);


    }
   
}
void inorder(btp p){
    if(p!=NULL){
        inorder(p->left);//left
        printf("element is : %d\n",p->data);
        inorder(p->right);//right


    }
   
}
int main(){
btp p=add(1);
btp p1=add(2);
btp p2=add(3);
btp p3=add(4);
btp p4=add(5);
btp p5=add(6);


 
p->left=p1;
p->right=p2;
p1->left=p3;
p1->right=p4;
p2->left=p5;
  


// preorder(p);//preorder
// postorder(p);//postorder
   inorder(p);//inorder



    return 0;
}