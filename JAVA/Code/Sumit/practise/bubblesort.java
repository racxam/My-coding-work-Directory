public class bubblesort {
    public static int[] bubSort(int arr[],int n) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(i);
            for (int j = 0; j < arr.length-1-i; j++) {
                System.out.print(j+" ");
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11,13,23,53};
        int newarr[]=bubSort(arr,8);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }

    }
}
