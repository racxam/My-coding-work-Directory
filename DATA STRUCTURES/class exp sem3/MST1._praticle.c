#include<stdio.h>
int main(){
    int n;
    printf("Enter the length of array\n");
    scanf("%d",&n);
    double arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element at index %d: ",i);
        scanf("%lf",&arr[i]);
    }
    printf("\nYour array is:\n\n[ ");

    for (int i = 0; i < n; i++)
    {
        printf("%0.2lf ",(arr[i]));
        if(i<(n-1)){
            printf(",");
        }
    }
    printf("]");
    double sum=0;
    for (int j = 0; j < n; j++)
    {
        sum+=arr[j];
    }
    double avg=sum/n;
    
    printf("\n\nThe Average of above array is %0.2lf\n",avg);
    
    
    return 0;
}