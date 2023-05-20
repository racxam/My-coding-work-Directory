import java.util.*;
public class class2 {
    
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n= o.nextInt();
        if(n>=0){

            int val= fibo(n);
            System.out.println(val);
            o.close();
        }
        else{
            System.out.println("Provide valid n");
        }
    }
    public static int  fibo(int n) {
        int a=0;
        int b=1;
        int i=2;
        int next=0;
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }

        else{

            while (i<n) {
                next=a+b;
                a=b;
                b=next;
    
                i++;
            }
        }

        return next;
    }
}
