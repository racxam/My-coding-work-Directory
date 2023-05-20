#include<stdio.h>
#include<string.h>
int main(){
      char str[100];
      printf("Enter the desired String\n");
      scanf("%[^\n]s",str);
      printf("%s",str);
      printf("\n Enter any occurence you wants to remove\n");
      
      char strOcc[20];
      scanf("%[^\n]s",strOcc);
    
    for (int i = 0; i < strlen(str)-strlen(strOcc); i++)
    {
        int check=0;
        for (int j = 0; j < strlen(strOcc); j++)
        {
            if(strOcc[j]==str[j]){
                check= check && 1;
            }
            else{
                check=check && 0;
            }
        }
        if(check==1){
            for (int k = 0; k < strlen(strOcc); k++)
            {
                str[k]="#";
            }
            
        }

        
    }

   printf("\n\n final string is %s\n",str);

    

    return 0;
}