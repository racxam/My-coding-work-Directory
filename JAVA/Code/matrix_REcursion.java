// matrix size m x n and we have to move from 0,0 to 2,2 and m=3,n=3 
// constraints are- that we can only move in 2 directions  either right or downwards
// we can to calculate the possible ways to get out


public class matrix_REcursion {
    public static int  countPath(int i, int j, int m,int n) {
        if(i==n || j==m){
            return 0;
        }
        if(i==(n-1) && j==(m-1)){
            return 1;
        }
        //downpath
       int downpath=countPath(i+1,j,m,n) ;
       //rightpath
       int rightpath=countPath(i,j+1,m,n);
       return rightpath+downpath;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalpath=countPath(0, 0, m, n);
        System.out.println(totalpath);

    }
}
