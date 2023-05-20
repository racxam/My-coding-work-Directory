// import java.util.*;
// public class class5_quiz2 {
//     public static void main(String[] args) {
//         System.out.println("Enter the no you want table of: ");
//         Scanner obj= new Scanner(System.in);
//         int t= obj.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(t+" x "+i+"="+(t*i));
//         }
//     }
// }

//que2
// import java.util.*;
// public class class5_quiz2 {
//     public static void main(String[] args) {
//         System.out.println("Enter the no uptil you want print the even ");
//         Scanner obj= new Scanner(System.in);
//         int t= obj.nextInt();
//         for(int i=0;i<=t;i=i+2){
//             if(i%2==0){

//                 System.out.println(i);
//             }
//         }
//     }
// }

//que 3
// public class class5_quiz2 {
//         public static void main(String[] args) {
    
//     for(; ;) {
//         System.out.println("Apna College");
//     }
// }
    
// }

// que 4
// import java.util.*;
// public class class5_quiz2 {
//         public static void main(String[] args) {

        
//         while (true) {
//             System.out.println("choose 0 or 1");
//             Scanner obj= new Scanner(System.in);
//             int n= obj.nextInt();
//             if(n==0){
//                 System.out.println("thank you");
//                 break;
//             }
//             if(n==1){
//                 System.out.println("Enter marks");
//                 int num= obj.nextInt();
//                 if ( (num>=90)) {

//                         System.out.println("That's good guru!!");}
                        

//                     else if (num>=60 && num<=89){

//                         System.out.println("That's also good guru!!");
//                     }
                        


//                     else if(num<=59 && num>=0){

//                         System.out.println("That's good as well guru!!");
//                     }
                        

                
//                     else{

//                         System.out.println("Check you input");
//                     }

//                 }
//             }

            
            
//         }
// }
    

//que next
import java.util.*;
public class class5_quiz2 {
        public static void main(String[] args) {
            System.out.println("Enter any no then i will tell you if it's prime or not");
            int n,Check;
            Check=0;
            Scanner o= new Scanner(System.in);
            n= o.nextInt();
            if(n>1){
                for(int i=2;i<=(n/2);i++){
                    if(n%i==0){
                        
                        Check++;
                        break;
                    }

                }
                if (Check==1) {
                    System.out.println("not prime");
                } else {
                    System.out.println("prime");
                    
                }
            }
            else{
                System.out.println("not prime");

            }
            
        

    
  
}
    
}