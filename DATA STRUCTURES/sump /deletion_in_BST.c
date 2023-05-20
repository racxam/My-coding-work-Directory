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
    new->right=NULL;
    new->left=NULL;
    return new;

}
void itr_insert(bstp root){
printf("Enter the key you wants to insert into the tree\n");
int n;
scanf("%d",&n);
int key=n;
    bstp prev;
while (root!=NULL)
{
    prev= root;
    if(key==root->data){
      prev=NULL;
    }
    if(key>root->data){
        root=root->right;

    }
    else{
        root=root->left;
    }
}
//new
  if(prev->data>key){
      bstp p8=add(key);
      prev->left=p8;

   }
   else{
    bstp p8=add(key);
    prev->right=p8;
    
   }

}
void inorder(bstp root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
            }
}
bstp inOrderPredessor(bstp root){
root=root->left;
while (root->right!=NULL)
{
   root=root->right;

}
return root;


}

bstp delete(bstp root,int val){
    bstp ipre;
    //search to the node to be deleted
    if(root==NULL){
        return NULL;
    }
    if(root->left ==NULL&& root->right==NULL){
        free(root);
        return NULL;
    }
    if(val<root->data){
        root->left=delete(root->left,val);
    }
    else if(val>root->data){
        root->right=delete(root->right,val);
    }
    //deletion when node is found
    else{
        ipre= inOrderPredessor(root);
        root->data=ipre->data;
        root->left=delete(root->left,ipre->data);

    }
    //deletion 


return root;


}
int main()
{
    bstp p1=add(18);
    bstp p2=add(14);
    bstp p3=add(25);
    bstp p4=add(10);
    bstp p5=add(16);
    bstp p6=add(20);
    bstp p7=add(30);

    //linkage
    p1->left=p2;
    p1->right=p3;

    p2->left=p4;
    p2->right=p5;

    p3->left=p6;
    p3->right=p7;
   

//    itr_insert(p1);
   inorder(p1);
   printf("\n"); 
      delete(p1,20);
  
   inorder(p1);

 return 0;
} 