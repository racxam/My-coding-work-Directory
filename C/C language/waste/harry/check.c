#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int generateRandomNumber(int n){
    srand(time(NULL));
    return rand() % n;
}
int main(){
    printf("the random no. is %d", generateRandomNumber(3)+1);
    return 0;
}