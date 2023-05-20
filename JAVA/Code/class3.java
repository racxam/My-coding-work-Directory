// import java.net.SocketTimeoutException;
// import java.util.*;
// class class3{
//     public static void main(String[] args) {
//         System.out.println("Enter any no 1.: ");
//         Scanner obj= new Scanner(System.in);
//         int first= obj.nextInt();
//         System.out.println("Enter any no 2.: ");

//         int sec= obj.nextInt();

//         if(first==sec){
//             System.out.println("Both are equal");

//         }


//         else if(first>sec){
//                 System.out.print(first+" is greater than"+ sec);
                
                
                
//             }
//             else{
//                 System.out.println(sec +" is greater than " +first);
//             }
            


//     }
// }

import java.util.*;
class class3{
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter any no.");
        int num1= obj.nextInt();
        System.out.println("Enter any no.");
        int num2= obj.nextInt();
        System.out.println("Enter the name of operation like + - * % /");
        String button= obj.next();
        switch (button) {
            case "+":
                  System.out.println("Addition is :"+(num1+num2));
                
                break;
            case "-":
            System.out.println("Substraion is: "+(num1-num2));
            break;
            case "*":
            System.out.println("Multiplicaton is: "+(num1*num2));
            break;
            case "/":
            System.out.println("Division is: "+(num1/num2));
            break;
            case "%":
            System.out.println("Reminder is : "+(num1%num2        ));
            break;
            default:
            System.out.println("Choose correct option");
                break;
        }

    }
    
}