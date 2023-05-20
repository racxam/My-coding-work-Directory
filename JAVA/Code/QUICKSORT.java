public class QUICKSORT {
    
    public static int partition(int arr[],int low, int high) {
        int pivot= arr[high];
        int i=low-1;
        for (int j = low; j <=high; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }}
       

        return i;


        
    }
    public static void quicksort(int arr[],int low,int high) {
        if(low<high){
            int pi= partition(arr,low,high);//pivot index//c
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
         }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};//c
        int n=arr.length;//c
        quicksort(arr,0,n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
