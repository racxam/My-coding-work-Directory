#include<stdio.h>

int main(){
   FILE* ptr= NULL;
   char string[64]="langoor waloon ne ghabla kr di";
   //Reading of the file*******
//    ptr = fopen("tinku.txt","r");
//    fscanf(ptr,"%s",string);
//    printf("The content of the file is following  \n %s",string);
// Writing of the file ******
ptr= fopen("tinku.txt","a");
fprintf(ptr,"%s",string);





    return 0;
}