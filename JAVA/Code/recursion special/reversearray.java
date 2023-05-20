

public class reversearray {
    public static void dispRevArray(int arr[],int n) {
        if(n==-1){
            return;
        }
        System.out.println(arr[n]);
        dispRevArray(arr, n-1);
        




    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        
        dispRevArray(arr,4);
    }
}
