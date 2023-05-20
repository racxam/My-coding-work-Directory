

public class DisplayArray {
    public static void dispArray(int arr[],int n) {
        if(n==5){
            return;
        }
     System.out.println(arr[n]);
     dispArray(arr, n+1);





    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        
        dispArray(arr,0);
    }
}
