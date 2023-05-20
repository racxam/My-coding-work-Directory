#include<stdio.h>
int comAnd(int x,int y){
return x&y;
}
int comOr(int x,int y){
return x|y;
}
int comXor(int x,int y){
return x^y;
}
int max(int* x,int k,int c){
    int t= x[0];
    for(int i=0;i<c;i++){
        if(x[i]>t)
         t=x[i];
    } 
    if(t<k){
        return t;
    }
else {
    return 0;
}

  } 

int main(){
    int n,k;
    
    
    scanf("%d",&n);
    scanf("%d",&k);
    // int and[n],or[n],xor[n];
    int a=0,b=0,c=0;
    int i=0,s1[2],s2[2],s3[2];
    int and[n],or[n],xor[n];
    for(i=0;i<=n;i++){
        for(int j=n;j>i;j--){
            
           and[a] =comAnd(i+1,j);
            a++;
           or[b]= comOr(i+1,j);
           b++;
           xor[c]=comXor(i+1,j);
           c++;
            }

    }
    int* rr=and;
    int* rrr=or;
    int* rrrr=xor;

    int p=max(rr,k,a);
    int q=max(rrr,k,b);
    int r=max(rrrr,k,c);
    printf("%d\n",p);
    printf("%d\n",q);
    printf("%d\n",r);
    return 0;
}