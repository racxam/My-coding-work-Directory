#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct stack
{
    int size;
    int top;
    char*arr;
};

typedef struct stack  s;
typedef struct stack* sp;
int isEmp(sp one){
if(one->top==-1){
return 1;
}
return 0;
}
int isFull(sp one){
if(one->top==(one->size)-1){
return 1;
}
return 0;
}
void push(sp one,int val){
    if(!isFull(one)){
        one->top++;
        one->arr[one->top]=val;
    }
    else{
        printf("Can't push %d\n",val);
    }
}
char pop(sp one){
    if(!isEmp(one)){
        char pops=one->arr[one->top];

        one->top--;
        return pops;
    }
    else{
        printf("Can't pop");
        return 0;
    }
}
void display(sp one){
    if(!isEmp(one)){
      int i=0;
      while (i<=(one->top))
      {
        printf("%c ",one->arr[i]);
        i++;
      }
      
    }
}

int isOperator(char ch){
    if(ch=='+'|| ch=='-'||ch=='*'|| ch=='/'){
        return 1;
    }
    return 0;
}
int precedence(char ch){
    if(ch == '*' || ch=='/')
        return 3;
    else if(ch == '+' || ch=='-')
        return 2; 
    else
        return 0;
}
char* infTopof(char* inf,sp one){
one=(sp)malloc(sizeof(s));
one->size=10;
one->top=-1;
one->arr=(char*)malloc(sizeof(char)*one->size);
char *pof=(char*)malloc((sizeof(char))*(strlen(inf)+1));
int i=0;// infix
int j=0;
while (inf[i]!='\0')
{
    if(!isOperator(inf[i])){
        pof[j]=inf[i];
        j++;
        i++;}
    else{
        if(precedence(inf[i])>precedence(stackTop(one))){
            push(one,inf[i]);
            i++;
        }
        else{
            pof[j]=pop(one);
            j++;

        }

    }


}
while (isEmp(one))
{
 pof[j]=pop(one);
 j++;
}
pof[j]='\0';
return pof;
}

int main(){
   char* infix="x+y/z-k*d";
   printf("The postfix is %s",infTopof(infix));

      

    return 0;
}