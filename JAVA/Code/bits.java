import java.util.*;
import java.util.concurrent.CountDownLatch;
public class bits{

    public static void main(String[] args) {

         // forGET BIT
        // int n=5;
        // int pos=2;
        // int bitMask=1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("The bit at position "+pos+" is 0");
        // }
        // else{
        //     System.out.println("The bit at position "+pos+" is 1");

        // }

        //  // forSET BIT
        //  int n=5;
        //  int pos=1;
        //  int bitMask= 1<<pos;
        //  int setbit= bitMask|n;
        //  System.out.println("The set bit is "+ setbit);

        // For GET BIT
        // int n=5;
        // int pos=2;
        // int bitMask =1<<pos;
        // int notbitMask= (~bitMask);
        // int newNumber= (notbitMask & n);
        // System.out.println("rEsult of get bit is "+newNumber) ;

        //For Updation of BIT
        Scanner o= new Scanner(System.in);
        int n=5;
        int pos=1;
        System.out.println("enter the value for updation purpose tell us 0 or 1");
        int toupdate=o.nextInt();
        if(toupdate==0){
         int smartBitMask= ~(1<<pos);
         int newNumber= smartBitMask&n;
         System.out.println("The Updated value is "+newNumber);
        }
        else if(toupdate==1){
            int normalBitmask= 1<<pos;
            int newN= normalBitmask | n;
            System.out.println("The updated value is "+newN);
        }
        else
        {
            System.out.println("Plese re enter the corrent value among 0 or 1");
        }





    }
}