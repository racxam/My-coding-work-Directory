#include<stdio.h>
#include<unistd.h>
int main(){
int pid1, pid2, pid3;
printf("Parent id is %d and Root id is %d\n",getpid (),getppid());
pid1=fork();
if (pid1==0){
printf("Process] id is %d and its parent id is %d\n", getpid (), getppid());
pid2=fork() ;
}
if (pid2==0) {
printf ( "Process2 id is %d and its parent id is %d\n",getpid () ,getppid());
pid3=fork();
}
if (pid1==0 && pid2==0 && pid3==0) {
printf("Process3 id is %d and its parent id is %d\n", getpid (), getppid());}}