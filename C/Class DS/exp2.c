#include<stdio.h>
#include<string.h>
void replaceStr(char str[],char sub[], char new_Str[]){
    int i=0,j,k;
    int flag=0,start,end;
    for ( i = 0; i < strlen(str); i++)
    {
        int match=1;
       for ( j = 0; j < strlen(sub)+1; j++,i++)
       {
           
       }
    //    if(match==0){
    //      printf("Not matching\n");
    //    }
    //    else if (match==1)
    //    {
    //     printf("Matching\n");
    //    }
       
       
        
    }
    
}
int main()
{
char str[100],sub[100],new_str[100];
printf("Enter the string\n");
gets(str);
printf("Enter the substring\n");
gets(str);
printf("Enter the new substring\n");
gets(str);
replaceStr(str,sub,new_str);
// printf("The string after replacing %s\n ",str);



 return 0;
}