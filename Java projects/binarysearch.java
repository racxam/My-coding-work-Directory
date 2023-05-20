import java.util.*;

public class binarysearch {
    public static int bsearch(int arr[],int key,int low,int high) {
      if(high>=low){

      
        int mid=low+(high-low)/2;
        if(key==arr[mid]){
            return mid;
        }
        else if (key<arr[mid]){
            return bsearch(arr, key,low, mid-1);
        }
        else if(key>arr[mid]){
            return bsearch(arr, key,mid+1,high);
        }
    }


        return -1;

        
    }
    public static int[] sort(int arr[]) {
        int small;
        for (int i = 0; i < arr.length; i++) {
            small=i;
            int temp;
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[j]<arr[small]){
                    small=j;


                }
            }
            temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;

            
        }
        return arr;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
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
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]= new int[len];
       arr= arraycreation(len,arr);
    

        int key;
        
        
        printarr(arr);
        arr=sort(arr);
        System.out.println("\n here is sorted array\n");
        printarr(arr);
        System.out.println("Enter the element you want to search for ");
        key= sc.nextInt();
        
        int high=arr.length-1;
        int low=0;
        
        int ans=bsearch(arr,key,low, high);
        if(ans==-1){
            System.out.println("The element you've searched is not present here");
        }
        else{

            System.out.println("The index of the array is :  "+ans);
        }
        sc.close();
        
    }
}
