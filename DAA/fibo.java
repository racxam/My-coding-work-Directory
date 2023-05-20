
import java.util.*;
public class fibo{
    public static int fibof(int n,int[] arr) {
        if(n==0||n==1){
            return 1;
        }
        else{
            if(arr[n]>0){
                return arr[n];
            }
            else{
                int output=fibof(n-1, arr)+fibof(n-2, arr);
                arr[n]=output;
                return output;
            }
        }
    }
    public static void main(String[] chumi){
        System.out.println("Enter a index at which you want fibonacci series");
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n+1];
        int ans =fibof(n,arr);
        System.out.println(ans);
        

    }

   
}