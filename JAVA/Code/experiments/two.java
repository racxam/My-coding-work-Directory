// fibo series using iterativa and recursive appoarch
// 1 1 2 3 5 8.....
import java.util.*;
public class two{
    //         static int even=2;
    //         static int odd=1;
    // public static int fiboItr(int age) {
    //     //iteration
    //     int f=1,s=1;
    //     int next;
    //     int send=-1;
       
    //     if(age<=0||age>150){
    //         return 0;
    //     }
    //     else if(age==1){
    //         return 1;
    //     }
    //     else{

        
    //     int i=0;
    //     while(i<=10){
    //         next=f+s;
    //         if(next==age){
    //             send=1;
    //             break;
    //         }
    //         f=s;//1
    //         s=next;//2
    //         i++;
    //      }}

    //     return send;
    // }
    public static int fiboRec(int n) {
        if(n==1||n==2){
            return 1;
        }
        
        return fiboRec(n-1)+fiboRec(n-2);
    }
    public static void main(String[] args) {
        
        // while(true){
            
            
            Scanner o=new Scanner(System.in);
            System.out.println("Enter the position you want in fibonacci series");
            int pos=o.nextInt();
            

            // int val1= fiboItr(age);
               int val2= fiboRec(pos);
               System.out.println("The value at "+pos+" is = "+val2);

            

            // if(val1==1){
            //     System.out.println("Your room no is even and - "+ even);
            //     even=even+2;

            // }
            // else{
            //     System.out.println("Your room no. is odd and - "+ odd);
            //     odd=odd+2;
            // }
            // if(even>=101||odd>=101){
            //     System.out.println("All rooms are booked");
            //     break;
            // }
            // int end;
            // System.out.println();
            // System.out.println("To end this program enter 0 ");
            // end=o.nextInt();
            // if(end==0){
            //     break;
            // }
            // else{
            //     System.out.println("you're continued");
            // }
            
            // o.close();


    //    System.out.println(val2);
        }
    }
