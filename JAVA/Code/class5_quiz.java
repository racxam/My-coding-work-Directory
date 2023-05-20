import java.util.*;

;
public class class5_quiz {
        public static void main(String[] args) {
            System.out.println("Enter the no of first natural no's you want sum of");
            Scanner obj= new Scanner(System.in);
            int n= obj.nextInt();
            //actually i have two ways to do this
            //loop
            // int add=0;
            // for(int i=1;i<=n;i++){
            //     add=add+i;
                
            // }
            // System.out.println("The sum of first "+n+" natural no's is "+add);

            //second way to go further
            int sum= (n*(n+1)/2);
            System.out.println("The sum of first "+n+" natural no's is "+ sum);


        }
}
