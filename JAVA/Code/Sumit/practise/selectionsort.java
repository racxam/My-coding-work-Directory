public class selectionsort {
    public static int[] selSort(int arr[],int n) {
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            // int temp;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;


                    
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            


            
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        int newarr[]=selSort(arr,5);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }

    }
}
