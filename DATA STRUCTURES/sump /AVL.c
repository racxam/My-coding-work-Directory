// AVL tress are highly blanced tress and there upper bound is O(log n), same as the hight of tres
// This concept has came into play because the binary tress are sometimes skewed and there uppper bound goes to O(n), which is not good
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* left;
    struct node* right;
    int height;

};
typedef struct node n;
typedef struct node* np;

int getheight(np root){
if(root==NULL){
    return 0;}
return root->height;
}
np creatNode(int key){
np new= (np)malloc(sizeof(n));
new->data= key;
new->left=NULL;
new->right=NULL;
new->height=1;
return node;
}

int getBF(np n){
if(n==NULL){
    return 0;
}
else{
    return getheight(n->left)-getheight(n->right);
}
}
// right r

np RR(np y){
np x=y->left;
np T2=x->right;

x->right=y;
y->left=T2;


y->height=max(getheight(y->right),getheight(y->left))+1;
x->height=max(getheight(x->right),getheight(x->left))+1;
return x;
}
///left rotation

np LR(np x){
np y=x->right;
np T2=y->left;

y->left=x;
x->right=T2;

y->height=max(getheight(y->right),getheight(y->left))+1;
x->height=max(getheight(x->right),getheight(x->left))+1;
return x;
}
np insert(np n,int key){
     if(n==NULL){
        return creatNode(key);
     }
     if(key<n->data){
        node->left=insert(node->left,key);
     }
     else if(key>n->data){
        node->right=insert(node->right,key);
     }
     return node;
     n->height= 1+max(getheight(n->left),getheight(n->right));
     int bf=getBF(node);

}
int main(){
    return 0;
}