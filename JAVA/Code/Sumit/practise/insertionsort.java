public class insertionsort {
    public static int[] insertSort(int arr[],int n) {
        int key;
       for (int i = 0; i < arr.length-1; i++) {
            key=arr[i+1];
        for (int j = i+1; j <=0; j--) {
            if(arr[j]>key){
                arr[j+1]=arr[j];

            }
            arr[j+1]=key;
        }
       }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        int newarr[]=insertSort(arr,5);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }

    }
}
