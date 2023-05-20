
import java.util.*;
public class quicksort {

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] arraycreation(int len,int arr[]) {
        
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter the array at index "+i);
            Scanner o= new Scanner(System.in);
            arr[i]=o.nextInt();

        }
        return arr;
        
    }  

    public static int partition(int arr[],int l ,int h){
        int pivot=arr[l];
        int i=l+1;
        int j=h;
        int temp;
        
        while(i<j){

            while(arr[i]<pivot && i<=h-1){


                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            
        }

        

            temp = arr[l];
            arr[l] =arr[j];
            arr[j] = temp;
            
            return j;
    }
    public static void Qsort(int arr[],int l ,int h){
        int pivot;
        if(l<h){
          pivot=partition(arr,l,h);
          Qsort(arr,l,pivot-1);
          Qsort(arr,pivot+1,h);
        }
    }
   
    public static void main(String[] args) {
        System.out.println("This is Quick Sort Algorithm");
        System.out.println("Enter the length of array");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]= new int[len];
        arr= arraycreation(len,arr);
        
        System.out.println("Your Unsorted Array is: ");
        printarr(arr);
       
        Qsort(arr,0,arr.length-1);
        System.out.println("Your sorted array is :");
        for (int j = 0; j < arr.length; j++) {
            
            System.out.print(arr[j]+" ");
        }
    }
    }

