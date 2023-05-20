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
    new->data= data;
    new->right=NULL;
    new->left= NULL;
    return new;

}

void inorder(bstp root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
            }
}
bstp inOrderPrecedor(bstp root){
    root=root->left;
    while (root->right!=NULL)
    {
        root=root->right;
    }
    
return root;
}
bstp delete(bstp root, int key){
     bstp ipre;
    if(root==NULL){

        return NULL;
    }
    if(root->left==NULL && root->right==NULL){
        free(root);
        return NULL;
    }
    //searching in the tree
    if(root->data>key){
        root->left=delete(root->left,key);
    }
    else if(root->data<key){
        root->right= delete(root->right,key);
    }
    else{

        ipre=inOrderPrecedor(root);
        root->data=ipre->data;
        root->left=delete(root->left,ipre->data);
    }
    return root;
    
}
int main()
{
    bstp p1=add(12);
    bstp p2=add(10);
    bstp p3=add(18);
    bstp p4=add(8);
    bstp p5=add(11);
    bstp p6=add(16);
    bstp p7=add(20);
    //linkage

    p1->left=p2;
    p1->right=p3;

    p2->left=p4;
    p2->right=p5;

    p3->left=p6;
    p3->right=p7;
    inorder(p1);

    delete(p1,12);
    printf("\n");
    inorder(p1);


   
 return 0;
}