// write a c program G edit ,system call fork(), getpid(),getppid() and kill();
#include<stdio.h>
#include<unistd.h>// for system files
int main(){
    int pid1,  pid2,  pid3;
    printf("parent id is %d and root is %d\n", getpid(),getppid());
    pid1=fork();
    if(pid1==0){
        printf("process 1 id is %d and it's parent id is %d\n",getpid(),getppid());
        pid2=fork();
    }
    if(pid2==0){
        printf("process 2 id is %d and it's parent id is %d\n",getpid(),getppid());
        pid3=fork();
    }
    if(pid1==0 && pid2==0 && pid3==0){
        printf("process 3 id is %d and it's parent id is %d\n",getpid(),getppid());

    }
}