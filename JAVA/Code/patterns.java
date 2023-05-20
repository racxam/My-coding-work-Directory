import java.lang.reflect.Method;
import java.util.*;

import javax.lang.model.element.Element;
import javax.sound.midi.Soundbank;
public class patterns {
        public static void main(String[] args) {
            // solid pattern
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *
            // * * * * *
            //method  1
            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=5;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.print("\n");
            // }
           
            
            //method  2
            // for(int i=1;i<=4;i++){
                
            //     System.out.println("* * * * *");
            // }
           

            //Que 2 hollow retangle
            // * * * * *
            // *       *
            // *       *
            // * * * * *

            //only method i know

            // for (int i = 1; i<= 4; i++) {
            //         for (int j = 1; j<= 5; j++) {
            //             if(i==1 || i==4||j==1||j==5){
            //                 System.out.print("*");
            //             }
            //             else{
            //                 System.out.print(" ");
            //             }
                       
            //         }
            //         System.out.print("\n");
            // }


        //question 3--half pyramid
        //*
        //** 
        //*** 
        //**** 

    //     for (int i = 1; i<=4; i++) {
    //         for (int j = 1; j<=i; j++) {
    //            System.out.print("* ");
    //         }
    //         System.out.print("\n");
    // }
        //question 4-- inverted half pyramid
        //**** 
        //*** 
        //**
        //*
        // Method1
        // for (int i = 1; i<=4; i++) {
        //     for (int j = 4; j>=i; j--) {
        //        System.out.print("* ");
        //     }
        //     System.out.print("\n");
        //    }

        // Method2
        // for (int i = 4; i>=1; i--) {
        //     for (int j = 1; j<=i; j++) {
        //        System.out.print("* ");
        //     }
        //     System.out.print("\n");
        //    }
      

        //inverted half pyramid with 180 degree rotation
        //   * 
        //  ** 
        // *** 
        //**** 
        // method 1

        // for (int i = 1; i<=4; i++) {
        //     for (int j = 1; j<=4; j++) {
        //         if(j<=((4-i))){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.print("\n");
        //    }
        
        //method 2
        // for (int i = 1; i<=4; i++) {
        //     for (int j = 1; j<=(4-i); j++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int k = 1; k<=(i); k++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.print("\n");
        //    }

        //half pyramid with numbers
        // 1
        // 12
        // 123
        // 1234
        // 12345
        //method 1
        // for (int i = 1; i<=5; i++) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.print("\n");
        //    }
        
        //next , inverted half pyramid with numbers
        // 12345
        // 1234
        // 123
        // 12
        // 1
        //method 1
        // for (int i = 5; i>=1; i--) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        //    }

        //method 2
        // for (int i = 1; i<=5; i++) {
        //     for (int j = 1; j<=(5-i+1); j++) {
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        //    }
        
      //next que-- flyod's triangle
    //   1
    //   2  3
    //   4  5   6
    //   7  8   9 10
    //   11 12 13 14  15
        // int n=1;
        // for (int i = 1; i<=5; i++) {
        //     for (int j = 1; j<=i; j++) {
        //         if(n<=9){

        //             System.out.print("0"+n+" ");
        //             n++;
        //         }
        //         else{
        //             System.out.print(n+" ");
        //             n++;

        //         }
        //     }
        //     System.out.print("\n");
        //    }


        // --------next ques  0-1 triangle
        // 1
        // 0 1
        // 0 1 0
        // 1 0 1 0
        // 1 0 1 0 1


        // method 1

        // int n=1;
        // int store=0;
        // for (int i = 1; i <=5; i++) {

        //     for (int j = 1; j <=i; j++) {
        //         if(store==1){
        //             n=0;
        //             System.out.print(n);
        //             store=n;
        //         }
        //         else{
        //             n=1;
        //             System.out.print(n);
        //             store=n;

        //         }
                


        //     }
        //     System.out.print("\n");
        // }


        //method 2

        // for (int i = 1; i <=5; i++) {

        //     for (int j = 1; j <=i; j++) {
        //        if((i+j)%2==0){
        //         System.out.print("1");
        //        }
        //        else{
        //         System.out.print("0");
        //        }
                


        //     }
        //     System.out.print("\n");
        // }

        //Advanced patterns 
        //1. butterfly pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
        //    for (int i = 1; i <=2*4; i++) {
        //     if(i<=4){

        //         for (int j = 1; j <=8; j++) {
        //             if(j<=i|| j>=(9-i)){

        //                 System.out.print("*" );
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //          }

                 
        //     }
        //     else{
        //         for (int j = 1; j <=(8); j++) {
        //             if(j<=(8-i+1)||j>=(i)){

        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //          }

        //     }
        //      System.out.print("\n");
             
        // }


    // second advanced problem is solid rhombus
    // n=5
//      *****
//     *****
//    *****
//   *****
//  *****

    //   for (int i = 1; i <=5; i++) {
    //      for (int j = 1; j <=((2*5)-i); j++) {
    //         if(j<=(5-i)){
    //             System.out.print(" ");
    //         }
    //         else{
    //             System.out.print("*");
    //         }
    //      }
    //         System.out.print("\n");
    //     }



// next third advanced problem Number pyramid
// for (int i = 1; i <=5; i++) {
//     for (int j = 1; j <=((5-1)+i); j++) {
//        if(j<=(5-i)){
//            System.out.print(" ");
//        }
//        else{
//            System.out.print(i+" ");
//            j=j+1;


//        }

//     }
//        System.out.print("\n");
//    }

//next advanced question is palidromic triangle
//     1
//    212
//   32123
//  4321234
// 543212345
// for (int i = 1; i <=5; i++) {
//     for (int j = 1; j <=((4)+i); j++) {
//       if(j<=(5-i)){
//         System.out.print(" ");
//       }
//       else {
//         if(j<=5)
//         System.out.print(6-j);
        
//         else{
//               System.out.print(j-4);
    
//           }
//     }
//     }
//        System.out.print("\n");
//    }


// next advanced question of Diamond
       for (int i = 1; i <=8; i++) {
           if(i<=4){

           
           for (int j = 1; j <=(3+i); j++) {
                
                if(j<=(4-i)){
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print("*");
                }
            }
        
        }
        else{
            for (int j = 1; j <=(8-(i-4)); j++) {
                
                if(j<(i-4)){
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print("*");
                }
            }
        


        }

          

            
          
    
    
        System.out.print("\n");
           }
    
        }
       }



        //ending of main

        

