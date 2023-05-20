import java.util.*;

public class fibo {
    public static void fibonaci(int n)  {
        int f=0,next=1;
        int sum;
        System.out.print("Your fibo series is: "+"0 "+"1 ");
        for (int i = 1; i <=(n-2); i++) {
            sum=f+next;

            System.out.print(sum+" ");
            f=next;
            next=sum;
            
        }
        
    }
    public static void main(String[] args) {
        Scanner  o= new Scanner(System.in);
        System.out.println("Enter the terms of the fibonacci seris: ");
        int n= o.nextInt();
        fibonaci(n);
    }
}
