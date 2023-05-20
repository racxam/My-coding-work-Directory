#include<stdio.h>
int isPalindrome(int num[],int n){
    
  int put=67;//you can any no . other than 0 and 1 or may be 0 only i am so tired i am not using logic here 🤣
    for(int i=0,j=n-1;i<=n&&j>=0;i++,j--){
        if(num[i]==num[j]){ 
            put=1;

        }}
        if(put==1){
            return 1;}
        else{
            return 0;
        }}

int main(){

int i=0,n=0;
b:
printf("enter how many no. you wants to print in palindrome\n");
scanf("%d",&n);
if((n%2)==0){
printf("yes you can proceed further\n");
}
else{
    goto b;
}
printf("Enter the number to check wheather it is a palindrome or not\n");

int arr[n];

for(i=0;i<n;i++){
scanf("%d",&(arr[i]));
}
printf("You have entered this\n");
for(i=0;i<n;i++){
printf("%d ",arr[i]);
}
printf("\n");

//YOUR TASK IS TO IMPLEMENT THIS FUNCTION 
if (isPalindrome(arr,n)){
printf("This no is a palindrome\n");
}
else {
    printf("This no. is not a palindrome");
}



    return 0;
}