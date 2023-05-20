#include<stdio.h>
int main(){
    
//THIS PROGRAM IS ABOUT MATRIX MULTIPLICATIOIN OF 2D ARRAY------
a:
printf("Hello User! we are here doing 2D Martix mutlitplication \n");
printf("For multiplication no of Columns of 1st matrix ==no of rows of 2nd matrix\n");


printf("This is for matrix no.1\n");
printf("Enter the no. of rows\n");
int r,i,j;
scanf("%d",&r);
printf("Enter the no. of columns\n");
int c;
scanf("%d",&c);

printf("This is for 2 matrix\n");

printf("Enter the no. of rows\n");
int r1,i1,j1;
scanf("%d",&r1);
printf("Enter the no. of columns\n");
int c1;
scanf("%d",&c1);

if(c==r1){
    printf("we can proceed further\n\n");
    }
else{
    printf("we can't proceed further\n\n no of column of first ==no of rows of second matrix\n do it again\n");
    goto a;
}



printf("Now we will enter the 2D matrix 1 first\n");
int arr[r][c];
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        printf("for the index %d %d enter the values you want\n",i,j);
        scanf("%d",&(arr[i][j]));
    }
}

printf("The matrix no 1 is like this\n");
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        printf("%d ",(arr[i][j]));
    }
    printf("\n");
}

printf("Now we will enter the 2D matrix 2\n");



int arr1[r1][c1];
for(i1=0;i1<r1;i1++){
    for(j1=0;j1<c1;j1++){
        printf("for the index %d %d enter the values you want\n",i1,j1);
        scanf("%d",&(arr1[i1][j1]));
    }
}
printf("Now we will print the 2D matrix 2\n");

for(i1=0;i1<r1;i1++){
    for(j1=0;j1<c1;j1++){
        printf("%d ",arr1[i1][j1]);
    }
    printf("\n");
}

printf("NOW WE WILL MULTIPLY THE BOTH ENTERED MATRIX\n\n");
int m,n;


int arrM[r][c1];
for(m=0;m<r;m++){
     
    for(n=0;n<c1;n++){
   
   arrM[m][n]=0;
   for(int k=0;k<c1;k++){
      arrM[m][n]+=(arr[m][k])*(arr1[k][n]);
   }}
}
int i2=0,j2=0;

for(i2=0;i2<r;i2++ )
{
    for(j2=0;j2<c1;j2++){
        printf("%d ",(arrM[i2][j2]));
    }
    printf("\n");
}




    return 0;
}