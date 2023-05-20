#include<stdio.h>
#include<stdlib.h>
struct Node{
int data;
struct Node* left;
struct Node* right;

};
typedef struct Node bst;
typedef struct Node* bstp;
bstp add(int data){

    bstp new=(bstp)malloc(sizeof(bst));
    new->data=data;
    new->left=NULL;
    new->right=NULL;
    return new;
}
bstp itr_search(bstp root,int key){
while (root!= NULL)
{
    

if(key== root->data){
    return root;
}
else if (key<root->data)
{
    root=root->left;
}
else{
    root=root->right;
}

}
return NULL;

}
int main()
{
    //creation
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

   bstp found= itr_search(p1,18);
   if(found!=NULL){
    printf("Node %d is found!",found->data);
   }
   else{
    printf("There is no node like this!");
   }
 return 0;
}