#include<stdio.h>
#include<unistd.h>
int main(){
int pid1,pid2,pid3;
printf("Parent id of the process is %d\nThe root id is %d\n\n\n",getpid(),getppid());

pid1=fork();
if(pid1==0){
printf("process 1's id is %d\nParent id is %d\n\n\n",getpid(),getppid());
}
pid2=fork();
if(pid2==0){
printf("process 2's id is %d\nParent id is %d\n\n\n",getpid(),getppid());

}
pid3=fork();
if(pid1==0 && pid2==0 && pid3==0){
printf("process 3's id is %d\nParent id is %d\n\n\n",getpid(),getppid());

}



return 0;
}
