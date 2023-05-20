import java.util.Scanner;

public class iterativebSearch{
    public static int bs(int []arr, int key, int len){
        int l=0;
        int h=len-1;
        int ind=-1;
        int mid ;
        while(l<=h){
            mid =l+(h-l)/2;

            if(arr[mid]==key){
                ind=mid;
                break;
                
            }
            else if(arr[mid]>key){
                h=mid-1;


            }
            else {
                l=mid+1;
            }
            
                
                
            
        }
        return ind;
    }
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the key for the array");
        Scanner sc= new Scanner(System.in);
        int key= sc.nextInt();

        int ind= bs(arr,key,9);

        if(ind!=-1){
            System.out.println("The indes of key element "+key+" is  :"+ind) ;
        }
        else{
            System.out.println("Not found in this array");
        }
    }
}