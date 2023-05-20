import java.util.*;


public class ques {
    // public static void pow(int x, int n) {
    //     int pro=1;
    //   for (int i = 1; i <= n; i++) {
    //     pro*=x;
        
    //   }
    //   System.out.println("The x ki power n is: "+pro);
    //   return; 
    // }

    public static void GrCD(int x, int n) {
        int small,big,gcd=-3;
        if(x>n){

            small=n;
        }
        else{

            small=x;
        }
        for (int i =1; i <=small; i++) {
            if(x%i==0 && n%i==0){
                gcd=i;
            }
        }
        if(gcd!=-3){
            System.out.println("The GCD IS : "+gcd);
        }
        else{
            System.out.println("WE can't find GCD check the input");
        }
    }
        public static void main(String[] args) {
           Scanner o= new Scanner(System.in);
           System.out.println("Enter x");
           int x= o.nextInt();
           System.out.println("Enter n");
           int n= o.nextInt();
        //    pow(x,n);
           GrCD(x,n);

               
        // }
        }}
