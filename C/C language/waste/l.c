#include<stdio.h>
int main(){
	int arr[3][3];
	for(int i=0 ;i<3;i++){
		for(int j=0;j<3;j++){
			printf("for index %d %d\n",i,j);
			scanf("%d",&(arr[i][j]));

		}
	}
for(int i=0 ;i<3;i++){
		for(int j=0;j<3;j++){
			printf("%d",arr[i][j]);
			
		}
	}

for(int i=0 ;i<3;i++){
		for(int j=0;j<3;j++){
			printf("for index %d %d",i,j);
			printf("%d\n",&(arr[i][j]));
			
		}
	}
}

