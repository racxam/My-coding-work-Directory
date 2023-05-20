// BSt is a binary tree in which all the all left subtress are lesser than root tree's data and all the right subtress are greater than the data of root
//  there will be no duplicate element there
//  and all nodes should follow the rule
// In order traversal of BST is in Increasing order
#include <stdio.h>
#include <stdlib.h>
#include<limits.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};
// typedef
typedef struct node bt;
typedef struct node *btp;

// creating node function
btp createNode(int key)
{
    btp new = (btp)malloc(sizeof(bt));
    new->data = key;
    new->left = NULL;
    new->right = NULL;
    return new;
}

// Traversals of BT
void PreO(btp r)
{
    if (r != NULL)
    {

        printf("%d ", r->data);
        PreO(r->left);
        PreO(r->right);
    }
}
void PostO(btp r)
{
    if (r != NULL)
    {
        PostO(r->left);
        PostO(r->right);
        printf("%d ", r->data);
    }
}
void InO(btp r)
{
    if (r != NULL)
    {
        InO(r->left);
        printf("%d ", r->data);
        InO(r->right);
    }
}
int isBST(btp n)
{
    static btp prev = NULL;
    if (n != NULL)
    {
        if (!isBST(n->left))
        {
            return 0;
        }; // left
        if (prev != NULL && prev->data > n->data)
        {
            return 0;
        }

        prev = n;

       return isBST(n->right);}
            // right
             
            
    else{

    return 1;
    }
}
int isBSTnew(btp n,int min, int max){
    if(n!=NULL){
      if(n->data<min || n->data>max){
        return 0;
      }
      else{
        return (isBSTnew(n->left,min,n->data))&& (isBSTnew(n->right,n->data,max));


      }
    }
    else{
        return 1;
    }

 }
int main(){
    // node creation
    btp n0 = createNode(5);
    btp n1 = createNode(3);
    btp n2 = createNode(12);
    btp n3 = createNode(1);
    btp n4 = createNode(4);
    btp n5 = createNode(7);
    btp n6 = createNode(16);

    // linking the nodes
    n0->left = n1;
    n0->right = n2;

    n1->left = n3;
    n1->right = n4;

    n2->left = n5;
    n2->right = n6;

    // preOrder
    PreO(n0);
    printf("\n");
    PostO(n0);
    printf("\n");
    InO(n0);
    printf("\n");
   
    int min =INT_MIN;
    int max= INT_MAX;
    if((isBSTnew(n0,min,max))!=0){
        printf("It is a BST\n");
    }
    else{
        printf("Not BST\n");
    }

    return 0;
}