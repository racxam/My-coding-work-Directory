#include<stdio.h>
#include<unistd.h>
int main()
{
    int p1=fork();
     printf(" parent id is %d\n p1 is %d ",getpid(),p1);
     printf("\n");

    printf("Hello i am first\n");
    printf("The pid is %d\n",getpid());

 return 0;
}