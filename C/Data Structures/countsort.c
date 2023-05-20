//code for count sort
#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
int* input(int*arr, int *n){
    printf("Enter the size of sorting table\n");
    scanf("%d",n);
    arr=(int*)malloc((*n)*sizeof(int));
    for (int i = 0; i < *n; i++)
    {
        printf("Enter the element at %d\n",i+1);
        scanf("%d",&arr[i]);

    }
 return arr;   

}
void disp(int*arr, int n){
    for (int i = 0; i < n; i++)
    {
        printf("The element at  %d  is : %d\n",i+1,arr[i]);
    }
    
}
int* countsort(int*arr, int n){
    int max=INT_MIN;
    for (int  i = 0; i < n; i++)//to find max element---n
    {

        if(arr[i]>max){
            max=arr[i];
        }
    }
int *count= (int *)malloc((max+1)*sizeof(int));//creat an array of size max+1---constnt
for (int i = 0; i <= max; i++)//initlise the count arry with 0; --m
{
    count[i]=0;
    
}
for (int i = 0; i < n; i++)/// count pr array sort kia----n
{
int val=arr[i];
if(count[val]==0){
count[val]=1;

}
else{
    count[val]=count[val]+1;
}
    
}
int sep=0;
for (int i = 0; i <= max; i++)// ----m
{
    if(count[i]!=0){
       while (count[i]!=0)
       {
           arr[sep]=i;
           sep++;
           count[i]--; 


       }

        
    }
    
}
return arr;

}
int main(){
    int *arr,n;
    arr=input(arr,&n);
    printf("\n\nBefore\n");
    disp(arr,n);
    arr=countsort(arr,n);
    printf("\n\nAfter\n");
    disp(arr,n);





    return 0;
}