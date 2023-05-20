//1 2 3 4 5

import java.util.*;
public class accha {
    public static int maxOfArr(int arr[],int ind) {
        int max=arr[0];//1
        for (int i = 0; i < arr.length; i++) { //1
          if(arr[i]>max){
            max=arr[i];
          }
       }
       return max;

    }
    public static void main(String[] args) {
        // int arr[]={10,20,440,40,50};
        Scanner o= new Scanner(System.in);
        System.out.println("Enter the size of the array!!");
        int n=o.nextInt();
        int arr[]=new int[n];
      for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the "+(i+1)+"th element ");
        arr[i]=o.nextInt();
      }
       int ans= maxOfArr(arr, 0);
       System.out.print("[");
       for (int j = 0; j < arr.length; j++) {
           System.out.print(arr[j]+" ");
        }
        System.out.print("]");
       System.out.println();
       System.out.println("The maximum element of the array is "+ans);
    }
}
