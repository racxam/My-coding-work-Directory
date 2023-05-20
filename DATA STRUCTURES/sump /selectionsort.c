#include<stdio.h>
int* sel(int arr[],int n){
for(int  i = 0; i < n-1; i++)
{
    int small=i;
    for (int  j = i+1; j <n; j++)
    {
       if(arr[j]<arr[small]){
           int temp =arr[j];
           arr[j]=arr[small];
           arr[small]= temp;

       }
    }
    

    
}
    return arr;

}
int main(){
    int arr[]={7,8,9,6,4};
    int *arrs=sel(arr,5);

    for (int i = 0; i < 5; i++)
    {
        printf("%d ",arr[i]);
    }
    
    return 0;

}