#include<stdio.h>
#include<stdlib.h>
struct node 
{
 int data;
 struct node* left;
 struct node* right;
};
typedef struct node bst;
typedef struct node* bstp;
bstp add(int data){
    bstp new= (bstp)malloc(sizeof(bst));
    new->data=data;
    new->left=NULL;
    new->right=NULL;
    return new;
}
void inorder(bstp p){
    if(p!=NULL){
        inorder(p->left);//left
        printf("element is : %d\n",p->data);
        inorder(p->right);//right


    }
   
}
int isBST(bstp root){
    bstp prev=NULL;
    if(root!=NULL){
        if (!isBST(root->left))
        {
            return 0;
        }
        if(prev!=NULL && (root->data<=prev->data)){
            return 0;
        }
        prev=root;
        return isBST(root->right);

    }
    else{
        return 1;
    }
}
int main(){
    bstp p1=add(14);
    bstp p2=add(7);
    bstp p3=add(18);
    bstp p4=add(6);
    bstp p5=add(11);
    bstp p6=add(16);
    bstp p7=add(15);
    bstp p8=add(17);

    p1->left=p2;
    p1->right=p3;

    p2->left=p4;
    p2->right=p5;

    p3->left=p6;


    // p4->left=p2;
    // p4->right=p3;

    p6->left=p7;
    p6->right=p8;
    
    inorder(p1);
    printf("\n");
    printf("%d",isBST(p1));
    return 0;
}