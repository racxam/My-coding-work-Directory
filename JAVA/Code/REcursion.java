

public class REcursion {
    // public static void printfive(int i) {
    //     System.out.println(i);
    //     i--;
    //     if(i>=1){

    //         printfive(i);
    //     }

        
    // }
    // static int sum=0;

    // public static void printnatural(int n) {
    //         sum=sum+n;
    //         n--;
    //         if(n>0){
    //             printnatural(n);
    //         }
    // }
    public static void fact(int n, int pro) {

        if(n>=1){
            pro=pro*n;
            n--;
            fact(n, pro);
            
        }
        else if(n==0){
            pro=pro*1;

            fact(1,pro);
        }
        else{
            System.out.println(pro);
        }
        
    }
    public static void main(String[] args) {
        //print no from 1 to 5 
        // for (int i = 1; i < 6; i++) {
        //     System.out.println(i);
        // }
        //next way
        // int i=1;
        // while(i<6){
        //     System.out.println(i);
        //     i++;
        // }
        //next way
        // printfive(5);

        //que print sum of first n natural no's 
        // int n=10;
       

        // int sum=0;
        // for (int i = 1; i <=n; i++) {
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        // printnatural(n);
        // System.out.println(sum);


        //Next Question of finding factorial of n;
        int n=1;
        int pro=1;
        fact(n,pro);

    }//main is ending here

}
