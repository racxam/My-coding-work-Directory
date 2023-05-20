//function will be written same as in c
import java.util.*;
public class function {
    // public static void printMyName(String name) {
    //         System.out.println("Your name is "+name);
    //         return;// we can use this
    //     }
    // public static int printSum(int a,int b) {
    //     return a+b;
    // }
    
    //Iterative method of factorial

    // public static void fact(int n)   {
    //     // int i=1;
    //     int pro=1;
    //     // while(i-1!=n){
    //     //     pro*=i;
    //     //     i=i+1;

    //     // }
           //if(n<0){
           // return;
           //}
        //    else{

               //     for (int i = 1; i <=n; i++) {
                   //         pro*=i;
                   //     }
                   //     System.out.println("The product is: "+pro);
                   //     return;
                // }
        
    // }

    //Method 2 Recursive 
    public static int fact(int n) {
    
        if(n==0 ){
           return 1;
        }
        else{
         return n*fact(n-1);

        }
    
    }
    public static void main(String[] args) {
        String name;
        Scanner o= new Scanner(System.in);
        // System.out.println("Dude!, Enter your name!!");
        // name= o.nextLine();
        // printMyName(name);
        
        // System.out.println("Dude!, Enter a: !!");
        // int a=o.nextInt();
        // System.out.println("Dude!, Enter b: !!");
        // int b=o.nextInt();
        // int sum= printSum(a,b);
        // System.out.println("The Sum is "+sum);

    System.out.println("Enter the no you want factiorial of: ");
    int n= o.nextInt();
    int ans=fact(n);
    System.out.println("the factorial is: "+ans);
    o.close();
        
    }
    
}
