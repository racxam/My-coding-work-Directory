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
int search(btp root,int key){
if(root!=NULL){
    if(root->data==key){
        return root->data;
    }
    else if(key>root->data){
        return search(root->right,key);
    }
    else{
       return  search(root->left,key);
    }
    
}
else{
    return 0;
}
}
int Isearch(btp root, int key){//Iterative search

    while(root!=NULL){

    
if(root->data==key){
    return root->data;
}
else if(root->data<key){
    root=root->right;
}
else{
    root= root->left;
}
    }
    return 0;
}

void insert(btp r, int data){
    btp prev= NULL;
    while (r!=NULL)
    {prev=r;
    
    
    if(data== r->data){

        printf("Cn't insert %d-- in order to avoid the duplicacy of the nodes\n",data);
        return;
    }
   
    else if(data>r->data){
        r=r->right;
    }
    else{
        r=r->left;
    }}
    btp new= createNode(data);
    if(data<prev->data){
        prev->left=new;
    }
    else{
        prev->right=new;
    }}

int main(){
    //node creation
   btp n0 = createNode(5);
    btp n1 = createNode(3);
    btp n2 = createNode(12);
    btp n3 = createNode(1);
    btp n4 = createNode(4);
    btp n5 = createNode(7);
    btp n6 = createNode(16);



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