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
void inorder(bstp root){
    if(root!=NULL){
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);

    }

}
void preorder(bstp r){
   
    if(r!=NULL){
        printf("%d ",r->data);
        preorder(r->left);
        preorder(r->right);
    }
}
void postorder(bstp r){
   
    if(r!=NULL){
        postorder(r->left);
        postorder(r->right);
        printf("%d ",r->data);
    }
}
int isBST(bstp r){
    static bstp prev=NULL;
    if(r!=NULL){
      if(!isBST(r->left)){
        return 0;
      }
    if(prev!=NULL&& prev->data>r->data){
            return 0;
    }
    prev=r;
    return isBST(r->right);
    }
    return 1;
}
void search(bstp r,int key){
    
    if(r!=NULL){

    
    if(key==r->data){
        printf("We found the key %d",r->data);
    }
    else if (key>r->data)
    {
        search(r->right,key);
    }
    else{
        search(r->left,key);
    }
    }
    else{
        printf("The element is not in the binary search tree, thank you\n");
    }
    
}
void itrsearch(bstp r,int key){
    while (r!=NULL)
    {
    if(r->data==key){
        printf("Key found bro,congo %d:",r->data);
        break;

    }
    else if (key>r->data)   
    {
        r=r->right;
    }
    else 
    {
        r=r->left;
    }
   
    
    }
    if(r==NULL){
        
        printf("root not found .,GTH\n thank you\n");

    }
}
void insert(bstp r, int data){

    bstp gola= add(data);
    bstp pre;
    int n=0;
   while (r!=NULL)
   {
    pre=r;
   
    if(data==r->data){
        printf("we can't, don't spread duplicacy\n");
        n=34;
        break;
      
    }
    else if (data>r->data)
    {
        r=r->right;
    }
    else{
        r=r->left;
    }
    
   }
   if(n!=34){

   if (pre->data>data)
   {
        pre->left=gola;
   }
   
   else
   {
        pre->right=gola;
   }

   }
   
   

}
bstp inOrderPrecedor(bstp n){
    n=n->left;
    while (n->right!=NULL)
    {
        n=n->right;
    }
    return n;
}

//delete node function

bstp deleteNode(bstp r,int data){
   bstp ipre;
   if(r==NULL){
    return NULL;
   }
    if(r->left==NULL && r->right==NULL){
        free(r);
        return NULL;

    }
    else if(r->data==data){
        ipre=inOrderPrecedor(r);
        r->data=ipre->data;
        r->left=deleteNode(r->left,ipre->data);
    
    }
    else if (r->data<data)
    {
        r->right=deleteNode(r->right,data);
    }
    else{
       r->left= deleteNode(r->left,data);
    }
    
return r;

}
int main()
{
bstp p1=add(33);
bstp p2=add(30);
bstp p3=add(50);
bstp p4=add(22);
bstp p5=add(31);
bstp p6=add(32);

bstp p7=add(43);
bstp p8=add(45);
bstp p9=add(44);


p1->left=p2;
p1->right=p3;

p2->left=p4;
p2->right=p5;

p6->right=p6;


p3->left=p7;
p7->right=p8;
p8->left=p9;


printf("inorder is:\n");
inorder(p1);

printf("\n");
printf("\n");
// printf("preorder is:\n");
// preorder(p1);

// printf("\n");
// printf("postorder is:\n");
// postorder(p1);
// if(isBST(p1)){
// printf("Yes it is bst\n") ;   
// }
// else{
//     printf("It is not a bst\n");
// }
//search drama start------
// printf("Enter the key you wants to search\n");
// int key ;
// scanf("%d",&key);
// search(p1,key);
// itrsearch(p1,key);
//search drama end----

//insetion
// insert(p1,190);
//check insertion
// inorder(p1);
//ways to find inorder precedr--- so inorder preceder is the right most child of left tres
// inOrderPrecedor(p4);
deleteNode(p1, 43);
printf("\n");
inorder(p1);

 return 0;
}